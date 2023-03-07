package com.jeanbarrossilva.aurelius.ui.theme.shapes

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.unit.dp

@Composable
internal fun ShapesProvider(content: @Composable () -> Unit) {
    CompositionLocalProvider(
        LocalShapes provides Shapes(
            large = RoundedCornerShape(24.dp),
            medium = RoundedCornerShape(12.dp),
            small = RoundedCornerShape(14.dp),
            tiny = CircleShape
        ),
        content = content
    )
}
