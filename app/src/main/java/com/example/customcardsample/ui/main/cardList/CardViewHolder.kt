package com.example.customcardsample.ui.main.cardList

import androidx.recyclerview.widget.RecyclerView
import com.example.customcardsample.databinding.ItemCardBinding
import com.example.customcardsample.databinding.ViewCustomCardBinding
import com.example.customcardsample.model.card.Card
import com.example.customcardsample.ui.CustomCardData

class CardViewHolder(private val binding: ItemCardBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(card: CustomCardData) {
        binding.card = card
    }
}