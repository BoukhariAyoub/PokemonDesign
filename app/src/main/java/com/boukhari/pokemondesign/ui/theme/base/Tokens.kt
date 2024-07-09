package com.boukhari.pokemondesign.ui.theme.base

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.Dp
import com.boukhari.pokemondesign.ui.theme.DefaultPokemonTypography


data class TextTokens(
    val headings: TextStyle,
    val body: TextStyle,
    val action: TextStyle,
    val disabled: TextStyle,
    val highlight: TextStyle,
    val information: TextStyle,
    val warning: TextStyle,
    val error: TextStyle,
    val onAction: TextStyle,
    val onDisabled: TextStyle,
    val actionHover: TextStyle,
    val success: TextStyle
)

data class PokemonTypography(
    val bodyXXS: TextStyle,
    val bodyXXSLink: TextStyle,
    val bodyXXSSemiBold: TextStyle,
    val bodyXS: TextStyle,
    val bodyXSLink: TextStyle,
    val bodyXSSemiBold: TextStyle,
    val bodySM: TextStyle,
    val bodySMLink: TextStyle,
    val bodySMSemiBold: TextStyle,
    val bodyMD: TextStyle,
    val bodyMDLink: TextStyle,
    val bodyMDSemiBold: TextStyle,
    val bodyLG: TextStyle,
    val bodyLGLink: TextStyle,
    val bodyLGSemiBold: TextStyle,
    val headingXXS: TextStyle,
    val headingXS: TextStyle,
    val headingSM: TextStyle,
    val headingMD: TextStyle,
    val headingLG: TextStyle,
    val headingXL: TextStyle,
    val headingHero: TextStyle
)

data class IconTokens(
    val primary: Color,
    val information: Color,
    val success: Color,
    val warning: Color,
    val error: Color
)

data class SurfaceTokens(
    val page: Color,
    val primary: Color,
    val secondary: Color,
    val error: Color,
    val warning: Color,
    val information: Color,
    val success: Color,
    val disabled: Color,
    val highlight: Color,
    val action1: Color,
    val action1Hover: Color,
    val action2: Color,
    val action2Hover: Color,
    val modal: Color
)

data class SpacingTokens(
    val xxxs: Dp,
    val xxs: Dp,
    val xs: Dp,
    val s: Dp,
    val m: Dp,
    val l: Dp,
    val xl: Dp,
    val xxl: Dp,
    val xxxl: Dp
)

data class ThemeTokens(
    val text: TextTokens,
    val icon: IconTokens,
    val surface: SurfaceTokens,
    val spacing: SpacingTokens
)
