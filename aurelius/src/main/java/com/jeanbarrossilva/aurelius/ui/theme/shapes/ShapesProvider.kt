package com.jeanbarrossilva.aurelius.ui.theme.shapes

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.jeanbarrossilva.aurelius.ui.theme.AureliusTheme

/**
 * Provides the [Shapes] to be used in the [AureliusTheme].
 *
 * @param content Content to be able to access the provided value through [LocalShapes].
 **/
@Composable
internal fun ShapesProvider(shapes: Shapes, content: @Composable () -> Unit) {
    CompositionLocalProvider(LocalShapes provides shapes, content = content)
}
