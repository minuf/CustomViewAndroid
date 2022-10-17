package com.example.customcardsample.ui.main

import androidx.lifecycle.ViewModel
import com.example.customcardsample.model.Card
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel : ViewModel() {

    private val _cards = MutableStateFlow<List<Card>>(emptyList())
    val cards: StateFlow<List<Card>> = _cards

    init {
        _cards.value += listOf(Card(), Card(), Card(), Card())
    }
}