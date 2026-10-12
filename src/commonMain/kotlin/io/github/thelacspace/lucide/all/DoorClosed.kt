package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DoorClosed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0f,21.0f)
                lineTo(19.0f,5.0f)
                curveTo(19.0f,3.8954306f,18.10457f,3.0f,17.0f,3.0f)
                lineTo(7.0f,3.0f)
                curveTo(5.8954306f,3.0f,5.0f,3.8954306f,5.0f,5.0f)
                lineTo(5.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,21.0f)
                lineTo(22.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,12.0f)
                lineTo(9.01f,12.0f)
            }
}

public val LucideIcons.All.DoorClosedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DoorClosed: ImageVector
    @Composable get() = DoorClosedDefinition.asImageVector()
