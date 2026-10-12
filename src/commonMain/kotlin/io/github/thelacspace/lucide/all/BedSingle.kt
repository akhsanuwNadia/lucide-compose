package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BedSingle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,20.0)
                lineTo(3.0,12.0)
                curveTo(3.0,10.895430564880371,3.895430564880371,10.0,5.0,10.0)
                lineTo(19.0,10.0)
                curveTo(20.104570388793945,10.0,21.0,10.895430564880371,21.0,12.0)
                lineTo(21.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,10.0)
                lineTo(5.0,6.0)
                curveTo(5.0,4.895430564880371,5.895430564880371,4.0,7.0,4.0)
                lineTo(17.0,4.0)
                curveTo(18.104570388793945,4.0,19.0,4.895430564880371,19.0,6.0)
                lineTo(19.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,18.0)
                lineTo(21.0,18.0)
            }
}

public val LucideIcons.All.BedSingleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BedSingle: ImageVector
    @Composable get() = BedSingleDefinition.asImageVector()
