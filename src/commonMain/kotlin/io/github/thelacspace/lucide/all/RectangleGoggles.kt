package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RectangleGoggles") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0f,6.0f)
                curveTo(21.10457f,6.0f,22.0f,6.8954306f,22.0f,8.0f)
                lineTo(22.0f,16.0f)
                curveTo(22.0f,17.10457f,21.10457f,18.0f,20.0f,18.0f)
                lineTo(16.0f,18.0f)
                curveTo(15.370485f,18.0f,14.777709f,17.703611f,14.4f,17.2f)
                lineTo(12.799999f,15.070001f)
                curveTo(12.611145f,14.818194f,12.314756f,14.67f,11.999999f,14.67f)
                curveTo(11.685242f,14.67f,11.388853f,14.818194f,11.199999f,15.070001f)
                lineTo(9.6f,17.2f)
                curveTo(9.222291f,17.703611f,8.629515f,18.0f,8.0f,18.0f)
                lineTo(4.0f,18.0f)
                curveTo(2.8954306f,18.0f,2.0f,17.10457f,2.0f,16.0f)
                lineTo(2.0f,8.0f)
                curveTo(2.0f,6.8954306f,2.8954306f,6.0f,4.0f,6.0f)
                close()
            }
}

public val LucideIcons.All.RectangleGogglesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RectangleGoggles: ImageVector
    @Composable get() = RectangleGogglesDefinition.asImageVector()
