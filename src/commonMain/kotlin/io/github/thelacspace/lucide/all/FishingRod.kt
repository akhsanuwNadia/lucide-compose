package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FishingRod") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,11.0f)
                lineTo(5.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,15.0f)
                curveTo(7.9950757f,16.101078f,7.101089f,16.991076f,6.0f,16.991076f)
                curveTo(4.898911f,16.991076f,4.0049243f,16.101078f,4.0f,15.0f)
                lineTo(4.0f,3.0f)
                curveTo(4.0f,2.4477153f,4.4477153f,2.0f,5.0f,2.0f)
                lineTo(5.5f,2.0f)
                curveTo(14.0f,2.0f,20.0f,9.0f,20.0f,18.0f)
                lineTo(20.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,18.0f)
                curveTo(15.996795f,18.716661f,16.37729f,19.38026f,16.99741f,19.73952f)
                curveTo(17.617527f,20.09878f,18.382473f,20.09878f,19.00259f,19.73952f)
                curveTo(19.62271f,19.38026f,20.003204f,18.716661f,20.0f,18.0f)
                curveTo(20.003204f,17.283339f,19.62271f,16.61974f,19.00259f,16.26048f)
                curveTo(18.382473f,15.901221f,17.617527f,15.901221f,16.99741f,16.26048f)
                curveTo(16.37729f,16.61974f,15.996795f,17.283339f,16.0f,18.0f)
            }
}

public val LucideIcons.All.FishingRodDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FishingRod: ImageVector
    @Composable get() = FishingRodDefinition.asImageVector()
