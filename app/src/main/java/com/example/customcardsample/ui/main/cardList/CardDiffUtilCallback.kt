package com.example.customcardsample.ui.main.cardList

import androidx.recyclerview.widget.DiffUtil
import com.example.customcardsample.model.card.Card
import com.example.customcardsample.ui.CustomCardData

object CardDiffUtilCallback : DiffUtil.ItemCallback<CustomCardData>() {
    override fun areItemsTheSame(oldItem: CustomCardData, newItem: CustomCardData): Boolean =
        oldItem.number == newItem.number

    override fun areContentsTheSame(oldItem: CustomCardData, newItem: CustomCardData): Boolean =
        oldItem == newItem
}
