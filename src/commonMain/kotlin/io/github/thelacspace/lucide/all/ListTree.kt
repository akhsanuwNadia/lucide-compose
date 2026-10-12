package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListTree") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0f,5.0f)
                lineTo(21.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,12.0f)
                lineTo(21.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,19.0f)
                lineTo(21.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,10.0f)
                curveTo(3.0f,11.104569f,3.8954306f,12.0f,5.0f,12.0f)
                lineTo(8.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,5.0f)
                lineTo(3.0f,17.0f)
                curveTo(3.0f,18.10457f,3.8954306f,19.0f,5.0f,19.0f)
                lineTo(8.0f,19.0f)
            }
}

public val LucideIcons.All.ListTreeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListTree: ImageVector
    @Composable get() = ListTreeDefinition.asImageVector()
