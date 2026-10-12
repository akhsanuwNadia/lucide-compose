package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Waypoints") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.586f,5.414f)
                lineTo(5.4140005f,10.586f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.586f,13.414f)
                lineTo(13.4140005f,18.585999f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,12.0f)
                lineTo(18.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,20.0f)
                curveTo(9.996795f,20.716661f,10.377291f,21.38026f,10.997409f,21.73952f)
                curveTo(11.617528f,22.09878f,12.382472f,22.09878f,13.002591f,21.73952f)
                curveTo(13.622709f,21.38026f,14.003205f,20.716661f,14.0f,20.0f)
                curveTo(14.003205f,19.283339f,13.622709f,18.61974f,13.002591f,18.26048f)
                curveTo(12.382472f,17.90122f,11.617528f,17.90122f,10.997409f,18.26048f)
                curveTo(10.377291f,18.61974f,9.996795f,19.283339f,10.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,4.0f)
                curveTo(9.996795f,4.716662f,10.377291f,5.3802605f,10.997409f,5.7395196f)
                curveTo(11.617528f,6.098779f,12.382472f,6.098779f,13.002591f,5.7395196f)
                curveTo(13.622709f,5.3802605f,14.003205f,4.716662f,14.0f,4.0f)
                curveTo(14.003205f,3.283338f,13.622709f,2.6197395f,13.002591f,2.2604802f)
                curveTo(12.382472f,1.9012209f,11.617528f,1.9012209f,10.997409f,2.2604802f)
                curveTo(10.377291f,2.6197395f,9.996795f,3.283338f,10.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,12.0f)
                curveTo(17.996796f,12.716661f,18.37729f,13.38026f,18.99741f,13.73952f)
                curveTo(19.617527f,14.098779f,20.382473f,14.098779f,21.00259f,13.73952f)
                curveTo(21.62271f,13.38026f,22.003204f,12.716661f,22.0f,12.0f)
                curveTo(22.003204f,11.283339f,21.62271f,10.61974f,21.00259f,10.26048f)
                curveTo(20.382473f,9.901221f,19.617527f,9.901221f,18.99741f,10.26048f)
                curveTo(18.37729f,10.61974f,17.996796f,11.283339f,18.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                curveTo(1.9967949f,12.716661f,2.3772902f,13.38026f,2.997409f,13.73952f)
                curveTo(3.617528f,14.098779f,4.382472f,14.098779f,5.0025907f,13.73952f)
                curveTo(5.6227098f,13.38026f,6.003205f,12.716661f,6.0f,12.0f)
                curveTo(6.003205f,11.283339f,5.6227098f,10.61974f,5.0025907f,10.26048f)
                curveTo(4.382472f,9.901221f,3.617528f,9.901221f,2.997409f,10.26048f)
                curveTo(2.3772902f,10.61974f,1.9967949f,11.283339f,2.0f,12.0f)
            }
}

public val LucideIcons.All.WaypointsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Waypoints: ImageVector
    @Composable get() = WaypointsDefinition.asImageVector()
