package com.jeanbarrossilva.aurelius.utils

import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.junit.Assert.assertEquals
import org.junit.Test

internal class DpExtensionsTests {
    @Test
    fun `GIVEN an amount of DPs WHEN converting it to SPs with a font scale of 1 THEN they're equivalent`() {
        val density = Density(1f, fontScale = 1f)
        assertEquals(24.sp, 24.dp.toSp(density))
    }
}
