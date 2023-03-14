package com.jeanbarrossilva.aurelius.ui.theme

import androidx.compose.material.Text
import androidx.compose.ui.test.junit4.createComposeRule
import com.jeanbarrossilva.aurelius.ui.theme.animation.Animation
import com.jeanbarrossilva.aurelius.ui.theme.colors.Colors
import com.jeanbarrossilva.aurelius.ui.theme.shapes.Shapes
import com.jeanbarrossilva.aurelius.ui.theme.sizes.Sizes
import com.jeanbarrossilva.aurelius.ui.theme.text.Text
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test

internal class AureliusThemeTests {
    @get:Rule
    val composeRule = createComposeRule()

    @Test
    fun providesCustomConfigurations() {
        composeRule.setContent {
            AureliusTheme(
                Animation.Unspecified,
                Colors.Unspecified,
                Shapes.Unspecified,
                Sizes.Unspecified,
                Text.Unspecified
            ) {
                assertEquals(Animation.Unspecified, AureliusTheme.animation)
                assertEquals(Colors.Unspecified, AureliusTheme.colors)
                assertEquals(Shapes.Unspecified, AureliusTheme.shapes)
                assertEquals(Sizes.Unspecified, AureliusTheme.sizes)
                assertEquals(Text.Unspecified, AureliusTheme.text)
            }
        }
    }

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
            AureliusTheme.require()
        }
    }

    @Test(expected = IllegalStateException::class)
    fun throwsWhenRequiredWhileOnlyProvidedToAnotherContext() {
        composeRule.setContent {
            AureliusTheme {
                Text("This text is themed!")
            }

            Text("This one isn't, though.")
            AureliusTheme.require()
        }
    }

    @Test
    fun doesNotThrowWhenRequiredWhileProvided() {
        composeRule.setContent {
            AureliusTheme {
                AureliusTheme.require()
            }
        }
    }
}
