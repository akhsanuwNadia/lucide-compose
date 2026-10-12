package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Spline") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0f,5.0f)
                curveTo(16.996796f,5.716662f,17.37729f,6.3802605f,17.99741f,6.7395196f)
                curveTo(18.617527f,7.098779f,19.382473f,7.098779f,20.00259f,6.7395196f)
                curveTo(20.62271f,6.3802605f,21.003204f,5.716662f,21.0f,5.0f)
                curveTo(21.003204f,4.283338f,20.62271f,3.6197395f,20.00259f,3.2604802f)
                curveTo(19.382473f,2.9012208f,18.617527f,2.9012208f,17.99741f,3.2604802f)
                curveTo(17.37729f,3.6197395f,16.996796f,4.283338f,17.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,19.0f)
                curveTo(2.996795f,19.716661f,3.3772902f,20.38026f,3.997409f,20.73952f)
                curveTo(4.617528f,21.09878f,5.382472f,21.09878f,6.0025907f,20.73952f)
                curveTo(6.6227098f,20.38026f,7.003205f,19.716661f,7.0f,19.0f)
                curveTo(7.003205f,18.283339f,6.6227098f,17.61974f,6.0025907f,17.26048f)
                curveTo(5.382472f,16.90122f,4.617528f,16.90122f,3.997409f,17.26048f)
                curveTo(3.3772902f,17.61974f,2.996795f,18.283339f,3.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,17.0f)
                curveTo(5.0f,10.372583f,10.372583f,5.0f,17.0f,5.0f)
            }
}

public val LucideIcons.All.SplineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Spline: ImageVector
    @Composable get() = SplineDefinition.asImageVector()
