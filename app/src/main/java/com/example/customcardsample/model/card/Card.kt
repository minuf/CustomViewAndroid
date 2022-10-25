package com.example.customcardsample.model.card

data class Card(
    val name: String = "Credit Visa",
    val type: CardType = CardType.CREDIT,
    val number: CardNumber = CardNumber(1234567812345678),
    val hiddenNumber: String = "...${number.value.toString().substring(12, 16)}",
    val titular: Boolean = true,
    val thumbnail: String = "",
    val limit: Double = 20000.00,
    var disposed: Double = 1000.00,
    var available: Double = (limit - disposed),
    var status: CardStatus = CardStatus.ON,
    var optionsListener: () -> Unit,
    var activationToggleListener: (Boolean) -> Unit,
    var controlListener: () -> Unit
)