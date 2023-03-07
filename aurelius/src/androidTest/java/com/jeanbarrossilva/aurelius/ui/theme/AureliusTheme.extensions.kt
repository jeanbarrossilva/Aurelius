package com.jeanbarrossilva.aurelius.ui.theme

import androidx.compose.runtime.Composable

/** Calls [AureliusTheme.requireFor] with a `"Test"` [String]. **/
@Composable
@Suppress("ComposableNaming")
internal fun AureliusTheme.require() {
    requireFor("Test")
}
