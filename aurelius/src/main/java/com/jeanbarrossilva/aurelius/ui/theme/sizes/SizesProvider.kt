package com.jeanbarrossilva.aurelius.ui.theme.sizes

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.jeanbarrossilva.aurelius.ui.theme.AureliusTheme

/**
 * Provides the [Sizes] to be used in the [AureliusTheme].
 *
 * @param sizes [Sizes] to be provided.
 * @param content Content to be able to access the provided value through [LocalSizes].
 **/
@Composable
internal fun SizesProvider(sizes: Sizes, content: @Composable () -> Unit) {
    CompositionLocalProvider(LocalSizes provides sizes, content = content)
}
