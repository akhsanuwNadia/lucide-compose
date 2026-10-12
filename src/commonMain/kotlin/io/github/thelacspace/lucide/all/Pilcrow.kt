package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Pilcrow") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0,4.0)
                lineTo(13.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,4.0)
                lineTo(17.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,4.0)
                lineTo(9.5,4.0)
                curveTo(7.022573947906494,4.01107931137085,5.020079612731934,6.022549152374268,5.020079612731934,8.5)
                curveTo(5.020079612731934,10.977450370788574,7.022573947906494,12.988920211791992,9.5,13.0)
                lineTo(13.0,13.0)
            }
}

public val LucideIcons.All.PilcrowDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Pilcrow: ImageVector
    @Composable get() = PilcrowDefinition.asImageVector()
