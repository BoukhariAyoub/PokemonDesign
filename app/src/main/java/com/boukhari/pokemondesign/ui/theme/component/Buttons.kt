package com.boukhari.pokemondesign.ui.theme.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.boukhari.pokemondesign.ui.theme.PokemonBlueTheme
import com.boukhari.pokemondesign.ui.theme.PokemonRedTheme
import com.boukhari.pokemondesign.ui.theme.PokemonThemeTokens

@Composable
fun PrimaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val tokens = PokemonThemeTokens.current

    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = tokens.surface.action1,
            contentColor = tokens.text.action.color
        ),
        shape = RoundedCornerShape(8.dp),
        contentPadding = PaddingValues(16.dp),
        modifier = modifier
    ) {
        Text(text = text, style = tokens.text.action)
    }
}

@Composable
fun SecondaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val tokens = PokemonThemeTokens.current

    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = tokens.surface.action2,
            contentColor = tokens.text.action.color
        ),
        shape = RoundedCornerShape(8.dp),
        contentPadding = PaddingValues(16.dp),
        modifier = modifier
    ) {
        Text(text = text, style = tokens.text.action)
    }
}

@Composable
fun OutlinedButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val tokens = PokemonThemeTokens.current

    OutlinedButton(
        onClick = onClick,
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = tokens.surface.action1,
        ),
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(1.dp, tokens.surface.action1),
        contentPadding = PaddingValues(16.dp),
        modifier = modifier,
        enabled = false
    ) {
        Text(text = text)
    }
}

@Composable
private fun ButtonSample() {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.padding(16.dp)
    ) {
        PrimaryButton(text = "Primary Button", onClick = {})
        SecondaryButton(text = "Secondary Button", onClick = {})
        OutlinedButton(text = "Outlined Button", onClick = {})
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewButtonSampleRed() {
    PokemonBlueTheme {
        Surface {
            ButtonSample()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewButtonSampleBlue() {
    PokemonRedTheme {
        Surface {
            ButtonSample()
        }
    }
}