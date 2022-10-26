package com.example.customcardsample.ui.main

import androidx.lifecycle.ViewModel
import com.example.customcardsample.model.card.Card
import com.example.customcardsample.model.card.CardNumber
import com.example.customcardsample.ui.CustomCardData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {

    private val _cards = MutableStateFlow<List<CustomCardData>>(emptyList())
    val cards = _cards.asStateFlow()

    private val _currentListenerState = MutableStateFlow<ListenerState>(ListenerState.Initial)
    val currentListenerState = _currentListenerState.asStateFlow()

    private val optionsListener = {
        _currentListenerState.value = ListenerState.Options
    }

    private val activationToggleListener: (Boolean) -> Unit = {
        _currentListenerState.value = ListenerState.Activation("$it")
    }

    private fun controlListener(number: Long): () -> Unit = {
        _currentListenerState.value = ListenerState.Control("CONTROL $number")
    }

    fun resetListenerState() {
        _currentListenerState.value = ListenerState.Initial
    }

    fun fetchCards() {
        _cards.value = fakeGetCardsUseCase().map {
            it.toCustomCardData(
                optionsListener = optionsListener,
                activationToggleListener = activationToggleListener,
                controlListener = controlListener(it.number.value)
            )
        }
    }

    private fun fakeGetCardsUseCase(): List<Card> {
        return listOf(
            Card(),
            Card(
                number = CardNumber(1234567812341234),
                limit = 1000.00,
                titular = false,
                name = "MasterCard"
            )
        )
    }

    private fun Card.toCustomCardData(
        optionsListener: () -> Unit,
        activationToggleListener: (Boolean) -> Unit,
        controlListener: () -> Unit
    ): CustomCardData {
        return CustomCardData(
            name,
            type.toString(),
            number,
            hiddenNumber,
            titular,
            thumbnail,
            String.format("%.2f", limit),
            String.format("%.2f", disposed),
            disposed.toInt(),
            limit.toInt(),
            String.format("%.2f", available),
            status,
            optionsListener,
            activationToggleListener,
            controlListener
        )
    }
}

sealed class ListenerState {
    object Initial : ListenerState()
    object Options : ListenerState()
    data class Activation(val message: String) : ListenerState()
    data class Control(val message: String) : ListenerState()
}