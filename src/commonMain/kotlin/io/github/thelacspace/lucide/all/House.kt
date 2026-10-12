package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("House") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,21.0f)
                lineTo(15.0f,13.0f)
                curveTo(15.0f,12.447715f,14.552285f,12.0f,14.0f,12.0f)
                lineTo(10.0f,12.0f)
                curveTo(9.447715f,12.0f,9.0f,12.447715f,9.0f,13.0f)
                lineTo(9.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,10.0f)
                curveTo(2.9998589f,9.411126f,3.2592418f,8.852118f,3.709f,8.472f)
                lineTo(10.709f,2.4720001f)
                curveTo(11.454388f,1.8420277f,12.545611f,1.8420277f,13.290999f,2.4720001f)
                lineTo(20.291f,8.472f)
                curveTo(20.740759f,8.8521185f,21.000141f,9.411126f,21.0f,10.0f)
                lineTo(21.0f,19.0f)
                curveTo(21.0f,20.10457f,20.10457f,21.0f,19.0f,21.0f)
                lineTo(5.0f,21.0f)
                curveTo(3.8954306f,21.0f,3.0f,20.10457f,3.0f,19.0f)
                close()
            }
}

public val LucideIcons.All.HouseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.House: ImageVector
    @Composable get() = HouseDefinition.asImageVector()
