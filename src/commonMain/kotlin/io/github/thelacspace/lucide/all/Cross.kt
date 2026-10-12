package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cross") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,9.0f)
                curveTo(2.8954306f,9.0f,2.0f,9.895431f,2.0f,11.0f)
                lineTo(2.0f,13.0f)
                curveTo(2.0f,14.104569f,2.8954306f,15.0f,4.0f,15.0f)
                lineTo(8.0f,15.0f)
                curveTo(8.552285f,15.0f,9.0f,15.447715f,9.0f,16.0f)
                lineTo(9.0f,20.0f)
                curveTo(9.0f,21.10457f,9.895431f,22.0f,11.0f,22.0f)
                lineTo(13.0f,22.0f)
                curveTo(14.104569f,22.0f,15.0f,21.10457f,15.0f,20.0f)
                lineTo(15.0f,16.0f)
                curveTo(15.0f,15.447715f,15.447715f,15.0f,16.0f,15.0f)
                lineTo(20.0f,15.0f)
                curveTo(21.10457f,15.0f,22.0f,14.104569f,22.0f,13.0f)
                lineTo(22.0f,11.0f)
                curveTo(22.0f,9.895431f,21.10457f,9.0f,20.0f,9.0f)
                lineTo(16.0f,9.0f)
                curveTo(15.447715f,9.0f,15.0f,8.552285f,15.0f,8.0f)
                lineTo(15.0f,4.0f)
                curveTo(15.0f,2.8954306f,14.104569f,2.0f,13.0f,2.0f)
                lineTo(11.0f,2.0f)
                curveTo(9.895431f,2.0f,9.0f,2.8954306f,9.0f,4.0f)
                lineTo(9.0f,8.0f)
                curveTo(9.0f,8.552285f,8.552285f,9.0f,8.0f,9.0f)
                close()
            }
}

public val LucideIcons.All.CrossDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cross: ImageVector
    @Composable get() = CrossDefinition.asImageVector()
