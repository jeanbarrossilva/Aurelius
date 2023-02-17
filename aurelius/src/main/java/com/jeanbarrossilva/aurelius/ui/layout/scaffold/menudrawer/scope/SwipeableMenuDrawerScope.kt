package com.jeanbarrossilva.aurelius.ui.layout.scaffold.menudrawer.scope

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.SwipeableState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import com.jeanbarrossilva.aurelius.ui.layout.scaffold.menudrawer.MenuDrawerScope

@OptIn(ExperimentalMaterialApi::class, ExperimentalMaterial3Api::class)
internal class SwipeableMenuDrawerScope(override val swipeableState: SwipeableState<DrawerValue>) :
    MenuDrawerScope() {
    override suspend fun open() {
        swipeableState.animateTo(DrawerValue.Open)
    }

    override suspend fun close() {
        swipeableState.animateTo(DrawerValue.Closed)
    }
}
