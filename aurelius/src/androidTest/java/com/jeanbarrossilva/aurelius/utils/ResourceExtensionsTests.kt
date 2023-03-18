package com.jeanbarrossilva.aurelius.utils

import androidx.compose.ui.test.junit4.createComposeRule
import com.jeanbarrossilva.aurelius.R
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

internal class ResourceExtensionsTests {
    @get:Rule
    val composeRule = createComposeRule()

    @Test
    fun getsFractionResource() {
        composeRule.setContent {
            assertEquals(.5f, fractionResource(R.fraction.aurelius_shapes_tiny_size))
        }
    }
}
