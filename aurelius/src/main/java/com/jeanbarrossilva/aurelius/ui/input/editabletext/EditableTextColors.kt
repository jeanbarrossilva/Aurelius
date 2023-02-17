package com.jeanbarrossilva.aurelius.ui.input.editabletext

import androidx.compose.ui.graphics.Color

/**
 * [Color]s of an [EditableText].
 *
 * @param text [Color] to color the input text with.
 * @param label [Color] to color the label with.
 * @param cursor [Color] to color the cursor with.
 **/
data class EditableTextColors internal constructor(
    internal val text: Color,
    internal val label: Color,
    internal val cursor: Color
)
