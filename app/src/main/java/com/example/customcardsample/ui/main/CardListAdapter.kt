package com.example.customcardsample.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.customcardsample.databinding.ViewCustomCardBinding
import com.example.customcardsample.model.Card

class CardListAdapter : ListAdapter<Card, CardViewHolder>(CardDiffUtilCallback) {

    private lateinit var binding: ViewCustomCardBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        binding = ViewCustomCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

}