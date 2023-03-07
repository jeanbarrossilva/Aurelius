package com.jeanbarrossilva.aurelius.ui.theme.colors.layered

import androidx.compose.runtime.Composable
import com.jeanbarrossilva.aurelius.R

object LayeredColorsDefaults {
    /** Container [LayeredColors] that are provided by default. **/
    val container
        @Composable get() = LayeredColors.of(
            R.color.aurelius_container_primary,
            R.color.aurelius_container_secondary,
            R.color.aurelius_container_tertiary
        )

    /** Content [LayeredColors] that are provided by default. **/
    val content
        @Composable get() = LayeredColors.of(
            R.color.aurelius_content_primary,
            R.color.aurelius_content_secondary,
            R.color.aurelius_content_tertiary
        )
}
