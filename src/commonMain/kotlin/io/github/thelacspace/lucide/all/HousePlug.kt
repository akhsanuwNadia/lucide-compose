package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HousePlug") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,12.0f)
                lineTo(10.0f,8.964f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,12.0f)
                lineTo(14.0f,8.964f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,12.0f)
                curveTo(15.552285f,12.0f,16.0f,12.447715f,16.0f,13.0f)
                lineTo(16.0f,15.0f)
                curveTo(16.0f,16.10457f,15.104569f,17.0f,14.0f,17.0f)
                lineTo(10.0f,17.0f)
                curveTo(8.895431f,17.0f,8.0f,16.10457f,8.0f,15.0f)
                lineTo(8.0f,13.0f)
                curveTo(8.0f,12.447715f,8.447715f,12.0f,9.0f,12.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f,21.0f)
                lineTo(5.0f,21.0f)
                curveTo(3.8954306f,21.0f,3.0f,20.10457f,3.0f,19.0f)
                lineTo(3.0f,10.0f)
                curveTo(2.9998589f,9.411126f,3.2592418f,8.852118f,3.709f,8.472f)
                lineTo(10.709f,2.4720001f)
                curveTo(11.454388f,1.8420277f,12.545611f,1.8420277f,13.290999f,2.4720001f)
                lineTo(20.291f,8.472f)
                curveTo(20.740759f,8.8521185f,21.000141f,9.411126f,21.0f,10.0f)
                lineTo(21.0f,19.0f)
                curveTo(21.0f,20.10457f,20.10457f,21.0f,19.0f,21.0f)
                lineTo(14.0f,21.0f)
                curveTo(12.895431f,21.0f,12.0f,20.10457f,12.0f,19.0f)
                lineTo(12.0f,17.0f)
            }
}

public val LucideIcons.All.HousePlugDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HousePlug: ImageVector
    @Composable get() = HousePlugDefinition.asImageVector()
