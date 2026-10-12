package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Can") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0f,10.5f)
                curveTo(20.97784f,11.876348f,16.9549f,12.988845f,12.0f,12.988845f)
                curveTo(7.045099f,12.988845f,3.0221589f,11.876348f,3.0f,10.5f)
                lineTo(3.0f,18.5f)
                curveTo(3.0221589f,19.876348f,7.045099f,20.988844f,12.0f,20.988844f)
                curveTo(16.9549f,20.988844f,20.97784f,19.876348f,21.0f,18.5f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,10.5f)
                curveTo(20.948538f,8.973226f,17.278175f,6.1881723f,12.775345f,4.259172f)
                curveTo(8.272515f,2.3301716f,4.619694f,1.9779929f,4.59f,3.47f)
                curveTo(4.641462f,4.996774f,8.311825f,7.781828f,12.814655f,9.710828f)
                curveTo(17.317486f,11.639829f,20.970306f,11.992007f,21.0f,10.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,10.5f)
                curveTo(2.9980218f,9.383398f,5.661961f,8.401817f,9.527f,8.095f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,16.858f)
                curveTo(10.995296f,17.052004f,13.004704f,17.052004f,15.0f,16.858f)
            }
}

public val LucideIcons.All.CanDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Can: ImageVector
    @Composable get() = CanDefinition.asImageVector()
