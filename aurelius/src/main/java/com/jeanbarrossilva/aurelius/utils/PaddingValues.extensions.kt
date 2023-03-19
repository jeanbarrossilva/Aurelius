package com.jeanbarrossilva.aurelius.utils

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/** End padding calculated through the [LocalLayoutDirection]. **/
val PaddingValues.end
    @Composable get() = calculateEndPadding(LocalLayoutDirection.current)

/** Whether or not the given [PaddingValues] have a negative value. **/
val PaddingValues.isNegative
    @Composable get() = start < 0.dp ||
        calculateTopPadding() < 0.dp ||
        end < 0.dp ||
        calculateBottomPadding() < 0.dp

/** Start padding calculated through the [LocalLayoutDirection]. **/
val PaddingValues.start
    @Composable get() = calculateStartPadding(LocalLayoutDirection.current)

/**
 * Copies the given [PaddingValues].
 *
 * @param start [Dp]s to be applied to the start padding.
 * @param top [Dp]s to be applied to the top padding.
 * @param end [Dp]s to be applied to the end padding.
 * @param bottom [Dp]s to be applied to the bottom padding.
 **/
@Composable
fun PaddingValues.copy(
    start: Dp = this.start,
    top: Dp = calculateTopPadding(),
    end: Dp = this.end,
    bottom: Dp = calculateBottomPadding()
): PaddingValues {
    return PaddingValues(start, top, end, bottom)
}

/**
 * Adds the [PaddingValues].
 *
 * @param other [PaddingValues] to add to the receiver one.
 **/
@Composable
operator fun PaddingValues.plus(other: PaddingValues): PaddingValues {
    return PaddingValues(
        start + other.start,
        calculateTopPadding() + other.calculateTopPadding(),
        end + other.end,
        calculateBottomPadding() + other.calculateBottomPadding()
    )
}

/**
 * Subtracts the [PaddingValues].
 *
 * @param other [PaddingValues] to subtract from the receiver one.
 **/
@Composable
operator fun PaddingValues.minus(other: PaddingValues): PaddingValues {
    return PaddingValues(
        start - other.start,
        calculateTopPadding() - other.calculateTopPadding(),
        end - other.end,
        calculateBottomPadding() - other.calculateBottomPadding()
    )
}
