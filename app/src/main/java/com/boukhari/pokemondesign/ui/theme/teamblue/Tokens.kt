package com.boukhari.pokemondesign.ui.theme.teamblue

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextDecoration
import com.boukhari.pokemondesign.ui.theme.DefaultPokemonTypography
import com.boukhari.pokemondesign.ui.theme.base.IconTokens
import com.boukhari.pokemondesign.ui.theme.base.SpacingL
import com.boukhari.pokemondesign.ui.theme.base.SpacingM
import com.boukhari.pokemondesign.ui.theme.base.SpacingS
import com.boukhari.pokemondesign.ui.theme.base.SpacingTokens
import com.boukhari.pokemondesign.ui.theme.base.SpacingXL
import com.boukhari.pokemondesign.ui.theme.base.SpacingXS
import com.boukhari.pokemondesign.ui.theme.base.SpacingXXL
import com.boukhari.pokemondesign.ui.theme.base.SpacingXXS
import com.boukhari.pokemondesign.ui.theme.base.SpacingXXXL
import com.boukhari.pokemondesign.ui.theme.base.SpacingXXXS
import com.boukhari.pokemondesign.ui.theme.base.SurfaceTokens
import com.boukhari.pokemondesign.ui.theme.base.TextTokens
import com.boukhari.pokemondesign.ui.theme.base.ThemeTokens

val PokemonBlueTextTokens = TextTokens(
    headings = DefaultPokemonTypography.headingMD,
    body = DefaultPokemonTypography.bodyMD,
    action = DefaultPokemonTypography.bodySM.copy(color = PokemonBlueColors.onPrimary),
    disabled = DefaultPokemonTypography.bodyMD.copy(color = Color.Gray),
    highlight = DefaultPokemonTypography.bodyMD.copy(textDecoration = TextDecoration.Underline),
    information = DefaultPokemonTypography.bodyMD.copy(color = PokemonBlueColors.information.main),
    warning = DefaultPokemonTypography.bodyMD.copy(color = PokemonBlueColors.secondary.light),
    error = DefaultPokemonTypography.bodyMD.copy(color = PokemonBlueColors.error.main),
    onAction = DefaultPokemonTypography.bodyMD.copy(color = PokemonBlueColors.onPrimary),
    onDisabled = DefaultPokemonTypography.bodyMD.copy(color = Color.LightGray),
    actionHover = DefaultPokemonTypography.bodyMD.copy(color = PokemonBlueColors.primary.dark),
    success = DefaultPokemonTypography.bodyMD.copy(color = Color.Green)
)

val PokemonBlueIconTokens = IconTokens(
    primary = PokemonBlueColors.primary.main,
    information = PokemonBlueColors.information.main,
    success = PokemonBlueColors.information.dark,
    warning = PokemonBlueColors.error.light,
    error = PokemonBlueColors.error.main
)

val PokemonBlueSurfaceTokens = SurfaceTokens(
    page = Color.White,
    primary = PokemonBlueColors.primary.main,
    secondary = PokemonBlueColors.secondary.main,
    error = PokemonBlueColors.error.main,
    warning = PokemonBlueColors.error.light,
    information = PokemonBlueColors.information.main,
    success = PokemonBlueColors.information.dark,
    disabled = Color.LightGray,
    highlight = PokemonBlueColors.secondary.light,
    action1 = PokemonBlueColors.primary.main,
    action1Hover = PokemonBlueColors.primary.dark,
    action2 = PokemonBlueColors.secondary.main,
    action2Hover = PokemonBlueColors.secondary.dark,
    modal = Color.DarkGray
)

val PokemonBlueSpacingTokens = SpacingTokens(
    xxxs = SpacingXXXS,
    xxs = SpacingXXS,
    xs = SpacingXS,
    s = SpacingS,
    m = SpacingM,
    l = SpacingL,
    xl = SpacingXL,
    xxl = SpacingXXL,
    xxxl = SpacingXXXL
)

val PokemonBlueTokens = ThemeTokens(
    text = PokemonBlueTextTokens,
    icon = PokemonBlueIconTokens,
    surface = PokemonBlueSurfaceTokens,
    spacing = PokemonBlueSpacingTokens
)


