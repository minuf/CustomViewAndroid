package com.example.customcardsample.ui.cards.cardList

import androidx.recyclerview.widget.DiffUtil
import com.example.customcardsample.ui.model.CustomCardData

object CardDiffUtilCallback : DiffUtil.ItemCallback<CustomCardData>() {
    override fun areItemsTheSame(oldItem: CustomCardData, newItem: CustomCardData): Boolean =
        oldItem.number == newItem.number

    override fun areContentsTheSame(oldItem: CustomCardData, newItem: CustomCardData): Boolean =
        oldItem == newItem
}
