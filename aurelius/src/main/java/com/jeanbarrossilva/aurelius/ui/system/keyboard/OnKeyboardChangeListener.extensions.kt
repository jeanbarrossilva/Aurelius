package com.jeanbarrossilva.aurelius.ui.system.keyboard

import androidx.compose.ui.unit.Density

/**
 * Creates an [OnKeyboardChangeListener].
 *
 * @param density [Density] to be attributed to [OnKeyboardChangeListener.density].
 * @param onKeyboardChange Callback to be called from
 * [OnKeyboardChangeListener.onKeyboardChange].
 **/
internal fun OnKeyboardChangeListener(
    density: Density,
    onKeyboardChange: (Keyboard) -> Unit
): OnKeyboardChangeListener {
    return object : OnKeyboardChangeListener() {
        override val density = density

        override fun onKeyboardChange(keyboard: Keyboard) {
            onKeyboardChange(keyboard)
        }
    }
}
