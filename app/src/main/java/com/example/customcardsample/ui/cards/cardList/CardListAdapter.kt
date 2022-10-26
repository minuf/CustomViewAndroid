package com.example.customcardsample.ui.cards.cardList

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.customcardsample.databinding.ItemCardBinding
import com.example.customcardsample.ui.model.CustomCardData

class CardListAdapter : ListAdapter<CustomCardData, CardViewHolder>(CardDiffUtilCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val binding = ItemCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }
}

@BindingAdapter("data")
fun setRecyclerViewProperties(recyclerView: RecyclerView, data: List<CustomCardData>) {
    val adapter = recyclerView.adapter
    if (adapter is CardListAdapter) {
        adapter.submitList(data)
    }
}