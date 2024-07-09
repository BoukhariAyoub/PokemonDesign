package com.boukhari.pokemondesign.ui.theme.base

import androidx.compose.ui.graphics.Color

// Red shades
val Red100 = Color(0xFFFFCDD2)
val Red200 = Color(0xFFEF9A9A)
val Red300 = Color(0xFFE57373)
val Red400 = Color(0xFFEF5350)
val Red500 = Color(0xFFF44336)
val Red600 = Color(0xFFE53935)
val Red700 = Color(0xFFD32F2F)
val Red800 = Color(0xFFC62828)
val Red900 = Color(0xFFB71C1C)

// Blue shades
val Blue100 = Color(0xFFBBDEFB)
val Blue200 = Color(0xFF90CAF9)
val Blue300 = Color(0xFF64B5F6)
val Blue400 = Color(0xFF42A5F5)
val Blue500 = Color(0xFF2196F3)
val Blue600 = Color(0xFF1E88E5)
val Blue700 = Color(0xFF1976D2)
val Blue800 = Color(0xFF1565C0)
val Blue900 = Color(0xFF0D47A1)

// Common colors
val White = Color(0xFFFFFFFF)
val Black = Color(0xFF000000)
val Gray = Color(0xFF808080)
val LightGray = Color(0xFFD3D3D3)
val DarkGray = Color(0xFFA9A9A9)
val Green = Color(0xFF4CAF50)
val GreenLight = Color(0xFFC8E6C9)
val GreenDark = Color(0xFF388E3C)
val Yellow = Color(0xFFFFEB3B)
val YellowLight = Color(0xFFFFF9C4)
val YellowDark = Color(0xFFFBC02D)

data class VariantColor(
    val lighter: Color,
    val light: Color,
    val main: Color,
    val dark: Color,
    val darker: Color
)

data class PokemonThemeColors(
    val primary: VariantColor,
    val onPrimary: Color,
    val secondary: VariantColor,
    val information: VariantColor,
    val error: VariantColor
)