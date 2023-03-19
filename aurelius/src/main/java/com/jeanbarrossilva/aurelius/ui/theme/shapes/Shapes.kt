package com.jeanbarrossilva.aurelius.ui.theme.shapes

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import com.jeanbarrossilva.aurelius.R
import com.jeanbarrossilva.aurelius.utils.fractionResource
import androidx.compose.material3.Shapes as MaterialShapes

/**
 * [RoundedCornerShape]s for shaping UI components based on their size.
 *
 * @param huge Greatest [RoundedCornerShape].
 * @param large Smaller than [huge], greater than [medium].
 * @param medium Smaller than [large], greater than [small].
 * @param small Smaller than [medium], greater than [tiny].
 * @param tiny Smallest [RoundedCornerShape].
 **/
data class Shapes internal constructor(
    val huge: RoundedCornerShape,
    val large: RoundedCornerShape,
    val medium: RoundedCornerShape,
    val small: RoundedCornerShape,
    val tiny: RoundedCornerShape
) {
    /** Material's [Shapes][MaterialShapes] version of these [Shapes]. **/
    internal val material
        get() = MaterialShapes(extraSmall = tiny, small, medium, large, extraLarge = huge)

    companion object {
        /** Default [tiny][tiny] [RoundedCornerShape] percent to fallback to. **/
        private const val DEFAULT_TINY_PERCENT_FALLBACK = 50

        /** [Shapes] with zeroed [RoundedCornerShape]s. **/
        internal val Unspecified = Shapes(
            huge = RoundedCornerShape(0.dp),
            large = RoundedCornerShape(0.dp),
            medium = RoundedCornerShape(0.dp),
            small = RoundedCornerShape(0.dp),
            tiny = RoundedCornerShape(0.dp)
        )

        /** [Shapes] that are provided by default. **/
        val default
            @Composable get() = Shapes(
                huge = RoundedCornerShape(dimensionResource(R.dimen.aurelius_shapes_huge_size)),
                large = RoundedCornerShape(dimensionResource(R.dimen.aurelius_shapes_large_size)),
                medium = RoundedCornerShape(dimensionResource(R.dimen.aurelius_shapes_medium_size)),
                small = RoundedCornerShape(dimensionResource(R.dimen.aurelius_shapes_small_size)),
                tiny = RoundedCornerShape(
                    fractionResource(R.fraction.aurelius_shapes_tiny_size)
                        ?.times(100)
                        ?.toInt()
                        ?: DEFAULT_TINY_PERCENT_FALLBACK
                )
            )
    }
}
