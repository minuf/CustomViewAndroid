package com.example.customcardsample.ui

import android.widget.Toast
import androidx.appcompat.widget.AppCompatImageButton
import androidx.appcompat.widget.AppCompatToggleButton
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.customcardsample.model.card.Card
import com.example.customcardsample.ui.main.cardList.CardListAdapter

@BindingAdapter("data")
fun setRecyclerViewProperties(recyclerView: RecyclerView, data: List<Card>) {
    val adapter = recyclerView.adapter
    if (adapter is CardListAdapter) {
        adapter.submitList(data)
    }
}

@BindingAdapter("toggleListener")
fun onCardToggledOnOff(toggleButton: AppCompatToggleButton, card: Card) {
    toggleButton.setOnClickListener {
        Toast.makeText(toggleButton.context, "${toggleButton.isChecked}", Toast.LENGTH_LONG).show()
    }
}

@BindingAdapter("cardControlListener")
fun onCardControlClick(imageButton: AppCompatImageButton, card: Card) {
    imageButton.setOnClickListener {
        Toast.makeText(imageButton.context, "Card Control", Toast.LENGTH_LONG).show()
    }
}

@BindingAdapter("cardOptionsListener")
fun onCardOptionsClick(imageButton: AppCompatImageButton, card: Card) {
    imageButton.setOnClickListener {
        Toast.makeText(imageButton.context, "Card options", Toast.LENGTH_LONG).show()
    }
}