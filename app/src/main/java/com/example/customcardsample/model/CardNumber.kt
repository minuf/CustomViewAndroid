package com.example.customcardsample.model

data class CardNumber(val value: Long) {
    private val size = 16

    init {
        if (value.toString().length != size) {
            throw CardNumberSizeException("Card number size must be 16 numeric characters")
        }
    }
}