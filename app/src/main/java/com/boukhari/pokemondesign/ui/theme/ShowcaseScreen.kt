package com.boukhari.pokemondesign.ui.theme.showcase

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.boukhari.pokemondesign.ui.theme.component.OutlinedButton
import com.boukhari.pokemondesign.ui.theme.component.PrimaryButton
import com.boukhari.pokemondesign.ui.theme.component.PrimaryIcon
import com.boukhari.pokemondesign.ui.theme.component.PrimaryText
import com.boukhari.pokemondesign.ui.theme.component.SecondaryButton
import com.boukhari.pokemondesign.ui.theme.component.SecondaryText

@Composable
fun ShowcaseScreen(
    isRedTheme: Boolean,
    onThemeToggle: () -> Unit
) {
    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        // Theme toggle switch
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = if (isRedTheme) "Red Theme" else "Blue Theme")
            Spacer(modifier = Modifier.weight(1f))
            Switch(
                checked = isRedTheme,
                onCheckedChange = { onThemeToggle() }
            )
        }

        // Text components
        PrimaryText(text = "Primary Text")
        SecondaryText(text = "Secondary Text")

        // Button components
        PrimaryButton(text = "Primary Button", onClick = {})
        SecondaryButton(text = "Secondary Button", onClick = {})
        OutlinedButton(text = "Outlined Button", onClick = {})

        // Icon components
        PrimaryIcon()
    }
}