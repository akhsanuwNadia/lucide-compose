package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Mailbox") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0,17.0)
                curveTo(22.0,18.104570388793945,21.104570388793945,19.0,20.0,19.0)
                lineTo(4.0,19.0)
                curveTo(2.895430564880371,19.0,2.0,18.104570388793945,2.0,17.0)
                lineTo(2.0,9.5)
                curveTo(2.0,7.0,4.0,5.0,6.5,5.0)
                lineTo(18.0,5.0)
                curveTo(20.200000762939453,5.0,22.0,6.800000190734863,22.0,9.0)
                lineTo(22.0,17.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,9.0)
                lineTo(18.0,9.0)
                lineTo(18.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.5,5.0)
                curveTo(9.0,5.0,11.0,7.0,11.0,9.5)
                lineTo(11.0,17.0)
                curveTo(11.0,18.104570388793945,10.104569435119629,19.0,9.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,10.0)
                lineTo(7.0,10.0)
            }
}

public val LucideIcons.All.MailboxDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Mailbox: ImageVector
    @Composable get() = MailboxDefinition.asImageVector()
