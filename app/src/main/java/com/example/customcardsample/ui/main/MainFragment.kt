package com.example.customcardsample.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.customcardsample.databinding.FragmentMainBinding
import com.example.customcardsample.ui.main.cardList.CardListAdapter

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    private val viewModel: MainViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        binding.rvCards.layoutManager = LinearLayoutManager(requireContext())
        binding.rvCards.adapter = CardListAdapter()

        viewModel.fetchCards()

        lifecycleScope.launchWhenCreated {
            viewModel.currentListenerState.collect {
                it.process()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun ListenerState.process() = when (this) {
        ListenerState.Initial -> Unit
        ListenerState.Options -> {
            Toast.makeText(
                this@MainFragment.requireContext(),
                "OPTIONS CLICKED",
                Toast.LENGTH_LONG
            ).show()
            viewModel.resetListenerState()
        }
        is ListenerState.Control -> {
            Toast.makeText(
                this@MainFragment.requireContext(),
                message,
                Toast.LENGTH_LONG
            ).show()
            viewModel.resetListenerState()
        }
        is ListenerState.Activation -> Toast.makeText(
            this@MainFragment.requireContext(),
            message, Toast.LENGTH_LONG
        ).show()
    }
}