package com.boukhari.pokemondesign.ui.theme.teamblue

import androidx.compose.ui.graphics.Color
import com.boukhari.pokemondesign.ui.theme.base.Blue100
import com.boukhari.pokemondesign.ui.theme.base.Blue200
import com.boukhari.pokemondesign.ui.theme.base.Blue300
import com.boukhari.pokemondesign.ui.theme.base.Blue400
import com.boukhari.pokemondesign.ui.theme.base.Blue500
import com.boukhari.pokemondesign.ui.theme.base.Blue700
import com.boukhari.pokemondesign.ui.theme.base.Blue900
import com.boukhari.pokemondesign.ui.theme.base.Green
import com.boukhari.pokemondesign.ui.theme.base.GreenDark
import com.boukhari.pokemondesign.ui.theme.base.GreenLight
import com.boukhari.pokemondesign.ui.theme.base.PokemonThemeColors
import com.boukhari.pokemondesign.ui.theme.base.Red100
import com.boukhari.pokemondesign.ui.theme.base.Red200
import com.boukhari.pokemondesign.ui.theme.base.Red300
import com.boukhari.pokemondesign.ui.theme.base.Red400
import com.boukhari.pokemondesign.ui.theme.base.Red500
import com.boukhari.pokemondesign.ui.theme.base.Red700
import com.boukhari.pokemondesign.ui.theme.base.Red900
import com.boukhari.pokemondesign.ui.theme.base.VariantColor
import com.boukhari.pokemondesign.ui.theme.base.Yellow
import com.boukhari.pokemondesign.ui.theme.base.YellowDark
import com.boukhari.pokemondesign.ui.theme.base.YellowLight


val PokemonBlueColors = PokemonThemeColors(
    onPrimary = Color.White,
    primary = VariantColor(
        lighter = Blue100,
        light = Blue200,
        main = Blue500,
        dark = Blue700,
        darker = Blue900
    ),
    secondary = VariantColor(
        lighter = Red100,
        light = Red200,
        main = Red500,
        dark = Red700,
        darker = Red900
    ),
    information = VariantColor(
        lighter = GreenLight,
        light = Green,
        main = GreenDark,
        dark = Blue300,
        darker = Blue400
    ),
    error = VariantColor(
        lighter = YellowLight,
        light = Yellow,
        main = YellowDark,
        dark = Red300,
        darker = Red400
    )
)
