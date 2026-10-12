package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Airplay") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,17.0f)
                lineTo(4.0f,17.0f)
                curveTo(2.8954306f,17.0f,2.0f,16.10457f,2.0f,15.0f)
                lineTo(2.0f,5.0f)
                curveTo(2.0f,3.8954306f,2.8954306f,3.0f,4.0f,3.0f)
                lineTo(20.0f,3.0f)
                curveTo(21.10457f,3.0f,22.0f,3.8954306f,22.0f,5.0f)
                lineTo(22.0f,15.0f)
                curveTo(22.0f,16.10457f,21.10457f,17.0f,20.0f,17.0f)
                lineTo(19.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,15.0f)
                lineTo(17.0f,21.0f)
                lineTo(7.0f,21.0f)
                close()
            }
}

public val LucideIcons.All.AirplayDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Airplay: ImageVector
    @Composable get() = AirplayDefinition.asImageVector()
