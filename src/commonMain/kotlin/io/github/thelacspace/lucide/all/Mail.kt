package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Mail") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0f,7.0f)
                lineTo(13.009f,12.727f)
                curveTo(12.387915f,13.08774f,11.621085f,13.08774f,11.0f,12.727f)
                lineTo(2.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,4.0f)
                lineTo(20.0f,4.0f)
                lineTo(22.0f,4.0f)
                lineTo(22.0f,20.0f)
                lineTo(20.0f,20.0f)
                lineTo(4.0f,20.0f)
                lineTo(2.0f,20.0f)
                lineTo(2.0f,4.0f)
                lineTo(4.0f,4.0f)
                close()
            }
}

public val LucideIcons.All.MailDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Mail: ImageVector
    @Composable get() = MailDefinition.asImageVector()
