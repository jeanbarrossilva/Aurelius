package com.jeanbarrossilva.aurelius.ui.theme.shapes

import androidx.compose.runtime.CompositionLocal
import androidx.compose.runtime.compositionLocalOf

/** [CompositionLocal] that provides [Shapes]. **/
internal val LocalShapes = compositionLocalOf {
    Shapes.Unspecified
}
