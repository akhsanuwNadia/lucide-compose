package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PaintRoller") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,2.0f)
                lineTo(16.0f,2.0f)
                lineTo(18.0f,2.0f)
                lineTo(18.0f,8.0f)
                lineTo(16.0f,8.0f)
                lineTo(4.0f,8.0f)
                lineTo(2.0f,8.0f)
                lineTo(2.0f,2.0f)
                lineTo(4.0f,2.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,16.0f)
                lineTo(10.0f,14.0f)
                curveTo(10.0f,12.895431f,10.895431f,12.0f,12.0f,12.0f)
                lineTo(20.0f,12.0f)
                curveTo(21.10457f,12.0f,22.0f,11.104569f,22.0f,10.0f)
                lineTo(22.0f,7.0f)
                curveTo(22.0f,5.8954306f,21.10457f,5.0f,20.0f,5.0f)
                lineTo(18.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,16.0f)
                lineTo(11.0f,16.0f)
                lineTo(12.0f,16.0f)
                lineTo(12.0f,22.0f)
                lineTo(11.0f,22.0f)
                lineTo(9.0f,22.0f)
                lineTo(8.0f,22.0f)
                lineTo(8.0f,16.0f)
                lineTo(9.0f,16.0f)
                close()
            }
}

public val LucideIcons.All.PaintRollerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PaintRoller: ImageVector
    @Composable get() = PaintRollerDefinition.asImageVector()
