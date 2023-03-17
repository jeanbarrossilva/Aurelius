package com.jeanbarrossilva.aurelius.ui.theme.sizes

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.Dp
import com.jeanbarrossilva.aurelius.R

/**
 * Sizes for spacing, such as the distance between one component and another or padding.
 *
 * @param huge Greatest possible size.
 * @param large Smaller than [huge], greater than [medium].
 * @param medium Smaller than [large], greater than [small].
 * @param small Smaller than [medium], greater than [tiny].
 * @param tiny Smallest possible size.
 **/
data class Spacing internal constructor(
    val huge: Dp,
    val large: Dp,
    val medium: Dp,
    val small: Dp,
    val tiny: Dp
) {
    companion object {
        /** [Spacing] with [Dp.Unspecified] values. **/
        internal val Unspecified = Spacing(
            huge = Dp.Unspecified,
            large = Dp.Unspecified,
            medium = Dp.Unspecified,
            small = Dp.Unspecified,
            tiny = Dp.Unspecified
        )

        /** [Spacing] that's provided by default. **/
        val default
            @Composable get() = Spacing(
                huge = dimensionResource(R.dimen.aurelius_sizes_spacing_huge),
                large = dimensionResource(R.dimen.aurelius_sizes_spacing_large),
                medium = dimensionResource(R.dimen.aurelius_sizes_spacing_medium),
                small = dimensionResource(R.dimen.aurelius_sizes_spacing_small),
                tiny = dimensionResource(R.dimen.aurelius_sizes_spacing_tiny)
            )
    }
}
