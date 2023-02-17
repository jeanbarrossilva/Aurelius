package com.jeanbarrossilva.aurelius.ui.layout.scaffold.menudrawer // ktlint-disable filename

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material.icons.rounded.ThumbUp
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jeanbarrossilva.aurelius.ui.layout.background.Background
import com.jeanbarrossilva.aurelius.ui.layout.background.BackgroundContentSizing
import com.jeanbarrossilva.aurelius.ui.theme.AureliusTheme

@Composable
internal fun @receiver:Suppress("Unused") MenuDrawerScope.Items(
    modifier: Modifier = Modifier,
    content: @Composable MenuDrawerScope.() -> Unit
) {
    Column(modifier, Arrangement.spacedBy(AureliusTheme.sizes.spacing.small)) {
        content()
    }
}

@Composable
@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
private fun MenuDrawerItemsPreview() {
    AureliusTheme {
        Background(contentSizing = BackgroundContentSizing.WRAP) {
            MenuDrawerScope.default.Items {
                Item(
                    Icons.Rounded.Settings,
                    contentDescription = "Settings",
                    isSelected = true,
                    onClick = { }
                ) {
                    Text("Settings")
                }

                Item(
                    Icons.Rounded.ThumbUp,
                    contentDescription = "Rate",
                    isSelected = false,
                    onClick = { }
                ) {
                    Text("Rate")
                }
            }
        }
    }
}
