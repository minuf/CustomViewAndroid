package com.example.customcardsample.ui.main.cardList

import androidx.recyclerview.widget.DiffUtil
import com.example.customcardsample.model.card.Card

object CardDiffUtilCallback : DiffUtil.ItemCallback<Card>() {
    override fun areItemsTheSame(oldItem: Card, newItem: Card): Boolean =
        oldItem.number == newItem.number

    override fun areContentsTheSame(oldItem: Card, newItem: Card): Boolean =
        oldItem == newItem
}
