package com.jeanbarrossilva.aurelius.ui.theme.sizes

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.jeanbarrossilva.aurelius.utils.navigationBarHeight
import com.jeanbarrossilva.aurelius.utils.statusBarHeight

/**
 * Reserved spaces for hierarchically greater components.
 *
 * @param statusBar [Dp]s taken by the status bar.
 * @param fab [Dp]s taken by the FAB.
 * @param navigationBar [Dp]s taken by the navigation bar.
 **/
data class Margin internal constructor(
    val statusBar: PaddingValues,
    val fab: PaddingValues,
    val navigationBar: PaddingValues
) {
    companion object {
        /** [Margin] with unspecified [PaddingValues]s. **/
        internal val Unspecified = Margin(
            statusBar = PaddingValues(Dp.Unspecified),
            fab = PaddingValues(Dp.Unspecified),
            navigationBar = PaddingValues(Dp.Unspecified)
        )

        /** [Margin] that's provided by default. **/
        val default
            @Composable get() = Margin(
                statusBar = PaddingValues(top = statusBarHeight()),
                fab = PaddingValues(bottom = navigationBarHeight() + 16.dp * 2 + 56.dp),
                navigationBar = PaddingValues(bottom = navigationBarHeight())
            )
    }
}
