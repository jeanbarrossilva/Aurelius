package com.jeanbarrossilva.aurelius.ui.theme.text

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.jeanbarrossilva.aurelius.ui.theme.AureliusTheme
import com.jeanbarrossilva.aurelius.utils.DMSans
import com.jeanbarrossilva.aurelius.utils.typography.TypographyTokens

/**
 * Different sizes of title [TextStyle]s.
 *
 * @param large Larger [TextStyle].
 * @param small Smallest [TextStyle].
 **/
data class Title internal constructor(val large: TextStyle, val small: TextStyle) {
    companion object {
        /** [Title] with [TextStyle.Default] values. **/
        internal val Unspecified = Title(large = TextStyle.Default, small = TextStyle.Default)

        /** [Title] that's provided by default. **/
        val default
            @Composable get() = Title(
                large = TypographyTokens.TitleLarge.copy(
                    AureliusTheme.colors.text.highlighted,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.DMSans
                ),
                small = TypographyTokens.BodyLarge.copy(
                    AureliusTheme.colors.text.highlighted,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.DMSans,
                    letterSpacing = .3.sp,
                    lineHeight = 18.sp
                )
            )
    }
}
