package com.jeanbarrossilva.aurelius.ui.theme.text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.jeanbarrossilva.aurelius.ui.theme.AureliusTheme

/**
 * Provides the [Text] to be used in the [AureliusTheme].
 *
 * @param text [Text] to be provided.
 * @param content Content to be able to access the provided value through [LocalText].
 **/
@Composable
internal fun TextProvider(text: Text, content: @Composable () -> Unit) {
    CompositionLocalProvider(LocalText provides text, content = content)
}
