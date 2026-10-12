package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HardHat") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,10.0)
                lineTo(10.0,5.0)
                curveTo(10.0,4.4477152824401855,10.447714805603027,4.0,11.0,4.0)
                lineTo(13.0,4.0)
                curveTo(13.552285194396973,4.0,14.0,4.4477152824401855,14.0,5.0)
                lineTo(14.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,6.0)
                curveTo(17.313709259033203,6.0,20.0,8.686291694641113,20.0,12.0)
                lineTo(20.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,15.0)
                lineTo(4.0,12.0)
                curveTo(4.0,8.686291694641113,6.686291694641113,6.0,10.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,15.0)
                lineTo(21.0,15.0)
                lineTo(22.0,15.0)
                lineTo(22.0,19.0)
                lineTo(21.0,19.0)
                lineTo(3.0,19.0)
                lineTo(2.0,19.0)
                lineTo(2.0,15.0)
                lineTo(3.0,15.0)
                close()
            }
}

public val LucideIcons.All.HardHatDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HardHat: ImageVector
    @Composable get() = HardHatDefinition.asImageVector()
