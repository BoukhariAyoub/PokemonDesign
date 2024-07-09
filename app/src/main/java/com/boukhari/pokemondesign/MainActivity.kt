package com.boukhari.pokemondesign

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.boukhari.pokemondesign.ui.theme.PokemonBlueTheme
import com.boukhari.pokemondesign.ui.theme.PokemonRedTheme
import com.boukhari.pokemondesign.ui.theme.showcase.ShowcaseScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var isRedTheme by remember { mutableStateOf(true) }

            if (isRedTheme) {
                PokemonRedTheme {
                    Scaffold { paddingValues ->
                        Box(modifier = Modifier.padding(paddingValues)) {
                            ShowcaseScreen(
                                isRedTheme = isRedTheme,
                                onThemeToggle = { isRedTheme = !isRedTheme })
                        }
                    }
                }
            } else {
                PokemonBlueTheme {
                    Scaffold { paddingValues ->
                        Box(modifier = Modifier.padding(paddingValues)) {
                            ShowcaseScreen(
                                isRedTheme = isRedTheme,
                                onThemeToggle = { isRedTheme = !isRedTheme })
                        }
                    }
                }
            }
        }
    }
}