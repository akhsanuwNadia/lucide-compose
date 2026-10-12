package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Ruler") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.3f,15.3f)
                curveTo(21.75189f,15.750324f,22.005892f,16.362038f,22.005892f,17.0f)
                curveTo(22.005892f,17.637964f,21.75189f,18.249676f,21.3f,18.7f)
                lineTo(18.699999f,21.300001f)
                curveTo(18.249674f,21.751892f,17.637962f,22.005894f,17.0f,22.005894f)
                curveTo(16.362036f,22.005894f,15.750323f,21.751892f,15.299999f,21.300001f)
                lineTo(2.7f,8.7f)
                curveTo(1.7643263f,7.759788f,1.7643263f,6.2402115f,2.7f,5.2999997f)
                lineTo(5.3f,2.6999998f)
                curveTo(6.240212f,1.7643257f,7.759789f,1.7643257f,8.700001f,2.6999998f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.5f,12.5f)
                lineTo(16.5f,10.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.5f,9.5f)
                lineTo(13.5f,7.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f,6.5f)
                lineTo(10.5f,4.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.5f,15.5f)
                lineTo(19.5f,13.5f)
            }
}

public val LucideIcons.All.RulerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Ruler: ImageVector
    @Composable get() = RulerDefinition.asImageVector()
