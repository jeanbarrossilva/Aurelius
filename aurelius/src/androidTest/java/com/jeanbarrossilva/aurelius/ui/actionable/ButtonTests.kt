package com.jeanbarrossilva.aurelius.ui.actionable

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.performClick
import com.jeanbarrossilva.aurelius.test.onButton
import com.jeanbarrossilva.aurelius.ui.actionable.button.Button
import com.jeanbarrossilva.aurelius.ui.theme.AureliusTheme
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test

internal class ButtonTests {
    @get:Rule
    val composeRule = createComposeRule()

    @Test
    fun clicks() {
        var hasBeenClicked = false
        composeRule.setContent {
            AureliusTheme {
                Button(onClick = { hasBeenClicked = true }) {
                }
            }
        }
        composeRule.onButton().performClick()
        assertTrue(hasBeenClicked)
    }
}
