package com.jeanbarrossilva.aurelius.ui.input.editabletext

import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.LocalTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.takeOrElse
import com.jeanbarrossilva.aurelius.ui.theme.AureliusTheme

/** Default values used by a [EditableText]. **/
object EditableTextDefaults {
    /**
     * Default [EditableTextColors].
     *
     * @param text [Color] to be set as [EditableTextColors.text].
     * @param label [Color] to be set as [EditableTextColors.label].
     * @param cursor [Color] to be set as [EditableTextColors.label].
     **/
    @Composable
    fun colors(
        text: Color = LocalTextStyle.current.color.takeOrElse { LocalContentColor.current },
        label: Color = text.copy(AureliusTheme.visibility.medium),
        cursor: Color = text
    ): EditableTextColors {
        return EditableTextColors(text, label, cursor)
    }
}
