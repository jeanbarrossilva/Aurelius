package com.jeanbarrossilva.aurelius.utils

import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember

/** Whether or not the last scroll the user made went forward rather than backwards. **/
@Suppress("Unused")
val LazyListState.isLeaningForward
    @Composable get() = isLeaningForwardAsState().value

/**
 * [State] holding a [Boolean] that tells whether or not the last scroll the user made went forward
 * rather than backwards.
 **/
@Composable
@Suppress("UNUSED_EXPRESSION")
internal fun LazyListState.isLeaningForwardAsState(): State<Boolean> {
    val interactions by interactionSource.interactions.collectAsState(null)
    return remember {
        derivedStateOf {
            interactions
            reflect("wasScrollingForward")
        }
    }
}
