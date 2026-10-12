package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("StarHalf") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,18.338f)
                curveTo(11.655981f,18.33726f,11.317048f,18.42105f,11.0130005f,18.581999f)
                lineTo(6.396f,21.01f)
                curveTo(6.2171383f,21.104689f,5.9999666f,21.089252f,5.8362956f,20.970219f)
                curveTo(5.672624f,20.851185f,5.5910273f,20.649336f,5.626f,20.45f)
                lineTo(6.507f,15.311001f)
                curveTo(6.6254973f,14.622245f,6.3969307f,13.919336f,5.896f,13.432001f)
                lineTo(2.16f,9.795f)
                curveTo(2.0143125f,9.654288f,1.9615612f,9.442847f,2.0240786f,9.250191f)
                curveTo(2.086596f,9.057535f,2.2534492f,8.9173565f,2.454f,8.889f)
                lineTo(7.619f,8.134f)
                curveTo(8.309849f,8.033844f,8.907114f,7.6000133f,9.216f,6.974f)
                lineTo(11.525f,2.295f)
                curveTo(11.614364f,2.1143506f,11.798455f,2.0000198f,12.0f,2.0f)
            }
}

public val LucideIcons.All.StarHalfDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.StarHalf: ImageVector
    @Composable get() = StarHalfDefinition.asImageVector()
