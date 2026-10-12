package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Trash") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,11.0f)
                lineTo(10.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,11.0f)
                lineTo(14.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,6.0f)
                lineTo(19.0f,20.0f)
                curveTo(19.0f,21.10457f,18.10457f,22.0f,17.0f,22.0f)
                lineTo(7.0f,22.0f)
                curveTo(5.8954306f,22.0f,5.0f,21.10457f,5.0f,20.0f)
                lineTo(5.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,6.0f)
                lineTo(21.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,6.0f)
                lineTo(8.0f,4.0f)
                curveTo(8.0f,2.8954306f,8.895431f,2.0f,10.0f,2.0f)
                lineTo(14.0f,2.0f)
                curveTo(15.104569f,2.0f,16.0f,2.8954306f,16.0f,4.0f)
                lineTo(16.0f,6.0f)
            }
}

public val LucideIcons.All.TrashDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Trash: ImageVector
    @Composable get() = TrashDefinition.asImageVector()
