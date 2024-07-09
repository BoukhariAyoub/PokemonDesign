package com.boukhari.pokemondesign.ui.theme.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
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
fun PrimaryText(
    text: String,
    modifier: Modifier = Modifier
) {
    val tokens = PokemonThemeTokens.current
    Text(
        text = text,
        style = tokens.text.body,
        modifier = modifier
    )
}

@Composable
fun SecondaryText(
    text: String,
    modifier: Modifier = Modifier
) {
    val tokens = PokemonThemeTokens.current
    Text(
        text = text,
        style = tokens.text.body,
        modifier = modifier
    )
}

@Composable
private fun TextSample() {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.padding(16.dp)
    ) {
        PrimaryText(text = "Primary Text")
        SecondaryText(text = "Secondary Text")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTextSampleRed() {
    PokemonBlueTheme {
        Surface {
            TextSample()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTextSampleBlue() {
    PokemonRedTheme {
        Surface {
            TextSample()
        }
    }
}
