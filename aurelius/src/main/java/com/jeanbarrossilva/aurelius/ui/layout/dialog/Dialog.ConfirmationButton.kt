package com.jeanbarrossilva.aurelius.ui.layout.dialog // ktlint-disable filename

import android.content.res.Configuration
import androidx.annotation.RestrictTo
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.jeanbarrossilva.aurelius.ui.layout.background.Background
import com.jeanbarrossilva.aurelius.ui.layout.background.BackgroundContentSizing
import com.jeanbarrossilva.aurelius.ui.theme.AureliusTheme

/** Tag that identifies the [ConfirmationButton] for testing purposes. **/
@RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
const val DIALOG_CONFIRMATION_BUTTON_TAG = "dialog_confirmation_button"

/**
 * Confirmation [Button] of a [Dialog].
 *
 * @param onClick Callback run whenever it's clicked.
 * @param modifier [Modifier] to be applied to the underlying [Composable].
 * @param content Content to be shown inside.
 **/
@Composable
fun ConfirmationButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit = { Text(stringResource(android.R.string.ok)) }
) {
    Button(
        onClick,
        modifier.testTag(DIALOG_CONFIRMATION_BUTTON_TAG),
        shape = DialogDefaults.buttonShape,
        colors = ButtonDefaults.buttonColors(
            containerColor = AureliusTheme.colors.container.primary,
            contentColor = AureliusTheme.colors.content.primary
        )
    ) {
        ProvideTextStyle(TextStyle(LocalContentColor.current)) {
            content()
        }
    }
}

@Composable
@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
private fun ConfirmationButtonPreview() {
    AureliusTheme {
        Background(contentSizing = BackgroundContentSizing.WRAP) {
            ConfirmationButton(onClick = { })
        }
    }
}
