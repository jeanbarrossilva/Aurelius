package com.jeanbarrossilva.aurelius.ui.actionable.button

import android.content.res.Configuration
import androidx.annotation.RestrictTo
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jeanbarrossilva.aurelius.ui.actionable.button.Button as _Button
import com.jeanbarrossilva.aurelius.ui.actionable.button.ButtonDefaults as _ButtonDefaults
import com.jeanbarrossilva.aurelius.ui.layout.background.Background
import com.jeanbarrossilva.aurelius.ui.layout.background.BackgroundContentSizing
import com.jeanbarrossilva.aurelius.ui.theme.AureliusTheme
import com.jeanbarrossilva.aurelius.utils.copy

/** Tag that identifies the [Button][_Button] for testing purposes. **/
@RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
const val BUTTON_TAG = "button"

/** Tag that identifies the [PrimaryButton] for testing purposes. **/
const val PRIMARY_BUTTON_TAG = "primary_button"

/** Tag that identifies the [SecondaryButton] for testing purposes. **/
const val SECONDARY_BUTTON_TAG = "secondary_button"

/**
 * [Button][_Button] that's the most prominent.
 *
 * @param onClick Callback run whenever it's clicked.
 * @param modifier [Modifier] to be applied to the underlying [Composable].
 * @param isEnabled Whether or not it's enabled.
 * @param content Content to be shown inside.
 **/
@Composable
fun PrimaryButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = true,
    content: @Composable RowScope.() -> Unit
) {
    _Button(onClick, modifier.testTag(PRIMARY_BUTTON_TAG), isEnabled, content = content)
}

/**
 * [Button][_Button] that's the least prominent.
 *
 * @param onClick Callback run whenever it's clicked.
 * @param modifier [Modifier] to be applied to the underlying [Composable].
 * @param isEnabled Whether or not it's enabled.
 * @param content Content to be shown inside.
 **/
@Composable
fun SecondaryButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = true,
    content: @Composable () -> Unit
) {
    _Button(
        onClick,
        modifier.testTag(SECONDARY_BUTTON_TAG),
        isEnabled,
        _ButtonDefaults
            .colors(container = Color.Transparent, content = AureliusTheme.colors.container.primary)
    ) {
        content()
    }
}

/**
 * [Button] that all other Aurelius buttons are built upon.
 *
 * @param onClick Callback run whenever it's clicked.
 * @param modifier [Modifier] to be applied to the underlying [Composable].
 * @param isEnabled Whether or not it's enabled.
 * @param colors [ButtonColors] for coloring.
 * @param content Content to be shown inside.
 **/
@Composable
@RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
fun Button(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = true,
    colors: ButtonColors = _ButtonDefaults.colors(),
    content: @Composable RowScope.() -> Unit
) {
    AureliusTheme.requireFor("Button")

    Button(
        onClick,
        modifier.testTag(BUTTON_TAG),
        isEnabled,
        AureliusTheme.shapes.medium,
        colors = colors,
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 0.dp,
            pressedElevation = 0.dp,
            focusedElevation = 0.dp,
            hoveredElevation = 0.dp,
            disabledElevation = 0.dp
        ),
        contentPadding = ButtonDefaults.ContentPadding.copy(
            top = AureliusTheme.sizes.spacing.medium,
            bottom = AureliusTheme.sizes.spacing.medium
        ),
        content = content
    )
}

@Composable
@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
private fun SecondaryButtonPreview() {
    AureliusTheme {
        Background(contentSizing = BackgroundContentSizing.WRAP) {
            SecondaryButton(onClick = { }) {
                Text("Secondary")
            }
        }
    }
}

@Composable
@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
private fun ButtonPreview() {
    AureliusTheme {
        _Button(onClick = { }) {
            Text("Base")
        }
    }
}
