package com.example.customcardsample.ui

import com.example.customcardsample.model.card.CardNumber
import com.example.customcardsample.model.card.CardStatus

data class CustomCardData(
    val name: String,
    val type: String,
    val number: CardNumber,
    val hiddenNumber: String,
    val titular: Boolean,
    val thumbnail: String,
    val limit: String,
    var disposed: String,
    var currentBalance: Int,
    var maxBalance: Int,
    var available: String,
    var status: CardStatus,
    var optionsListener: () -> Unit,
    var activationToggleListener: (Boolean) -> Unit,
    var controlListener: () -> Unit
)