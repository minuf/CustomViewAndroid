package com.example.customcardsample.ui.main

import androidx.recyclerview.widget.DiffUtil
import com.example.customcardsample.model.Card

object CardDiffUtilCallback : DiffUtil.ItemCallback<Card>() {
    override fun areItemsTheSame(oldItem: Card, newItem: Card): Boolean =
        oldItem.number == newItem.number

    override fun areContentsTheSame(oldItem: Card, newItem: Card): Boolean =
        oldItem == newItem
}
