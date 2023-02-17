package com.jeanbarrossilva.aurelius.ui.layout.scaffold.menudrawer

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.SwipeableState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api

/** Scope for drawer-related operations. **/
abstract class MenuDrawerScope internal constructor() {
    /**
     * [SwipeableState] through which the drawer will be able to be shown or dismissed with swipe
     * gestures.
     **/
    @OptIn(ExperimentalMaterialApi::class, ExperimentalMaterial3Api::class)
    internal abstract val swipeableState: SwipeableState<DrawerValue>

    /** Opens the drawer. **/
    abstract suspend fun open()

    /** Closes the drawer. **/
    abstract suspend fun close()

    companion object
}
