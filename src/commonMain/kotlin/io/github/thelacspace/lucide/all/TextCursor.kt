package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TextCursor") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0,22.0)
                lineTo(16.0,22.0)
                curveTo(13.790861129760742,22.0,12.0,20.209138870239258,12.0,18.0)
                lineTo(12.0,6.0)
                curveTo(12.0,3.790860891342163,13.790861129760742,2.0,16.0,2.0)
                lineTo(17.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,22.0)
                lineTo(8.0,22.0)
                curveTo(10.209138870239258,22.0,12.0,20.209138870239258,12.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,2.0)
                lineTo(8.0,2.0)
                curveTo(10.209138870239258,2.0,12.0,3.790860891342163,12.0,6.0)
            }
}

public val LucideIcons.All.TextCursorDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TextCursor: ImageVector
    @Composable get() = TextCursorDefinition.asImageVector()
