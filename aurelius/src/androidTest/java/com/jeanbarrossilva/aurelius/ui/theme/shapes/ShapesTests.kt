package com.jeanbarrossilva.aurelius.ui.theme.shapes

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

internal class ShapesTests {
    @get:Rule
    val composeRule = createComposeRule()

    @Test
    fun defaultTinyShapeIsACircle() {
        composeRule.setContent {
            assertEquals(CircleShape, Shapes.default.tiny)
        }
    }
}
