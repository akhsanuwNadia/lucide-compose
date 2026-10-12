package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Regex") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0f,3.0f)
                lineTo(17.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.67f,5.5f)
                lineTo(21.33f,10.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.67f,10.5f)
                lineTo(21.33f,5.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,17.0f)
                curveTo(9.0f,15.895431f,8.104569f,15.0f,7.0f,15.0f)
                lineTo(5.0f,15.0f)
                curveTo(3.8954306f,15.0f,3.0f,15.895431f,3.0f,17.0f)
                lineTo(3.0f,19.0f)
                curveTo(3.0f,20.10457f,3.8954306f,21.0f,5.0f,21.0f)
                lineTo(7.0f,21.0f)
                curveTo(8.104569f,21.0f,9.0f,20.10457f,9.0f,19.0f)
                lineTo(9.0f,17.0f)
                close()
            }
}

public val LucideIcons.All.RegexDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Regex: ImageVector
    @Composable get() = RegexDefinition.asImageVector()
