package com.jeanbarrossilva.aurelius.ui.theme.text

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.jeanbarrossilva.aurelius.ui.theme.AureliusTheme
import com.jeanbarrossilva.aurelius.utils.DMSans
import com.jeanbarrossilva.aurelius.utils.typography.TypographyTokens

/**
 * [TextStyle]s for various contexts, representing different hierarchies.
 *
 * @param headline Most prominent [TextStyle].
 * @param title Less prominent than [headline], but more than [body].
 * @param body Less prominent than [title], but more than [label].
 * @param label Least prominent [TextStyle].
 **/
data class Text internal constructor(
    val headline: TextStyle,
    val title: Title,
    val body: TextStyle,
    val label: TextStyle
) {
    /** [Typography] version of this [Text]. **/
    internal val material
        get() = Typography(
            displayLarge = TextStyle.Default,
            displayMedium = TextStyle.Default,
            displaySmall = TextStyle.Default,
            headlineLarge = TextStyle.Default,
            headlineMedium = TextStyle.Default,
            headlineSmall = headline,
            titleLarge = title.large,
            titleMedium = TextStyle.Default,
            titleSmall = title.small,
            labelLarge = TextStyle.Default,
            labelMedium = TextStyle.Default,
            labelSmall = label,
            bodyLarge = body,
            bodyMedium = TextStyle.Default,
            bodySmall = TextStyle.Default
        )

    companion object {
        /** [Text] with default values. **/
        internal val Unspecified = Text(
            headline = TextStyle.Default,
            title = Title.Unspecified,
            body = TextStyle.Default,
            label = TextStyle.Default
        )

        /** [Text] that's provided by default. **/
        val default
            @Composable get() = Text(
                headline = TypographyTokens.HeadlineSmall.copy(
                    AureliusTheme.colors.text.highlighted,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.DMSans
                ),
                title = Title.default,
                body = TypographyTokens.BodyLarge.copy(
                    AureliusTheme.colors.text.default,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.DMSans,
                    letterSpacing = .3.sp,
                    lineHeight = 18.sp
                ),
                label = TypographyTokens.BodySmall.copy(
                    AureliusTheme.colors.text.highlighted,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.DMSans
                )
            )
    }
}
