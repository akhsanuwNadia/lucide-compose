package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TouchpadOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,20.0f)
                lineTo(12.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.656f,14.0f)
                lineTo(22.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,14.0f)
                lineTo(14.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,20.0f)
                lineTo(4.0f,20.0f)
                curveTo(2.8954306f,20.0f,2.0f,19.10457f,2.0f,18.0f)
                lineTo(2.0f,6.0f)
                curveTo(2.0f,4.8954306f,2.8954306f,4.0f,4.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.656f,4.0f)
                lineTo(20.0f,4.0f)
                curveTo(21.10457f,4.0f,22.0f,4.8954306f,22.0f,6.0f)
                lineTo(22.0f,16.344f)
            }
}

public val LucideIcons.All.TouchpadOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TouchpadOff: ImageVector
    @Composable get() = TouchpadOffDefinition.asImageVector()
