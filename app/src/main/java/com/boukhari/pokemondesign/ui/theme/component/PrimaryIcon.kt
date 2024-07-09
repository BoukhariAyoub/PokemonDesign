package com.boukhari.pokemondesign.ui.theme.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.boukhari.pokemondesign.ui.theme.PokemonBlueTheme
import com.boukhari.pokemondesign.ui.theme.PokemonRedTheme
import com.boukhari.pokemondesign.ui.theme.PokemonThemeTokens

@Composable
fun PrimaryIcon(
    modifier: Modifier = Modifier
) {
    val tokens = PokemonThemeTokens.current
    Icon(
        imageVector = Icons.Default.Star,
        contentDescription = null,
        tint = tokens.icon.primary,
        modifier = modifier.size(24.dp)
    )
}

@Composable
private fun IconSample() {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.padding(16.dp)
    ) {
        PrimaryIcon()
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewIconSampleRed() {
    PokemonRedTheme {
        Surface {
            IconSample()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewIconSampleBlue() {
    PokemonBlueTheme {
        Surface {
            IconSample()
        }
    }
}
