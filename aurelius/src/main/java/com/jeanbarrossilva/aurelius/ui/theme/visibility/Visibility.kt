package com.jeanbarrossilva.aurelius.ui.theme.visibility

import androidx.annotation.FloatRange
import androidx.compose.runtime.Composable
import com.jeanbarrossilva.aurelius.R
import com.jeanbarrossilva.aurelius.utils.fractionResource

/**
 * Represents content opacity.
 *
 * @param medium Higher than [low].
 * @param low Lower than [medium].
 **/
data class Visibility internal constructor(
    @FloatRange(from = 0.0, to = 1.0) val medium: Float,
    @FloatRange(from = 0.0, to = 1.0) val low: Float
) {
    companion object {
        /** [Visibility] with zeroed values. **/
        internal val Unspecified = Visibility(medium = 0f, low = 0f)

        /** [Visibility] that's provided by default. **/
        val default
            @Composable get() = Visibility(
                medium = fractionResource(R.fraction.aurelius_visibility_low),
                low = fractionResource(R.fraction.aurelius_visibility_low)
            )
    }
}
