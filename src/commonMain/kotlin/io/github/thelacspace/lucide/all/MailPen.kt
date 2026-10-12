package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MailPen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.363f, 17.634f)
                arcToRelative(2f, 2f, 0f, false, false, .854f, lf)
                arcToRelative(-.837f, 2.87f, af, false, false, 0f, 00.62f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 10.38f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, Hf)
                arcToRelative(4f, af, 2f, false, false, 00f, -2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 7f)
                lineToRelative(-8.991f, 5.727f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, Lf)
            }
}

public val LucideIcons.All.MailPenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MailPen: ImageVector
    @Composable get() = MailPenDefinition.asImageVector()
