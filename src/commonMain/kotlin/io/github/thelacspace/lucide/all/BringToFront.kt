package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BringToFront") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,8.0f)
                lineTo(14.0f,8.0f)
                lineTo(16.0f,8.0f)
                lineTo(16.0f,16.0f)
                lineTo(14.0f,16.0f)
                lineTo(10.0f,16.0f)
                lineTo(8.0f,16.0f)
                lineTo(8.0f,8.0f)
                lineTo(10.0f,8.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,10.0f)
                curveTo(2.8954306f,10.0f,2.0f,9.104569f,2.0f,8.0f)
                lineTo(2.0f,4.0f)
                curveTo(2.0f,2.8954306f,2.8954306f,2.0f,4.0f,2.0f)
                lineTo(8.0f,2.0f)
                curveTo(9.104569f,2.0f,10.0f,2.8954306f,10.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,20.0f)
                curveTo(14.0f,21.10457f,14.895431f,22.0f,16.0f,22.0f)
                lineTo(20.0f,22.0f)
                curveTo(21.10457f,22.0f,22.0f,21.10457f,22.0f,20.0f)
                lineTo(22.0f,16.0f)
                curveTo(22.0f,14.895431f,21.10457f,14.0f,20.0f,14.0f)
            }
}

public val LucideIcons.All.BringToFrontDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BringToFront: ImageVector
    @Composable get() = BringToFrontDefinition.asImageVector()
