package com.jeanbarrossilva.aurelius.ui.theme.colors.layered

import androidx.compose.runtime.Composable
import com.jeanbarrossilva.aurelius.R
import com.jeanbarrossilva.aurelius.ui.theme.colors.Colors

object LayeredColorsDefaults {
    /** [Colors.container] that's provided by default. **/
    val container
        @Composable get() = LayeredColors.of(
            R.color.aurelius_container_primary,
            R.color.aurelius_container_secondary,
            R.color.aurelius_container_tertiary
        )

    /** [Colors.content] that's provided by default. **/
    val content
        @Composable get() = LayeredColors.of(
            R.color.aurelius_content_primary,
            R.color.aurelius_content_secondary,
            R.color.aurelius_content_tertiary
        )
}
