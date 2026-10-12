package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderMinus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0,13.0)
                lineTo(15.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,20.0)
                curveTo(21.104570388793945,20.0,22.0,19.104570388793945,22.0,18.0)
                lineTo(22.0,8.0)
                curveTo(22.0,6.895430564880371,21.104570388793945,6.0,20.0,6.0)
                lineTo(12.100000381469727,6.0)
                curveTo(11.420332908630371,6.006663799285889,10.783802032470703,5.667683124542236,10.40999984741211,5.099999904632568)
                lineTo(9.600000381469727,3.9000000953674316)
                curveTo(9.230077743530273,3.3382794857025146,8.60258674621582,3.000110626220703,7.929999828338623,3.0)
                lineTo(4.0,3.0)
                curveTo(2.895430564880371,3.0,2.0,3.895430564880371,2.0,5.0)
                lineTo(2.0,18.0)
                curveTo(2.0,19.104570388793945,2.895430564880371,20.0,4.0,20.0)
                close()
            }
}

public val LucideIcons.All.FolderMinusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderMinus: ImageVector
    @Composable get() = FolderMinusDefinition.asImageVector()
