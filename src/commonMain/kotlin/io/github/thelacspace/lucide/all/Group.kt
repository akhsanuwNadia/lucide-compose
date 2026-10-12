package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Group") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,7.0f)
                lineTo(3.0f,5.0f)
                curveTo(3.0f,3.9f,3.9f,3.0f,5.0f,3.0f)
                lineTo(7.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,3.0f)
                lineTo(19.0f,3.0f)
                curveTo(20.1f,3.0f,21.0f,3.9f,21.0f,5.0f)
                lineTo(21.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,17.0f)
                lineTo(21.0f,19.0f)
                curveTo(21.0f,20.1f,20.1f,21.0f,19.0f,21.0f)
                lineTo(17.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,21.0f)
                lineTo(5.0f,21.0f)
                curveTo(3.9f,21.0f,3.0f,20.1f,3.0f,19.0f)
                lineTo(3.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,7.0f)
                lineTo(13.0f,7.0f)
                lineTo(14.0f,7.0f)
                lineTo(14.0f,12.0f)
                lineTo(13.0f,12.0f)
                lineTo(8.0f,12.0f)
                lineTo(7.0f,12.0f)
                lineTo(7.0f,7.0f)
                lineTo(8.0f,7.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,12.0f)
                lineTo(16.0f,12.0f)
                lineTo(17.0f,12.0f)
                lineTo(17.0f,17.0f)
                lineTo(16.0f,17.0f)
                lineTo(11.0f,17.0f)
                lineTo(10.0f,17.0f)
                lineTo(10.0f,12.0f)
                lineTo(11.0f,12.0f)
                close()
            }
}

public val LucideIcons.All.GroupDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Group: ImageVector
    @Composable get() = GroupDefinition.asImageVector()
