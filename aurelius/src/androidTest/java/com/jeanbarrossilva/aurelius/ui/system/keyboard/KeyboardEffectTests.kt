package com.jeanbarrossilva.aurelius.ui.system.keyboard

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.core.view.WindowInsetsCompat
import androidx.test.platform.app.InstrumentationRegistry
import com.jeanbarrossilva.aurelius.fixtures.activity
import com.jeanbarrossilva.aurelius.fixtures.insetsControllerCompat
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

internal class KeyboardEffectTests {
    private val activity
        get() = InstrumentationRegistry.getInstrumentation().activity

    @get:Rule
    val composeRule = createComposeRule()

    @Test
    fun keyboardIsIdleAtStart() {
        var keyboard: Keyboard? = null
        composeRule.setContent {
            KeyboardEffect {
                if (keyboard == null) {
                    keyboard = it
                }
            }
        }
        assertEquals(Keyboard.Idle.instance, keyboard)
    }

    @Test
    fun keyboardIsOpenWhenImeIsOpen() {
        var keyboard: Keyboard = Keyboard.Idle.instance
        composeRule.setContent {
            KeyboardEffect {
                keyboard = it
            }
        }
        setKeyboardOpen(true)
        composeRule.waitUntil(timeoutMillis = 16_000) { keyboard is Keyboard.Open }
        assertEquals(Keyboard.Open::class, keyboard::class)
    }

    @Test
    fun keyboardIsClosedWhenImeIsClosed() {
        var keyboard: Keyboard = Keyboard.Idle.instance
        composeRule.setContent {
            KeyboardEffect {
                keyboard = it
            }
        }
        setKeyboardOpen(false)
        assertEquals(Keyboard.Closed.instance, keyboard)
    }

    private fun setKeyboardOpen(isKeyboardOpen: Boolean) {
        val typeMask = WindowInsetsCompat.Type.ime()
        activity?.window?.insetsControllerCompat?.apply {
            if (isKeyboardOpen) show(typeMask) else hide(typeMask)
        }
    }
}
