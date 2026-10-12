package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DoorStairwell") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,17.0f)
                lineTo(12.0f,14.0f)
                curveTo(12.0f,13.447715f,12.447715f,13.0f,13.0f,13.0f)
                lineTo(19.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,17.0f)
                lineTo(10.0f,17.0f)
                curveTo(9.447715f,17.0f,9.0f,17.447716f,9.0f,18.0f)
                lineTo(9.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,21.0f)
                lineTo(19.0f,5.0f)
                curveTo(19.0f,3.8954306f,18.10457f,3.0f,17.0f,3.0f)
                lineTo(7.0f,3.0f)
                curveTo(5.8954306f,3.0f,5.0f,3.8954306f,5.0f,5.0f)
                lineTo(5.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,9.0f)
                lineTo(16.0f,9.0f)
                curveTo(15.447715f,9.0f,15.0f,9.447715f,15.0f,10.0f)
                lineTo(15.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,21.0f)
                lineTo(2.0f,21.0f)
            }
}

public val LucideIcons.All.DoorStairwellDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DoorStairwell: ImageVector
    @Composable get() = DoorStairwellDefinition.asImageVector()
