package com.jeanbarrossilva.aurelius.utils

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.unit.dp
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test

internal class PaddingValuesExtensions {
    @get:Rule
    val composeRule = createComposeRule()

    @Test
    fun getsEnd() {
        composeRule.setContent {
            assertEquals(24.dp, PaddingValues(end = 24.dp).end)
        }
    }

    @Test
    fun isNegative() {
        composeRule.setContent {
            assertTrue(PaddingValues(top = (-24).dp).isNegative)
        }
    }

    @Test
    fun isPositive() {
        composeRule.setContent {
            assertFalse(PaddingValues(24.dp).isNegative)
        }
    }

    @Test
    fun getsStart() {
        composeRule.setContent {
            assertEquals(24.dp, PaddingValues(start = 24.dp).start)
        }
    }

    @Test
    fun adds() {
        composeRule.setContent {
            assertEquals(PaddingValues(48.dp), PaddingValues(24.dp) + PaddingValues(24.dp))
        }
    }

    @Test
    fun subtracts() {
        composeRule.setContent {
            assertEquals(PaddingValues(8.dp), PaddingValues(32.dp) - PaddingValues(24.dp))
        }
    }
}
