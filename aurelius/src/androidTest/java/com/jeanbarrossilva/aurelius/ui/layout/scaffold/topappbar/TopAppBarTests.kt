package com.jeanbarrossilva.aurelius.ui.layout.scaffold.topappbar

import androidx.compose.ui.test.junit4.createComposeRule
import com.jeanbarrossilva.aurelius.ui.theme.AureliusTheme
import org.junit.Rule
import org.junit.Test

internal class TopAppBarTests {
    @get:Rule
    val composeRule = createComposeRule()

    @Test(expected = IllegalStateException::class)
    fun throwsOnUnprovidedTheme() {
        composeRule.setContent {
            TopAppBar(isCompact = false)
        }
    }

    @Test
    fun doesNotThrowWhenPlacedWhileExpanded() {
        composeRule.setContent {
            AureliusTheme {
                TopAppBar(isCompact = false)
            }
        }
    }
}
