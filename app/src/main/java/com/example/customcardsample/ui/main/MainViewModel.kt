package com.example.customcardsample.ui.main

import androidx.lifecycle.ViewModel
import com.example.customcardsample.model.card.Card
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {

    private val _cards = MutableStateFlow<List<Card>>(emptyList())
    val cards = _cards.asStateFlow()

    private val _currentState = MutableStateFlow<MainState>(MainState.InitialState)
    val currentState = _currentState.asStateFlow()

    private val optionsListener = {
        _currentState.value = MainState.OptionsClick
        resetState()
    }

    private val activationToggleListener: (Boolean) -> Unit = {
        _currentState.value = MainState.ActivationClick("$it")
    }

    private val controlListener = {
        _currentState.value = MainState.ControlClick("")
        resetState()
    }

    private fun resetState() {
        _currentState.value = MainState.InitialState
    }

    init {
        _cards.value = listOf(
            Card(
                optionsListener = optionsListener,
                activationToggleListener = activationToggleListener,
                controlListener = controlListener
            ),
            Card(
                optionsListener = optionsListener,
                activationToggleListener = activationToggleListener,
                controlListener = controlListener,
                limit = 1000.00,
                titular = false,
                name = "MasterCard",
            )
        )
    }
}

sealed class MainState {
    object InitialState : MainState()
    object OptionsClick : MainState()
    data class ActivationClick(val message: String) : MainState()
    data class ControlClick(val message: String) : MainState()
}