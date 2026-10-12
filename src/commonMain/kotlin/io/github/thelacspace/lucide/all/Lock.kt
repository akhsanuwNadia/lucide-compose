package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Lock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,11.0)
                lineTo(19.0,11.0)
                curveTo(20.104570388793945,11.0,21.0,11.895430564880371,21.0,13.0)
                lineTo(21.0,20.0)
                curveTo(21.0,21.104570388793945,20.104570388793945,22.0,19.0,22.0)
                lineTo(5.0,22.0)
                curveTo(3.895430564880371,22.0,3.0,21.104570388793945,3.0,20.0)
                lineTo(3.0,13.0)
                curveTo(3.0,11.895430564880371,3.895430564880371,11.0,5.0,11.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,11.0)
                lineTo(7.0,7.0)
                curveTo(7.01231050491333,4.247304439544678,9.24727725982666,2.022310733795166,12.0,2.022310733795166)
                curveTo(14.75272274017334,2.022310733795166,16.987689971923828,4.247304439544678,17.0,7.0)
                lineTo(17.0,11.0)
            }
}

public val LucideIcons.All.LockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Lock: ImageVector
    @Composable get() = LockDefinition.asImageVector()
