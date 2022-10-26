package com.example.customcardsample.ui

import com.example.customcardsample.model.card.CardNumber
import com.example.customcardsample.model.card.CardStatus
import com.example.customcardsample.model.card.CardType

data class CustomCardData(
    val name: String,
    val type: CardType,
    val number: CardNumber,
    val hiddenNumber: String,
    val titular: Boolean,
    val thumbnail: String,
    val limit: Double,
    var disposed: Double,
    var available: Double,
    var status: CardStatus,
    var optionsListener: () -> Unit,
    var activationToggleListener: (Boolean) -> Unit,
    var controlListener: () -> Unit
)