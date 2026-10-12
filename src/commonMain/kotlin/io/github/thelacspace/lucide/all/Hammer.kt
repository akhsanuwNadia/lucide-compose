package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Hammer") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,12.0f)
                lineTo(5.627f,21.373001f)
                curveTo(4.797497f,22.195393f,3.4592853f,22.192623f,2.633193f,21.366806f)
                curveTo(1.807101f,20.540989f,1.8038857f,19.202778f,2.626f,18.373001f)
                lineTo(12.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,15.0f)
                lineTo(22.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.5f,11.5f)
                lineTo(19.586f,9.586f)
                curveTo(19.210901f,9.211015f,19.000113f,8.70239f,19.0f,8.172f)
                lineTo(19.0f,7.828f)
                curveTo(18.999887f,7.2976103f,18.789099f,6.7889853f,18.414f,6.414f)
                lineTo(16.757f,4.757f)
                curveTo(15.632125f,3.6323154f,14.106679f,3.0003397f,12.516f,3.0f)
                lineTo(9.0f,3.0f)
                lineTo(10.243f,4.243f)
                curveTo(11.367929f,5.36812f,11.999926f,6.8939743f,12.0f,8.485f)
                lineTo(12.0f,10.0f)
                lineTo(14.0f,12.0f)
                lineTo(15.172f,12.0f)
                curveTo(15.70239f,12.0001135f,16.211016f,12.210901f,16.586f,12.586f)
                lineTo(18.5f,14.5f)
            }
}

public val LucideIcons.All.HammerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Hammer: ImageVector
    @Composable get() = HammerDefinition.asImageVector()
