package com.jeanbarrossilva.aurelius.utils // ktlint-disable filename

import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit

/**
 * Converts the given [Dp] into [SP][TextUnit].
 *
 * @param density [Density] through which this will be converted.
 **/
fun Dp.toSp(density: Density): TextUnit {
    return with(density) {
        toSp()
    }
}
