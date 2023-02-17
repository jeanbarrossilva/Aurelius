package com.jeanbarrossilva.aurelius.ui.theme.colors

import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.jeanbarrossilva.aurelius.R
import com.jeanbarrossilva.aurelius.ui.theme.AureliusTheme

/**
 * Provides the [Colors] to be used in the [AureliusTheme].
 *
 * @param content Content to be able to access the provided value through [LocalColors].
 **/
@Composable
internal fun ColorsProvider(content: @Composable () -> Unit) {
    CompositionLocalProvider(
        LocalColors provides Colors.of(
            R.color.aurelius_background,
            R.color.aurelius_scrim,
            container = LayeredColors.of(
                R.color.aurelius_container_primary,
                R.color.aurelius_container_secondary,
                R.color.aurelius_container_tertiary
            ),
            content = LayeredColors.of(
                R.color.aurelius_content_primary,
                R.color.aurelius_content_secondary,
                R.color.aurelius_content_tertiary
            ),
            TextColors.of(R.color.aurelius_text_highlighted, R.color.aurelius_text_default)
        )
    ) {
        CompositionLocalProvider(
            LocalContentColor provides AureliusTheme.colors.text.default,
            content = content
        )
    }
}
