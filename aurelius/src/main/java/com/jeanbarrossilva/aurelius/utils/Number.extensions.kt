package com.jeanbarrossilva.aurelius.utils

import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp

/** Converts the given [Number] into [T]. **/
inline fun <reified T : Number> Number.to(): T {
    return when (T::class) {
        Byte::class -> toByte()
        Double::class -> toDouble()
        Float::class -> toFloat()
        Int::class -> toInt()
        Short::class -> toShort()
        else -> throw IllegalArgumentException("${T::class.qualifiedName} is not a Number.")
    } as T
}

/**
 * Converts the given amount of pixels into [Dp].
 *
 * @param density [Density] through which this will be converted into [Dp].
 **/
fun <T : Number> T.toDp(density: Density): Dp {
    return with(density) {
        toFloat().toDp()
    }
}
