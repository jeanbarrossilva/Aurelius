package com.jeanbarrossilva.aurelius.fixtures // ktlint-disable filename

import android.view.Window
import androidx.core.view.WindowInsetsControllerCompat

/** Compatibility version of [Window.getInsetsController]. **/
val Window.insetsControllerCompat
    get() = WindowInsetsControllerCompat(this, decorView)
