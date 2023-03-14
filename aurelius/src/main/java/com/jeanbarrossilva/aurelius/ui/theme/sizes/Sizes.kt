package com.jeanbarrossilva.aurelius.ui.theme.sizes

import androidx.compose.runtime.Composable

/**
 * Different types of area measurement.
 *
 * @param spacing Sizes for spacing, such as the distance between one component and another or
 * padding.
 * @param margin Reserved spaces for hierarchically greater components.
 **/
data class Sizes internal constructor(val spacing: Spacing, val margin: Margin) {
    companion object {
        /** [Sizes] with unspecified values. **/
        internal val Unspecified = Sizes(Spacing.Unspecified, Margin.Unspecified)

        /** [Sizes] that are provided by default. **/
        val default
            @Composable get() = Sizes(Spacing.Default, Margin.default)
    }
}
