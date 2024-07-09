package com.boukhari.pokemondesign.ui.theme

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ThemeViewModel : ViewModel() {
    private val _isRedTheme = MutableStateFlow(true)
    val isRedTheme: StateFlow<Boolean> = _isRedTheme

    fun toggleTheme() {
        _isRedTheme.value = _isRedTheme.value != true
    }
}
