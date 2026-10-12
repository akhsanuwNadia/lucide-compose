package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Braces") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0f,3.0f)
                lineTo(7.0f,3.0f)
                curveTo(5.8954306f,3.0f,5.0f,3.8954306f,5.0f,5.0f)
                lineTo(5.0f,10.0f)
                curveTo(5.0f,11.104569f,4.1045694f,12.0f,3.0f,12.0f)
                curveTo(4.1045694f,12.0f,5.0f,12.895431f,5.0f,14.0f)
                lineTo(5.0f,19.0f)
                curveTo(5.0f,20.1f,5.9f,21.0f,7.0f,21.0f)
                lineTo(8.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,21.0f)
                lineTo(17.0f,21.0f)
                curveTo(18.10457f,21.0f,19.0f,20.10457f,19.0f,19.0f)
                lineTo(19.0f,14.0f)
                curveTo(19.0f,12.9f,19.9f,12.0f,21.0f,12.0f)
                curveTo(19.89543f,12.0f,19.0f,11.104569f,19.0f,10.0f)
                lineTo(19.0f,5.0f)
                curveTo(19.0f,3.8954306f,18.10457f,3.0f,17.0f,3.0f)
                lineTo(16.0f,3.0f)
            }
}

public val LucideIcons.All.BracesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Braces: ImageVector
    @Composable get() = BracesDefinition.asImageVector()
