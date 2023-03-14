package com.jeanbarrossilva.aurelius.ui.theme.animation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.jeanbarrossilva.aurelius.ui.theme.AureliusTheme

/**
 * Provides the [Animation] to be used in the [AureliusTheme].
 *
 * @param animation [Animation] to be provided.
 * @param content Content to be able to access the provided value through [LocalAnimation].
 **/
@Composable
internal fun AnimationProvider(animation: Animation, content: @Composable () -> Unit) {
    CompositionLocalProvider(LocalAnimation provides animation, content = content)
}
