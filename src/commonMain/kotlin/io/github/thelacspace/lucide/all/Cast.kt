package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cast") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,8.0f)
                lineTo(2.0f,6.0f)
                curveTo(2.0f,4.8954306f,2.8954306f,4.0f,4.0f,4.0f)
                lineTo(20.0f,4.0f)
                curveTo(21.10457f,4.0f,22.0f,4.8954306f,22.0f,6.0f)
                lineTo(22.0f,18.0f)
                curveTo(22.0f,19.10457f,21.10457f,20.0f,20.0f,20.0f)
                lineTo(14.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                curveTo(6.218951f,12.447715f,9.552285f,15.781049f,10.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,16.0f)
                curveTo(4.03192f,16.378431f,5.6215677f,17.96808f,6.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,20.0f)
                lineTo(2.01f,20.0f)
            }
}

public val LucideIcons.All.CastDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cast: ImageVector
    @Composable get() = CastDefinition.asImageVector()
