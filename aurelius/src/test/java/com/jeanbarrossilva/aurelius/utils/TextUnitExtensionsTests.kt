package com.jeanbarrossilva.aurelius.utils

import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import org.junit.Assert.assertEquals
import org.junit.Test

internal class TextUnitExtensionsTests {
    @Test
    fun `GIVEN an amount of non-SPs WHEN converting it into DPs THEN it's unspecified`() {
        val density = Density(1f)
        assertEquals(Dp.Unspecified, 24.em.toDp(density))
    }

    @Test
    fun `GIVEN an amount of SPs WHEN converting it into DPs with a font scale of 1 THEN they're equivalent`() {
        val density = Density(1f, fontScale = 1f)
        assertEquals(24.dp, 24.sp.toDp(density))
    }
}
