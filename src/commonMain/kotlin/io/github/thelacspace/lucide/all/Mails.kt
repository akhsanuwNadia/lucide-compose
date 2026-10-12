package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Mails") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0,19.0)
                curveTo(17.0,20.104570388793945,16.104570388793945,21.0,15.0,21.0)
                lineTo(4.0,21.0)
                curveTo(2.895430564880371,21.0,2.0,20.104570388793945,2.0,19.0)
                lineTo(2.0,11.0)
                curveTo(2.0000181198120117,10.285487174987793,2.381213426589966,9.625256538391113,3.0,9.267999649047852)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,5.5)
                lineTo(15.580999374389648,9.678999900817871)
                curveTo(14.922428131103516,10.102082252502441,14.077570915222168,10.102082252502441,13.418999671936035,9.678999900817871)
                lineTo(7.0,5.5)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,3.0)
                lineTo(20.0,3.0)
                lineTo(22.0,3.0)
                lineTo(22.0,15.0)
                lineTo(20.0,15.0)
                lineTo(9.0,15.0)
                lineTo(7.0,15.0)
                lineTo(7.0,3.0)
                lineTo(9.0,3.0)
                close()
            }
}

public val LucideIcons.All.MailsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Mails: ImageVector
    @Composable get() = MailsDefinition.asImageVector()
