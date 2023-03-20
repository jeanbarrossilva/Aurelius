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
        /** Default [medium] value to fallback to. **/
        private const val DEFAULT_MEDIUM_FALLBACK = .5f

        /** Default [low] value to fallback to. **/
        private const val DEFAULT_LOW_FALLBACK = .38f

        /** [Visibility] with zeroed values. **/
        internal val Unspecified = Visibility(medium = 0f, low = 0f)

        /** [Visibility] that's provided by default. **/
        val default
            @Composable get() = Visibility(
                medium = fractionResource(R.fraction.aurelius_visibility_low)
                    ?: DEFAULT_MEDIUM_FALLBACK,
                low = fractionResource(R.fraction.aurelius_visibility_low) ?: DEFAULT_LOW_FALLBACK
            )
    }
}
