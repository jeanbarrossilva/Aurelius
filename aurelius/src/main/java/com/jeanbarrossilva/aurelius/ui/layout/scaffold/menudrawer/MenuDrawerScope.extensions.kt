package com.jeanbarrossilva.aurelius.ui.layout.scaffold.menudrawer // ktlint-disable filename

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.SwipeableState
import androidx.compose.material.rememberSwipeableState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.jeanbarrossilva.aurelius.ui.layout.scaffold.menudrawer.scope.SwipeableMenuDrawerScope
import com.jeanbarrossilva.aurelius.ui.theme.AureliusTheme

@OptIn(ExperimentalMaterialApi::class, ExperimentalMaterial3Api::class)
internal val MenuDrawerScope.Companion.default
    @Composable get() = getDefault(rememberSwipeableState(DrawerValue.Closed))

/** Creates a [MenuDrawerScope] and [remembers][remember] it. **/
@Composable
@OptIn(ExperimentalMaterialApi::class, ExperimentalMaterial3Api::class)
fun rememberMenuDrawerScope(): MenuDrawerScope {
    val swipeableState =
        rememberSwipeableState(initialValue = DrawerValue.Closed, AureliusTheme.animation.spec())
    return remember { MenuDrawerScope.getDefault(swipeableState) }
}

@OptIn(ExperimentalMaterialApi::class, ExperimentalMaterial3Api::class)
internal fun MenuDrawerScope.Companion.getDefault(swipeableState: SwipeableState<DrawerValue>):
    MenuDrawerScope {
    return SwipeableMenuDrawerScope(swipeableState)
}
