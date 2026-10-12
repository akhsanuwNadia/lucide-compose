package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Mailbox") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0f,17.0f)
                curveTo(22.0f,18.10457f,21.10457f,19.0f,20.0f,19.0f)
                lineTo(4.0f,19.0f)
                curveTo(2.8954306f,19.0f,2.0f,18.10457f,2.0f,17.0f)
                lineTo(2.0f,9.5f)
                curveTo(2.0f,7.0f,4.0f,5.0f,6.5f,5.0f)
                lineTo(18.0f,5.0f)
                curveTo(20.2f,5.0f,22.0f,6.8f,22.0f,9.0f)
                lineTo(22.0f,17.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,9.0f)
                lineTo(18.0f,9.0f)
                lineTo(18.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.5f,5.0f)
                curveTo(9.0f,5.0f,11.0f,7.0f,11.0f,9.5f)
                lineTo(11.0f,17.0f)
                curveTo(11.0f,18.10457f,10.104569f,19.0f,9.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,10.0f)
                lineTo(7.0f,10.0f)
            }
}

public val LucideIcons.All.MailboxDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Mailbox: ImageVector
    @Composable get() = MailboxDefinition.asImageVector()
