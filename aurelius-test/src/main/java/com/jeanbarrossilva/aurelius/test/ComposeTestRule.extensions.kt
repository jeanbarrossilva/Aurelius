package com.jeanbarrossilva.aurelius.test

import androidx.annotation.RestrictTo
import androidx.compose.ui.test.SemanticsNodeInteraction
import androidx.compose.ui.test.junit4.ComposeTestRule
import androidx.compose.ui.test.onNodeWithTag
import com.jeanbarrossilva.aurelius.ui.actionable.button.BUTTON_TAG
import com.jeanbarrossilva.aurelius.ui.actionable.button.Button
import com.jeanbarrossilva.aurelius.ui.actionable.button.PRIMARY_BUTTON_TAG
import com.jeanbarrossilva.aurelius.ui.actionable.button.PrimaryButton
import com.jeanbarrossilva.aurelius.ui.actionable.button.SECONDARY_BUTTON_TAG
import com.jeanbarrossilva.aurelius.ui.actionable.button.SecondaryButton
import com.jeanbarrossilva.aurelius.ui.layout.dialog.ConfirmationButton
import com.jeanbarrossilva.aurelius.ui.layout.dialog.DIALOG_CONFIRMATION_BUTTON_TAG
import com.jeanbarrossilva.aurelius.ui.layout.dialog.DIALOG_NEUTRAL_BUTTON_TAG
import com.jeanbarrossilva.aurelius.ui.layout.dialog.DIALOG_TAG
import com.jeanbarrossilva.aurelius.ui.layout.dialog.Dialog
import com.jeanbarrossilva.aurelius.ui.layout.dialog.NeutralButton
import com.jeanbarrossilva.aurelius.ui.layout.scaffold.FLOATING_ACTION_BUTTON_TAG
import com.jeanbarrossilva.aurelius.ui.layout.scaffold.FloatingActionButton
import com.jeanbarrossilva.aurelius.ui.layout.scaffold.topappbar.BackButton
import com.jeanbarrossilva.aurelius.ui.layout.scaffold.topappbar.CloseButton
import com.jeanbarrossilva.aurelius.ui.layout.scaffold.topappbar.DeleteAction
import com.jeanbarrossilva.aurelius.ui.layout.scaffold.topappbar.TOP_APP_BAR_BACK_BUTTON_TAG
import com.jeanbarrossilva.aurelius.ui.layout.scaffold.topappbar.TOP_APP_BAR_CLOSE_BUTTON_TAG
import com.jeanbarrossilva.aurelius.ui.layout.scaffold.topappbar.TOP_APP_BAR_DELETE_ACTION_TAG
import com.jeanbarrossilva.aurelius.ui.layout.scaffold.topappbar.TOP_APP_BAR_MENU_BUTTON_TAG
import com.jeanbarrossilva.aurelius.ui.layout.scaffold.topappbar.TOP_APP_BAR_TAG

/** [SemanticsNodeInteraction] of a [BackButton]. **/
fun ComposeTestRule.onBackButton(): SemanticsNodeInteraction {
    return onNodeWithTag(TOP_APP_BAR_BACK_BUTTON_TAG)
}

/** [SemanticsNodeInteraction] of a [Button]. **/
@RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
fun ComposeTestRule.onButton(): SemanticsNodeInteraction {
    return onNodeWithTag(BUTTON_TAG)
}

/** [SemanticsNodeInteraction] of a [CloseButton]. **/
fun ComposeTestRule.onCloseButton(): SemanticsNodeInteraction {
    return onNodeWithTag(TOP_APP_BAR_CLOSE_BUTTON_TAG)
}

/** [SemanticsNodeInteraction] of a [ConfirmationButton]. **/
fun ComposeTestRule.onConfirmationButton(): SemanticsNodeInteraction {
    return onNodeWithTag(DIALOG_CONFIRMATION_BUTTON_TAG)
}

/** [SemanticsNodeInteraction] of a [DeleteAction]. **/
fun ComposeTestRule.onDeleteAction(): SemanticsNodeInteraction {
    return onNodeWithTag(TOP_APP_BAR_DELETE_ACTION_TAG)
}

/** [SemanticsNodeInteraction] of a [Dialog]. **/
fun ComposeTestRule.onDialog(): SemanticsNodeInteraction {
    return onNodeWithTag(DIALOG_TAG)
}

/** [SemanticsNodeInteraction] of a [FloatingActionButton]. **/
fun ComposeTestRule.onFloatingActionButton(): SemanticsNodeInteraction {
    return onNodeWithTag(FLOATING_ACTION_BUTTON_TAG)
}

/** [SemanticsNodeInteraction] of a [MenuButton]. **/
fun ComposeTestRule.onMenuButton(): SemanticsNodeInteraction {
    return onNodeWithTag(TOP_APP_BAR_MENU_BUTTON_TAG)
}

/** [SemanticsNodeInteraction] of a [NeutralButton]. **/
fun ComposeTestRule.onNeutralButton(): SemanticsNodeInteraction {
    return onNodeWithTag(DIALOG_NEUTRAL_BUTTON_TAG)
}

/** [SemanticsNodeInteraction] of a [PrimaryButton]. **/
fun ComposeTestRule.onPrimaryButton(): SemanticsNodeInteraction {
    return onNodeWithTag(PRIMARY_BUTTON_TAG)
}

/** [SemanticsNodeInteraction] of a [SecondaryButton]. **/
fun ComposeTestRule.onSecondaryButton(): SemanticsNodeInteraction {
    return onNodeWithTag(SECONDARY_BUTTON_TAG)
}

/** [SemanticsNodeInteraction] of a [TopAppBar]. **/
fun ComposeTestRule.onTopAppBar(): SemanticsNodeInteraction {
    return onNodeWithTag(TOP_APP_BAR_TAG)
}
