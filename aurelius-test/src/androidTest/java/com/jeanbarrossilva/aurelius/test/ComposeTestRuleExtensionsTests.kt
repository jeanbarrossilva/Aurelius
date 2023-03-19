package com.jeanbarrossilva.aurelius.test

import androidx.compose.ui.test.junit4.createComposeRule
import com.jeanbarrossilva.aurelius.ui.actionable.button.Button
import com.jeanbarrossilva.aurelius.ui.actionable.button.PrimaryButton
import com.jeanbarrossilva.aurelius.ui.actionable.button.SecondaryButton
import com.jeanbarrossilva.aurelius.ui.layout.dialog.ConfirmationButton
import com.jeanbarrossilva.aurelius.ui.layout.dialog.Dialog
import com.jeanbarrossilva.aurelius.ui.layout.dialog.NeutralButton
import com.jeanbarrossilva.aurelius.ui.layout.scaffold.FloatingActionButton
import com.jeanbarrossilva.aurelius.ui.layout.scaffold.topappbar.BackButton
import com.jeanbarrossilva.aurelius.ui.layout.scaffold.topappbar.CloseButton
import com.jeanbarrossilva.aurelius.ui.layout.scaffold.topappbar.DeleteAction
import com.jeanbarrossilva.aurelius.ui.layout.scaffold.topappbar.MenuButton
import com.jeanbarrossilva.aurelius.ui.layout.scaffold.topappbar.TopAppBar
import com.jeanbarrossilva.aurelius.ui.theme.AureliusTheme
import org.junit.Rule
import org.junit.Test

internal class ComposeTestRuleExtensionsTests {
    @get:Rule
    val composeRule = createComposeRule()

    @Test
    fun backButtonExists() {
        composeRule.setContent {
            BackButton(onClick = { })
        }
        composeRule.onBackButton().assertExists()
    }

    @Test
    fun buttonExists() {
        composeRule.setContent {
            AureliusTheme {
                Button(onClick = { }) {
                }
            }
        }
        composeRule.onButton().assertExists()
    }

    @Test
    fun closeButtonExists() {
        composeRule.setContent {
            CloseButton(onClick = { })
        }
        composeRule.onCloseButton().assertExists()
    }

    @Test
    fun confirmationButtonExists() {
        composeRule.setContent {
            ConfirmationButton(onClick = { }) {
            }
        }
        composeRule.onConfirmationButton().assertExists()
    }

    @Test
    fun deleteActionExists() {
        composeRule.setContent {
            AureliusTheme {
                DeleteAction(onClick = { })
            }
        }
        composeRule.onDeleteAction().assertExists()
    }

    @Test
    fun dialogExists() {
        composeRule.setContent {
            AureliusTheme {
                Dialog(title = { }, body = { }, onDismissalRequest = { })
            }
        }
        composeRule.onDialog().assertExists()
    }

    @Test
    fun floatingActionButtonExists() {
        composeRule.setContent {
            FloatingActionButton(onClick = { }) {
            }
        }
        composeRule.onFloatingActionButton().assertExists()
    }

    @Test
    fun menuButtonExists() {
        composeRule.setContent {
            MenuButton(onClick = { })
        }
        composeRule.onMenuButton().assertExists()
    }

    @Test
    fun neutralButtonExists() {
        composeRule.setContent {
            NeutralButton(onClick = { }) {
            }
        }
        composeRule.onNeutralButton().assertExists()
    }

    @Test
    fun primaryButtonExists() {
        composeRule.setContent {
            AureliusTheme {
                PrimaryButton(onClick = { }) {
                }
            }
        }
        composeRule.onPrimaryButton().assertExists()
    }

    @Test
    fun secondaryButtonExists() {
        composeRule.setContent {
            AureliusTheme {
                SecondaryButton(onClick = { }) {
                }
            }
        }
        composeRule.onSecondaryButton().assertExists()
    }

    @Test
    fun topAppBarExists() {
        composeRule.setContent {
            AureliusTheme {
                TopAppBar(isCompact = false, navigationButton = { }, title = { })
            }
        }
        composeRule.onTopAppBar().assertExists()
    }
}
