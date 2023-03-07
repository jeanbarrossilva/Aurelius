package com.jeanbarrossilva.aurelius.ui.theme.colors

import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.jeanbarrossilva.aurelius.ui.theme.AureliusTheme

/**
 * Provides the [Colors] to be used in the [AureliusTheme].
 *
 * @param colors [Colors] to be provided.
 * @param content Content to be able to access the provided value through [LocalColors].
 **/
@Composable
internal fun ColorsProvider(colors: Colors, content: @Composable () -> Unit) {
    CompositionLocalProvider(LocalColors provides colors) {
        CompositionLocalProvider(
            LocalContentColor provides AureliusTheme.colors.text.default,
            content = content
        )
    }
}
