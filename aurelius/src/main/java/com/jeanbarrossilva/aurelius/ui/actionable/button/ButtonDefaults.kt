package com.jeanbarrossilva.aurelius.ui.actionable.button

import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.jeanbarrossilva.aurelius.ui.theme.AureliusTheme

internal object ButtonDefaults {
    @Composable
    fun colors(
        container: Color = AureliusTheme.colors.container.primary,
        content: Color = AureliusTheme.colors.content.primary
    ): ButtonColors {
        return ButtonDefaults.buttonColors(container, content)
    }
}
