package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Axis3d") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.5f,10.5f)
                lineTo(15.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,4.0f)
                lineTo(4.0f,19.0f)
                curveTo(4.0f,19.552284f,4.4477153f,20.0f,5.0f,20.0f)
                lineTo(20.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.293f,19.707f)
                lineTo(6.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,15.0f)
                lineTo(10.5f,13.5f)
            }
}

public val LucideIcons.All.Axis3dDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Axis3d: ImageVector
    @Composable get() = Axis3dDefinition.asImageVector()
