package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Axis3d") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.5,10.5)
                lineTo(15.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,4.0)
                lineTo(4.0,19.0)
                curveTo(4.0,19.552284240722656,4.4477152824401855,20.0,5.0,20.0)
                lineTo(20.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.293000221252441,19.707000732421875)
                lineTo(6.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,15.0)
                lineTo(10.5,13.5)
            }
}

public val LucideIcons.All.Axis3dDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Axis3d: ImageVector
    @Composable get() = Axis3dDefinition.asImageVector()
