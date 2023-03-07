package com.jeanbarrossilva.aurelius.ui.theme.colors

import androidx.annotation.ColorRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import com.jeanbarrossilva.aurelius.R

/**
 * [Color]s of hierarchically and/or contextually distinct texts.
 *
 * @param highlighted [Color] for highlighted, more prominent text.
 * @param default [Color] for non-[highlighted] text.
 **/
data class TextColors internal constructor(val highlighted: Color, val default: Color) {
    companion object {
        /** [TextColors] with [Color.Unspecified] values. **/
        internal val Unspecified =
            TextColors(highlighted = Color.Unspecified, default = Color.Unspecified)

        /** [TextColors] that are provided by default. **/
        val default
            @Composable get() = of(R.color.aurelius_text_highlighted, R.color.aurelius_text_default)

        @Composable
        internal fun of(@ColorRes highlighted: Int, @ColorRes default: Int): TextColors {
            return TextColors(colorResource(highlighted), colorResource(default))
        }
    }
}
