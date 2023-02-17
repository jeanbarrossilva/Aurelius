package com.jeanbarrossilva.aurelius.ui.layout.background

import android.content.res.Configuration
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.jeanbarrossilva.aurelius.ui.theme.AureliusTheme
import com.jeanbarrossilva.aurelius.ui.theme.colors.Colors

/**
 * [Surface] colored with the given [color], that defaults to [AureliusTheme.colors]'
 * [background color][Colors.background].
 *
 * @param modifier [Modifier] to be applied to the underlying [Composable].
 * @param contentSizing [BackgroundContentSizing] for determining whether the [content] will
 * determine the size of this container or if it'll match the screen's.
 * @param color [Color] to color it with.
 * @param content Content whose background will be colored with [color].
 **/
@Composable
fun Background(
    modifier: Modifier = Modifier,
    contentSizing: BackgroundContentSizing = BackgroundContentSizing.FILL,
    color: Color = AureliusTheme.colors.background,
    content: @Composable BoxScope.() -> Unit
) {
    Surface(color = color) {
        Box(modifier then contentSizing.modifier) {
            CompositionLocalProvider(
                LocalContentColor provides AureliusTheme.colors.content.secondary
            ) {
                content()
            }
        }
    }
}

@Composable
@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
private fun BackgroundPreview() {
    AureliusTheme {
        Background {
        }
    }
}
