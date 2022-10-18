package com.example.customcardsample.ui.main

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.customcardsample.databinding.ViewCustomCardBinding
import com.example.customcardsample.model.card.Card

class CustomCard @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : ConstraintLayout(context, attrs) {

    private val binding: ViewCustomCardBinding

    init {
        binding = ViewCustomCardBinding.inflate(LayoutInflater.from(context), this, false)
    }

    fun setCard(card: Card) {
        binding.card = card
    }
}