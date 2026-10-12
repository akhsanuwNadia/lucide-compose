package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChartNetwork") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.11f,7.664f)
                lineTo(14.889999f,10.336f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.162f,12.788f)
                lineTo(10.837999f,14.212f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,4.0f)
                lineTo(13.940001f,5.515f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,3.0f)
                lineTo(3.0f,19.0f)
                curveTo(3.0f,20.10457f,3.8954306f,21.0f,5.0f,21.0f)
                lineTo(21.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,6.0f)
                curveTo(9.996795f,6.716662f,10.377291f,7.3802605f,10.997409f,7.7395196f)
                curveTo(11.617528f,8.098779f,12.382472f,8.098779f,13.002591f,7.7395196f)
                curveTo(13.622709f,7.3802605f,14.003205f,6.716662f,14.0f,6.0f)
                curveTo(14.003205f,5.283338f,13.622709f,4.6197395f,13.002591f,4.2604804f)
                curveTo(12.382472f,3.9012208f,11.617528f,3.9012208f,10.997409f,4.2604804f)
                curveTo(10.377291f,4.6197395f,9.996795f,5.283338f,10.0f,6.0f)
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
                moveTo(7.0f,15.0f)
                curveTo(6.996795f,15.716661f,7.3772902f,16.38026f,7.9974093f,16.73952f)
                curveTo(8.617528f,17.09878f,9.382472f,17.09878f,10.002591f,16.73952f)
                curveTo(10.622709f,16.38026f,11.003205f,15.716661f,11.0f,15.0f)
                curveTo(11.003205f,14.283339f,10.622709f,13.61974f,10.002591f,13.26048f)
                curveTo(9.382472f,12.901221f,8.617528f,12.901221f,7.9974093f,13.26048f)
                curveTo(7.3772902f,13.61974f,6.996795f,14.283339f,7.0f,15.0f)
            }
}

public val LucideIcons.All.ChartNetworkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChartNetwork: ImageVector
    @Composable get() = ChartNetworkDefinition.asImageVector()
