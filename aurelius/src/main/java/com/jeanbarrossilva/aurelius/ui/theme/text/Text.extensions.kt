package com.jeanbarrossilva.aurelius.ui.theme.text

import androidx.compose.runtime.CompositionLocal
import androidx.compose.runtime.compositionLocalOf

/** [CompositionLocal] that provides [Text]. **/
internal val LocalText = compositionLocalOf {
    Text.Unspecified
}
