package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Plug") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,22.0)
                lineTo(12.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,8.0)
                lineTo(15.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,8.0)
                curveTo(17.552284240722656,8.0,18.0,8.447714805603027,18.0,9.0)
                lineTo(18.0,13.0)
                curveTo(18.0,15.209138870239258,16.209138870239258,17.0,14.0,17.0)
                lineTo(10.0,17.0)
                curveTo(7.790861129760742,17.0,6.0,15.209138870239258,6.0,13.0)
                lineTo(6.0,9.0)
                curveTo(6.0,8.447714805603027,6.4477152824401855,8.0,7.0,8.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,8.0)
                lineTo(9.0,2.0)
            }
}

public val LucideIcons.All.PlugDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Plug: ImageVector
    @Composable get() = PlugDefinition.asImageVector()
