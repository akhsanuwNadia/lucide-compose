package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquaresUnite") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,16.0)
                curveTo(2.895430564880371,16.0,2.0,15.104569435119629,2.0,14.0)
                lineTo(2.0,4.0)
                curveTo(2.0,2.895430564880371,2.895430564880371,2.0,4.0,2.0)
                lineTo(14.0,2.0)
                curveTo(15.104569435119629,2.0,16.0,2.895430564880371,16.0,4.0)
                lineTo(16.0,7.0)
                curveTo(16.0,7.5522847175598145,16.447715759277344,8.0,17.0,8.0)
                lineTo(20.0,8.0)
                curveTo(21.104570388793945,8.0,22.0,8.895430564880371,22.0,10.0)
                lineTo(22.0,20.0)
                curveTo(22.0,21.104570388793945,21.104570388793945,22.0,20.0,22.0)
                lineTo(10.0,22.0)
                curveTo(8.895430564880371,22.0,8.0,21.104570388793945,8.0,20.0)
                lineTo(8.0,17.0)
                curveTo(8.0,16.447715759277344,7.5522847175598145,16.0,7.0,16.0)
                close()
            }
}

public val LucideIcons.All.SquaresUniteDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquaresUnite: ImageVector
    @Composable get() = SquaresUniteDefinition.asImageVector()
