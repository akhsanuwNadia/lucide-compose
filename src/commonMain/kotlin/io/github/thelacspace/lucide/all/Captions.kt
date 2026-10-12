package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Captions") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,5.0f)
                lineTo(19.0f,5.0f)
                curveTo(20.10457f,5.0f,21.0f,5.8954306f,21.0f,7.0f)
                lineTo(21.0f,17.0f)
                curveTo(21.0f,18.10457f,20.10457f,19.0f,19.0f,19.0f)
                lineTo(5.0f,19.0f)
                curveTo(3.8954306f,19.0f,3.0f,18.10457f,3.0f,17.0f)
                lineTo(3.0f,7.0f)
                curveTo(3.0f,5.8954306f,3.8954306f,5.0f,5.0f,5.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,15.0f)
                lineTo(11.0f,15.0f)
                moveTo(15.0f,15.0f)
                lineTo(17.0f,15.0f)
                moveTo(7.0f,11.0f)
                lineTo(9.0f,11.0f)
                moveTo(13.0f,11.0f)
                lineTo(17.0f,11.0f)
            }
}

public val LucideIcons.All.CaptionsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Captions: ImageVector
    @Composable get() = CaptionsDefinition.asImageVector()
