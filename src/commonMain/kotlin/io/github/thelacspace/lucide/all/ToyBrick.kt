package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ToyBrick") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,8.0)
                lineTo(20.0,8.0)
                lineTo(21.0,8.0)
                lineTo(21.0,20.0)
                lineTo(20.0,20.0)
                lineTo(4.0,20.0)
                lineTo(3.0,20.0)
                lineTo(3.0,8.0)
                lineTo(4.0,8.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,8.0)
                lineTo(10.0,5.0)
                curveTo(10.0,4.400000095367432,9.600000381469727,4.0,9.0,4.0)
                lineTo(6.0,4.0)
                curveTo(5.4477152824401855,4.0,5.0,4.4477152824401855,5.0,5.0)
                lineTo(5.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,8.0)
                lineTo(19.0,5.0)
                curveTo(19.0,4.400000095367432,18.600000381469727,4.0,18.0,4.0)
                lineTo(15.0,4.0)
                curveTo(14.447714805603027,4.0,14.0,4.4477152824401855,14.0,5.0)
                lineTo(14.0,8.0)
            }
}

public val LucideIcons.All.ToyBrickDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ToyBrick: ImageVector
    @Composable get() = ToyBrickDefinition.asImageVector()
