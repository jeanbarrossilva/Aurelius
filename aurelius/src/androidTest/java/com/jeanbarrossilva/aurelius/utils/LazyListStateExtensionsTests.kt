package com.jeanbarrossilva.aurelius.utils

import android.content.Context
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Text
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test

internal class LazyListStateExtensionsTests {
    @get:Rule
    val composeRule = createComposeRule()

    @Test
    fun leansForwardOnDownwardsScroll() {
        composeRule.setContent {
            val context = LocalContext.current
            val state = rememberLazyListState()
            val isLeaningForward by state.isLeaningForwardAsState()

            LaunchedEffect(Unit) {
                state.animateScrollToItem(256)
                assertTrue(isLeaningForward)
            }

            LazyColumn(state = state) {
                items(getDisplayHeightBasedItemCount(context)) {
                    Text("$it")
                }
            }
        }
    }

    @Test
    fun leansBackwardsOnUpwardsScroll() {
        composeRule.setContent {
            val context = LocalContext.current
            val state = rememberLazyListState()
            val isLeaningForward by state.isLeaningForwardAsState()

            LaunchedEffect(Unit) {
                state.animateScrollToItem(512)
                state.animateScrollToItem(8)
                assertFalse(isLeaningForward)
            }

            LazyColumn(state = state) {
                items(getDisplayHeightBasedItemCount(context)) {
                    Text("$it")
                }
            }
        }
    }

    private fun getDisplayHeightBasedItemCount(context: Context): Int {
        return context.resources?.displayMetrics?.heightPixels ?: 2_048
    }
}
