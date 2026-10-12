package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Mail") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0,7.0)
                lineTo(13.008999824523926,12.72700023651123)
                curveTo(12.387914657592773,13.087739944458008,11.621085166931152,13.087739944458008,11.0,12.72700023651123)
                lineTo(2.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,4.0)
                lineTo(20.0,4.0)
                lineTo(22.0,4.0)
                lineTo(22.0,20.0)
                lineTo(20.0,20.0)
                lineTo(4.0,20.0)
                lineTo(2.0,20.0)
                lineTo(2.0,4.0)
                lineTo(4.0,4.0)
                close()
            }
}

public val LucideIcons.All.MailDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Mail: ImageVector
    @Composable get() = MailDefinition.asImageVector()
