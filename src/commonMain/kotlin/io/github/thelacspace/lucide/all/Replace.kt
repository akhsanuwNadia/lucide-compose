package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Replace") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,4.0f)
                curveTo(14.0f,3.4477153f,14.447715f,3.0f,15.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,10.0f)
                curveTo(14.447715f,10.0f,14.0f,9.552285f,14.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,4.0f)
                curveTo(21.0f,3.4477153f,20.552284f,3.0f,20.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,9.0f)
                curveTo(21.0f,9.552285f,20.552284f,10.0f,20.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,7.0f)
                lineTo(6.0f,10.0f)
                lineTo(9.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,10.0f)
                lineTo(6.0f,5.0f)
                curveTo(6.0f,3.8954306f,6.8954306f,3.0f,8.0f,3.0f)
                lineTo(10.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,14.0f)
                lineTo(9.0f,14.0f)
                lineTo(10.0f,14.0f)
                lineTo(10.0f,21.0f)
                lineTo(9.0f,21.0f)
                lineTo(4.0f,21.0f)
                lineTo(3.0f,21.0f)
                lineTo(3.0f,14.0f)
                lineTo(4.0f,14.0f)
                close()
            }
}

public val LucideIcons.All.ReplaceDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Replace: ImageVector
    @Composable get() = ReplaceDefinition.asImageVector()
