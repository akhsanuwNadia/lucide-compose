package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareCheckBig") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0,10.656000137329102)
                lineTo(21.0,19.0)
                curveTo(21.0,20.104570388793945,20.104570388793945,21.0,19.0,21.0)
                lineTo(5.0,21.0)
                curveTo(3.895430564880371,21.0,3.0,20.104570388793945,3.0,19.0)
                lineTo(3.0,5.0)
                curveTo(3.0,3.895430564880371,3.895430564880371,3.0,5.0,3.0)
                lineTo(17.3439998626709,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,11.0)
                lineTo(12.0,14.0)
                lineTo(22.0,4.0)
            }
}

public val LucideIcons.All.SquareCheckBigDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareCheckBig: ImageVector
    @Composable get() = SquareCheckBigDefinition.asImageVector()
