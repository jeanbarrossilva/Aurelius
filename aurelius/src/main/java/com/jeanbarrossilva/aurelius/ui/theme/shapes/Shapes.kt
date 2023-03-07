package com.jeanbarrossilva.aurelius.ui.theme.shapes

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Shapes as MaterialShapes

/**
 * [RoundedCornerShape]s for shaping UI components based on their size.
 *
 * @param large Greatest [RoundedCornerShape].
 * @param medium Smaller than [large], greater than [small].
 * @param small Smaller than [medium], greater than [tiny].
 * @param tiny Smallest [RoundedCornerShape].
 **/
data class Shapes internal constructor(
    val large: RoundedCornerShape,
    val medium: RoundedCornerShape,
    val small: RoundedCornerShape,
    val tiny: RoundedCornerShape
) {
    /** Material's [Shapes][MaterialShapes] version of these [Shapes]. **/
    internal val material
        get() = MaterialShapes(extraSmall = tiny, small, medium, large)

    companion object {
        /** [Shapes] with zeroed [RoundedCornerShape]s. **/
        internal val Unspecified = Shapes(
            large = RoundedCornerShape(0.dp),
            medium = RoundedCornerShape(0.dp),
            small = RoundedCornerShape(0.dp),
            tiny = RoundedCornerShape(0.dp)
        )
    }
}
