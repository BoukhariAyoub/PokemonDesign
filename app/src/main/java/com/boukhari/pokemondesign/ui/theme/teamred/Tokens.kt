package com.boukhari.pokemondesign.ui.theme.teamred

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

val PokemonRedTextTokens = TextTokens(
    headings = DefaultPokemonTypography.headingMD,
    body = DefaultPokemonTypography.bodyMD,
    action = DefaultPokemonTypography.bodySM.copy(color = PokemonRedColors.onPrimary),
    disabled = DefaultPokemonTypography.bodyMD.copy(color = Color.Gray),
    highlight = DefaultPokemonTypography.bodyMD.copy(textDecoration = TextDecoration.Underline),
    information = DefaultPokemonTypography.bodyMD.copy(color = PokemonRedColors.information.main),
    warning = DefaultPokemonTypography.bodyMD.copy(color = PokemonRedColors.secondary.light),
    error = DefaultPokemonTypography.bodyMD.copy(color = PokemonRedColors.error.main),
    onAction = DefaultPokemonTypography.bodyMD.copy(color = Color.White),
    onDisabled = DefaultPokemonTypography.bodyMD.copy(color = Color.LightGray),
    actionHover = DefaultPokemonTypography.bodyMD.copy(color = PokemonRedColors.primary.dark),
    success = DefaultPokemonTypography.bodyMD.copy(color = Color.Green)
)

val PokemonRedIconTokens = IconTokens(
    primary = PokemonRedColors.primary.main,
    information = PokemonRedColors.information.main,
    success = PokemonRedColors.information.dark,
    warning = PokemonRedColors.error.light,
    error = PokemonRedColors.error.main
)

val PokemonRedSurfaceTokens = SurfaceTokens(
    page = Color.White,
    primary = PokemonRedColors.primary.main,
    secondary = PokemonRedColors.secondary.main,
    error = PokemonRedColors.error.main,
    warning = PokemonRedColors.error.light,
    information = PokemonRedColors.information.main,
    success = PokemonRedColors.information.dark,
    disabled = Color.LightGray,
    highlight = PokemonRedColors.secondary.light,
    action1 = PokemonRedColors.primary.main,
    action1Hover = PokemonRedColors.primary.dark,
    action2 = PokemonRedColors.secondary.main,
    action2Hover = PokemonRedColors.secondary.dark,
    modal = Color.DarkGray
)

val PokemonRedSpacingTokens = SpacingTokens(
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

val PokemonRedTokens = ThemeTokens(
    text = PokemonRedTextTokens,
    icon = PokemonRedIconTokens,
    surface = PokemonRedSurfaceTokens,
    spacing = PokemonRedSpacingTokens
)
