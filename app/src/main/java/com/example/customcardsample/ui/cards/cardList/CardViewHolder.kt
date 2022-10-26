package com.example.customcardsample.ui.cards.cardList

import androidx.recyclerview.widget.RecyclerView
import com.example.customcardsample.databinding.ItemCardBinding
import com.example.customcardsample.ui.model.CustomCardData

class CardViewHolder(private val binding: ItemCardBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(card: CustomCardData) {
        binding.card = card
    }
}