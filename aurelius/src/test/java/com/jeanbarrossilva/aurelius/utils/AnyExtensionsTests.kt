package com.jeanbarrossilva.aurelius.utils

import org.junit.Assert.assertEquals
import org.junit.Test

internal class AnyExtensionsTests {
    @Test
    fun `GIVEN an update WHEN the condition is true THEN it's applied to the object`() {
        assertEquals(4, 2.`if`(true) { plus(2) })
    }

    @Test
    fun `GIVEN an update WHEN the condition is false THEN the original object is returned`() {
        assertEquals(2, 2.`if`({ mod(3) == 0 }) { plus(2) })
    }

    @Test
    fun `GIVEN a private property WHEN getting its value through reflection THEN it's obtained`() {
        val `object` = object {
            @Suppress("Unused")
            private val privateProperty = ":P"
        }
        assertEquals(":P", `object`.reflect("privateProperty"))
    }
}
