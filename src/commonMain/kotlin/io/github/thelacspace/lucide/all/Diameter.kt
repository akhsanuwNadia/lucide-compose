package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Diameter") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0f,19.0f)
                curveTo(16.996796f,19.716661f,17.37729f,20.38026f,17.99741f,20.73952f)
                curveTo(18.617527f,21.09878f,19.382473f,21.09878f,20.00259f,20.73952f)
                curveTo(20.62271f,20.38026f,21.003204f,19.716661f,21.0f,19.0f)
                curveTo(21.003204f,18.283339f,20.62271f,17.61974f,20.00259f,17.26048f)
                curveTo(19.382473f,16.90122f,18.617527f,16.90122f,17.99741f,17.26048f)
                curveTo(17.37729f,17.61974f,16.996796f,18.283339f,17.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,5.0f)
                curveTo(2.996795f,5.716662f,3.3772902f,6.3802605f,3.997409f,6.7395196f)
                curveTo(4.617528f,7.098779f,5.382472f,7.098779f,6.0025907f,6.7395196f)
                curveTo(6.6227098f,6.3802605f,7.003205f,5.716662f,7.0f,5.0f)
                curveTo(7.003205f,4.283338f,6.6227098f,3.6197395f,6.0025907f,3.2604802f)
                curveTo(5.382472f,2.9012208f,4.617528f,2.9012208f,3.997409f,3.2604802f)
                curveTo(3.3772902f,3.6197395f,2.996795f,4.283338f,3.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.48f,3.66f)
                curveTo(10.444898f,1.0321004f,15.712186f,1.5608137f,19.075686f,4.9243145f)
                curveTo(22.439186f,8.287815f,22.9679f,13.555102f,20.34f,17.52f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.41f,6.41f)
                lineTo(17.59f,17.59f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.66f,6.48f)
                curveTo(1.0321004f,10.444898f,1.5608137f,15.712186f,4.9243145f,19.075686f)
                curveTo(8.287815f,22.439186f,13.555102f,22.9679f,17.52f,20.34f)
            }
}

public val LucideIcons.All.DiameterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Diameter: ImageVector
    @Composable get() = DiameterDefinition.asImageVector()
