package com.jeanbarrossilva.aurelius.utils

import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import org.junit.Assert.assertEquals
import org.junit.Test

internal class IntSizeExtensions {
    @Test
    fun `GIVEN an IntSize WHEN converting it into a DpSize with a density of 1 THEN they're equivalent`() {
        val density = Density(1f)
        assertEquals(DpSize(24.dp, 24.dp), IntSize(24, 24).toDpSize(density))
    }
}
