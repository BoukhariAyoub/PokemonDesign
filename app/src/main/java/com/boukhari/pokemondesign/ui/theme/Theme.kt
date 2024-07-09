package com.boukhari.pokemondesign.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import com.boukhari.pokemondesign.ui.theme.base.ThemeTokens
import com.boukhari.pokemondesign.ui.theme.teamblue.PokemonBlueTokens
import com.boukhari.pokemondesign.ui.theme.teamred.PokemonRedTokens

// Define a local provider for theme tokens
private val LocalThemeTokens = staticCompositionLocalOf { PokemonRedTokens }


@Composable
fun PokemonRedTheme(
    content: @Composable () -> Unit
) {
    PokemonTheme(isRedTheme = true, content = content)
}

@Composable
fun PokemonBlueTheme(
    content: @Composable () -> Unit
) {
    PokemonTheme(isRedTheme = false, content = content)
}

@Composable
private fun PokemonTheme(
    isRedTheme: Boolean = true,
    content: @Composable () -> Unit
) {
    val tokens = if (isRedTheme) {
        PokemonRedTokens
    } else {
        PokemonBlueTokens
    }

    CompositionLocalProvider(LocalThemeTokens provides tokens) {
        content()
    }
}

object PokemonThemeTokens {
    val current: ThemeTokens
        @Composable
        get() = LocalThemeTokens.current
}
