package com.jeanbarrossilva.aurelius.ui.theme

import androidx.compose.material.Text
import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test

internal class AureliusThemeTests {
    @get:Rule
    val composeRule = createComposeRule()

    @Test
    fun isProvided() {
        composeRule.setContent {
            AureliusTheme {
                assertTrue(AureliusTheme.isProvided)
            }
        }
    }

    @Test
    fun isNotProvided() {
        composeRule.setContent {
            assertFalse(AureliusTheme.isProvided)
        }
    }

    @Test(expected = AssertionError::class)
    fun throwsWhenRequiringWithABlankContext() {
        composeRule.setContent {
            AureliusTheme.requireFor(" ")
        }
    }

    @Test(expected = IllegalStateException::class)
    fun throwsWhenRequiredWhileNotProvided() {
        composeRule.setContent {
            AureliusTheme.requireFor("Test")
        }
    }

    @Test(expected = IllegalStateException::class)
    fun throwsWhenRequiredWhileOnlyProvidedToAnotherContext() {
        composeRule.setContent {
            AureliusTheme {
                Text("This text is themed!")
            }

            Text("This one isn't, though.")
            AureliusTheme.requireFor("Test")
        }
    }

    @Test
    fun doesNotThrowWhenRequiredWhileProvided() {
        composeRule.setContent {
            AureliusTheme {
                AureliusTheme.requireFor("Test")
            }
        }
    }
}
