package com.jeanbarrossilva.aurelius.utils

import androidx.annotation.FloatRange
import androidx.annotation.FractionRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

/**
 * Loads the fraction associated with the given resource [id].
 *
 * @param id ID of the fraction resource.
 **/
@Composable
@FloatRange(from = 0.0, to = 1.0)
fun fractionResource(@FractionRes id: Int): Float {
    return LocalContext.current.resources.getFraction(id, 1, 1)
}
