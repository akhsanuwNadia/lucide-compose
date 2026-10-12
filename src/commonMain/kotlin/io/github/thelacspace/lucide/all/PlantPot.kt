package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PlantPot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,8.536f)
                lineTo(14.0f,6.0f)
                curveTo(14.0f,3.790861f,15.790861f,2.0f,18.0f,2.0f)
                lineTo(19.5f,2.0f)
                curveTo(19.776142f,2.0f,20.0f,2.2238576f,20.0f,2.5f)
                lineTo(20.0f,4.0f)
                curveTo(20.0f,6.209139f,18.209139f,8.0f,16.0f,8.0f)
                curveTo(13.790861f,8.0f,12.0f,9.790861f,12.0f,12.0f)
                curveTo(10.484912f,13.136316f,8.457852f,13.319096f,6.763932f,12.472136f)
                curveTo(5.070012f,11.625175f,4.0f,9.89386f,4.0f,8.0f)
                curveTo(5.515088f,6.8636837f,7.5421476f,6.680904f,9.236068f,7.527864f)
                curveTo(10.929988f,8.374825f,12.0f,10.10614f,12.0f,12.0f)
                curveTo(12.0f,14.0f,13.0f,15.0f,13.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,17.0f)
                lineTo(16.915f,20.58f)
                curveTo(16.65936f,21.423635f,15.881518f,22.000418f,15.0f,22.0f)
                lineTo(9.002f,22.0f)
                curveTo(8.12177f,21.999804f,7.345147f,21.424137f,7.0889997f,20.582f)
                lineTo(6.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,17.0f)
                lineTo(19.0f,17.0f)
            }
}

public val LucideIcons.All.PlantPotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PlantPot: ImageVector
    @Composable get() = PlantPotDefinition.asImageVector()
