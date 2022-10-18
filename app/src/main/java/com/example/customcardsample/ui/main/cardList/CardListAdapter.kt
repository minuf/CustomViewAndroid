package com.example.customcardsample.ui.main.cardList

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.customcardsample.databinding.ViewCustomCardBinding
import com.example.customcardsample.model.card.Card

class CardListAdapter : ListAdapter<Card, CardViewHolder>(CardDiffUtilCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val binding = ViewCustomCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }

}