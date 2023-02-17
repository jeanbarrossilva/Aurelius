package com.jeanbarrossilva.aurelius.ui.layout.scaffold.menudrawer // ktlint-disable filename

import android.content.res.Configuration
import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jeanbarrossilva.aurelius.ui.layout.background.Background
import com.jeanbarrossilva.aurelius.ui.layout.background.BackgroundContentSizing
import com.jeanbarrossilva.aurelius.ui.theme.AureliusTheme

/**
 * Item of a [MenuDrawer].
 *
 * @param vector [ImageVector] to be used as the icon.
 * @param contentDescription Description of what the [vector] represents.
 * @param isSelected Whether or not this [Item] is selected.
 * @param onClick Callback run whenever this [Item] is clicked.
 * @param modifier [Modifier] to be applied to the underlying [Composable].
 * @param label Description of what this [Item] represents.
 **/
@Composable
fun @receiver:Suppress("Unused") MenuDrawerScope.Item(
    vector: ImageVector,
    contentDescription: String,
    isSelected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    label: @Composable () -> Unit
) {
    val spacing = AureliusTheme.sizes.spacing.medium
    val backgroundColor by animateColorAsState(
        if (isSelected) AureliusTheme.colors.container.secondary else Color.Transparent
    )
    val contentColor = AureliusTheme.colors.content.secondary

    Row(
        modifier
            .fillMaxWidth()
            .clip(MaterialTheme.shapes.small)
            .clickable(role = Role.Button, onClick = onClick)
            .background(backgroundColor)
            .padding(spacing),
        Arrangement.spacedBy(spacing),
        Alignment.CenterVertically
    ) {
        CompositionLocalProvider(LocalContentColor provides contentColor) {
            Icon(vector, contentDescription, Modifier.size(18.dp))
            ProvideTextStyle(AureliusTheme.text.label.copy(contentColor), label)
        }
    }
}

@Composable
private fun MenuDrawerScope.Item(isSelected: Boolean, modifier: Modifier = Modifier) {
    Item(
        Icons.Rounded.Settings,
        contentDescription = "Settings",
        isSelected,
        onClick = { },
        modifier
    ) {
        Text("Settings")
    }
}

@Composable
@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
private fun UnselectedItemPreview() {
    AureliusTheme {
        Background(contentSizing = BackgroundContentSizing.WRAP) {
            MenuDrawerScope.default.Item(isSelected = false)
        }
    }
}

@Composable
@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
private fun SelectedItemPreview() {
    AureliusTheme {
        MenuDrawerScope.default.Item(isSelected = true)
    }
}
