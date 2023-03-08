package com.jeanbarrossilva.aurelius.ui.theme.shapes

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.unit.dp
import com.jeanbarrossilva.aurelius.ui.theme.AureliusTheme

/**
 * Provides the [Shapes] to be used in the [AureliusTheme].
 *
 * @param content Content to be able to access the provided value through [LocalShapes].
 **/
@Composable
internal fun ShapesProvider(content: @Composable () -> Unit) {
    CompositionLocalProvider(
        LocalShapes provides Shapes(
            huge = RoundedCornerShape(28.dp),
            large = RoundedCornerShape(24.dp),
            medium = RoundedCornerShape(12.dp),
            small = RoundedCornerShape(14.dp),
            tiny = CircleShape
        ),
        content = content
    )
}
