package com.jeanbarrossilva.aurelius.ui.theme.animation

import androidx.compose.animation.core.FiniteAnimationSpec
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import kotlin.time.Duration
import kotlin.time.Duration.Companion.milliseconds

/** Holds configuration for animations played in the app.**/
abstract class Animation internal constructor() {
    /** Determines for how long an animation will be run. **/
    protected abstract val durations: AnimationDurations

    /**
     * [FiniteAnimationSpec] for finite animations.
     *
     * @param duration Returns the [Duration] that determines for how long an animation will be run.
     **/
    abstract fun <T> spec(duration: AnimationDurations.() -> Duration = { medium }):
        FiniteAnimationSpec<T>

    companion object {
        /** [Animation] with an [AnimationDurations.Unspecified] and a [spring][spring] [spec]. **/
        internal val Unspecified = object : Animation() {
            override val durations = AnimationDurations.Unspecified

            override fun <T> spec(duration: AnimationDurations.() -> Duration):
                FiniteAnimationSpec<T> {
                return spring()
            }
        }

        /** [Animation] that's provided by default. **/
        val Default = object : Animation() {
            override val durations = AnimationDurations(
                fast = 64.milliseconds,
                medium = 128.milliseconds,
                slow = 256.milliseconds
            )

            override fun <T> spec(duration: AnimationDurations.() -> Duration):
                FiniteAnimationSpec<T> {
                val durationInMilliseconds = durations.duration().inWholeMilliseconds.toInt()
                return tween(durationInMilliseconds)
            }
        }
    }
}
