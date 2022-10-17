package com.example.customcardsample.ui

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.customcardsample.model.Card
import com.example.customcardsample.ui.main.CardListAdapter

@BindingAdapter("data")
fun setRecyclerViewProperties(recyclerView: RecyclerView?, data: MutableList<Card>?) {
    val adapter = recyclerView?.adapter
    if (adapter is CardListAdapter && data != null) {
        adapter.submitList(data)
    }
}