package com.jeanbarrossilva.aurelius.ui.layout.dialog // ktlint-disable filename

import android.content.res.Configuration
import androidx.compose.material3.Button
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.jeanbarrossilva.aurelius.ui.layout.background.Background
import com.jeanbarrossilva.aurelius.ui.layout.background.BackgroundContentSizing
import com.jeanbarrossilva.aurelius.ui.theme.AureliusTheme

/** Tag that identifies the [NeutralButton] for testing purposes. **/
const val DIALOG_NEUTRAL_BUTTON_TAG = "dialog_neutral_button"

/**
 * Neutral, non-highlighted [Button] of a [Dialog].
 *
 * @param onClick Callback run whenever it's clicked.
 * @param modifier [Modifier] to be applied to the underlying [Composable].
 * @param content Content to be shown inside.
 **/
@Composable
fun NeutralButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    TextButton(
        onClick,
        modifier.testTag(DIALOG_NEUTRAL_BUTTON_TAG),
        shape = DialogDefaults.buttonShape
    ) {
        ProvideTextStyle(AureliusTheme.text.body.copy(AureliusTheme.colors.text.highlighted)) {
            content()
        }
    }
}

@Composable
@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
private fun NeutralButtonPreview() {
    AureliusTheme {
        Background(contentSizing = BackgroundContentSizing.WRAP) {
            NeutralButton(onClick = { }) {
                Text(stringResource(android.R.string.cancel))
            }
        }
    }
}
