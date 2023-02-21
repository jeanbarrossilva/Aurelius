package com.jeanbarrossilva.aurelius.utils

import androidx.compose.foundation.lazy.LazyListState

/** Whether or not the list is being scrolled. **/
val LazyListState.isScrolling
    get() = firstVisibleItemIndex > 0 || firstVisibleItemScrollOffset > 0
