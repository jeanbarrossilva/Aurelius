package com.jeanbarrossilva.aurelius.ui.theme.visibility

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.jeanbarrossilva.aurelius.ui.theme.AureliusTheme

/**
 * Provides the [Visibility] to be used in the [AureliusTheme].
 *
 * @param visibility [Visibility] to be provided.
 * @param content Content to be able to access the provided value through [LocalVisibility].
 **/
@Composable
internal fun VisibilityProvider(visibility: Visibility, content: @Composable () -> Unit) {
    CompositionLocalProvider(LocalVisibility provides visibility, content = content)
}
