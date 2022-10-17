package com.example.customcardsample.ui.main

import androidx.recyclerview.widget.RecyclerView
import com.example.customcardsample.databinding.ViewCustomCardBinding
import com.example.customcardsample.model.Card

class CardViewHolder(private val binding: ViewCustomCardBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(card: Card) {
        binding.card = card
    }
}