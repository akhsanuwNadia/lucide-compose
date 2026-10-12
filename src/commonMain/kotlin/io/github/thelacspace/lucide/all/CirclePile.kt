package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CirclePile") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,19.0f)
                curveTo(9.996795f,19.716661f,10.377291f,20.38026f,10.997409f,20.73952f)
                curveTo(11.617528f,21.09878f,12.382472f,21.09878f,13.002591f,20.73952f)
                curveTo(13.622709f,20.38026f,14.003205f,19.716661f,14.0f,19.0f)
                curveTo(14.003205f,18.283339f,13.622709f,17.61974f,13.002591f,17.26048f)
                curveTo(12.382472f,16.90122f,11.617528f,16.90122f,10.997409f,17.26048f)
                curveTo(10.377291f,17.61974f,9.996795f,18.283339f,10.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,5.0f)
                curveTo(9.996795f,5.716662f,10.377291f,6.3802605f,10.997409f,6.7395196f)
                curveTo(11.617528f,7.098779f,12.382472f,7.098779f,13.002591f,6.7395196f)
                curveTo(13.622709f,6.3802605f,14.003205f,5.716662f,14.0f,5.0f)
                curveTo(14.003205f,4.283338f,13.622709f,3.6197395f,13.002591f,3.2604802f)
                curveTo(12.382472f,2.9012208f,11.617528f,2.9012208f,10.997409f,3.2604802f)
                curveTo(10.377291f,3.6197395f,9.996795f,4.283338f,10.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,12.0f)
                curveTo(13.996795f,12.716661f,14.377291f,13.38026f,14.997409f,13.73952f)
                curveTo(15.617528f,14.098779f,16.382473f,14.098779f,17.00259f,13.73952f)
                curveTo(17.62271f,13.38026f,18.003204f,12.716661f,18.0f,12.0f)
                curveTo(18.003204f,11.283339f,17.62271f,10.61974f,17.00259f,10.26048f)
                curveTo(16.382473f,9.901221f,15.617528f,9.901221f,14.997409f,10.26048f)
                curveTo(14.377291f,10.61974f,13.996795f,11.283339f,14.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,19.0f)
                curveTo(17.996796f,19.716661f,18.37729f,20.38026f,18.99741f,20.73952f)
                curveTo(19.617527f,21.09878f,20.382473f,21.09878f,21.00259f,20.73952f)
                curveTo(21.62271f,20.38026f,22.003204f,19.716661f,22.0f,19.0f)
                curveTo(22.003204f,18.283339f,21.62271f,17.61974f,21.00259f,17.26048f)
                curveTo(20.382473f,16.90122f,19.617527f,16.90122f,18.99741f,17.26048f)
                curveTo(18.37729f,17.61974f,17.996796f,18.283339f,18.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,19.0f)
                curveTo(1.9967949f,19.716661f,2.3772902f,20.38026f,2.997409f,20.73952f)
                curveTo(3.617528f,21.09878f,4.382472f,21.09878f,5.0025907f,20.73952f)
                curveTo(5.6227098f,20.38026f,6.003205f,19.716661f,6.0f,19.0f)
                curveTo(6.003205f,18.283339f,5.6227098f,17.61974f,5.0025907f,17.26048f)
                curveTo(4.382472f,16.90122f,3.617528f,16.90122f,2.997409f,17.26048f)
                curveTo(2.3772902f,17.61974f,1.9967949f,18.283339f,2.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,12.0f)
                curveTo(5.996795f,12.716661f,6.3772902f,13.38026f,6.9974093f,13.73952f)
                curveTo(7.617528f,14.098779f,8.382472f,14.098779f,9.002591f,13.73952f)
                curveTo(9.622709f,13.38026f,10.003205f,12.716661f,10.0f,12.0f)
                curveTo(10.003205f,11.283339f,9.622709f,10.61974f,9.002591f,10.26048f)
                curveTo(8.382472f,9.901221f,7.617528f,9.901221f,6.9974093f,10.26048f)
                curveTo(6.3772902f,10.61974f,5.996795f,11.283339f,6.0f,12.0f)
            }
}

public val LucideIcons.All.CirclePileDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CirclePile: ImageVector
    @Composable get() = CirclePileDefinition.asImageVector()
