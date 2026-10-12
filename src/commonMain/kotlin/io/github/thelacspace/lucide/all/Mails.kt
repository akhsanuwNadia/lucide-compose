package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Mails") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0f,19.0f)
                curveTo(17.0f,20.10457f,16.10457f,21.0f,15.0f,21.0f)
                lineTo(4.0f,21.0f)
                curveTo(2.8954306f,21.0f,2.0f,20.10457f,2.0f,19.0f)
                lineTo(2.0f,11.0f)
                curveTo(2.0000181f,10.285487f,2.3812134f,9.625257f,3.0f,9.268f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,5.5f)
                lineTo(15.580999f,9.679f)
                curveTo(14.922428f,10.102082f,14.077571f,10.102082f,13.419f,9.679f)
                lineTo(7.0f,5.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,3.0f)
                lineTo(20.0f,3.0f)
                lineTo(22.0f,3.0f)
                lineTo(22.0f,15.0f)
                lineTo(20.0f,15.0f)
                lineTo(9.0f,15.0f)
                lineTo(7.0f,15.0f)
                lineTo(7.0f,3.0f)
                lineTo(9.0f,3.0f)
                close()
            }
}

public val LucideIcons.All.MailsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Mails: ImageVector
    @Composable get() = MailsDefinition.asImageVector()
