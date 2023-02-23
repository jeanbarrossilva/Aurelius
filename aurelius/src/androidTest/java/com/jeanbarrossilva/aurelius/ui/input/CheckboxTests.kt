package com.jeanbarrossilva.aurelius.ui.input

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.test.assertIsNotSelected
import androidx.compose.ui.test.assertIsSelected
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test

internal class CheckboxTests {
    @get:Rule
    val composeRule = createComposeRule()

    @Test
    fun isNotSelectedWhenUnchecked() {
        composeRule.setContent { _Checkbox(isChecked = false) }
        composeRule.onNodeWithTag(CHECKBOX_TAG).assertIsNotSelected()
    }

    @Test
    fun isSelectedWhenChecked() {
        composeRule.setContent { _Checkbox(isChecked = true) }
        composeRule.onNodeWithTag(CHECKBOX_TAG).performClick()
        composeRule.onNodeWithTag(CHECKBOX_TAG).assertIsSelected()
    }

    @Test
    fun isCheckedWhenClickedWhileUnchecked() {
        assertCheckedChangesOnClick(before = false, after = true)
    }

    @Test
    fun isUncheckedWhenClickedWhileChecked() {
        assertCheckedChangesOnClick(before = true, after = false)
    }

    private fun assertCheckedChangesOnClick(before: Boolean, after: Boolean) {
        var isChecked by mutableStateOf(before)
        composeRule.setContent {
            _Checkbox(isChecked, onToggle = { isChecked = it })
        }
        composeRule.onNodeWithTag(CHECKBOX_TAG).performClick()
        if (after) assertTrue(isChecked) else assertFalse(isChecked)
    }
}
