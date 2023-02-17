package com.jeanbarrossilva.aurelius.ui.layout.background

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.ui.Modifier

/** Form through which the background may be sized. **/
enum class BackgroundContentSizing {
    /** Wraps the background to the size of the content. **/
    WRAP {
        override val modifier = Modifier.wrapContentSize()
    },

    /** Fills all of the available space. **/
    FILL {
        override val modifier = Modifier.fillMaxSize()
    };

    internal abstract val modifier: Modifier
}
