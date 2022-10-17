package com.example.customcardsample.ui.main.cardList

import androidx.recyclerview.widget.RecyclerView
import com.example.customcardsample.databinding.ViewCustomCardBinding
import com.example.customcardsample.model.card.Card

class CardViewHolder(private val binding: ViewCustomCardBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(card: Card) {
        binding.card = card
    }
}