package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Gpu") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,17.0f)
                lineTo(20.0f,17.0f)
                curveTo(21.10457f,17.0f,22.0f,16.10457f,22.0f,15.0f)
                lineTo(22.0f,7.0f)
                curveTo(22.0f,5.8954306f,21.10457f,5.0f,20.0f,5.0f)
                lineTo(2.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,21.0f)
                lineTo(2.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,17.0f)
                lineTo(7.0f,20.0f)
                curveTo(7.0f,20.552284f,7.4477153f,21.0f,8.0f,21.0f)
                lineTo(13.0f,21.0f)
                curveTo(13.552285f,21.0f,14.0f,20.552284f,14.0f,20.0f)
                lineTo(14.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,11.0f)
                curveTo(13.996795f,11.716661f,14.377291f,12.38026f,14.997409f,12.73952f)
                curveTo(15.617528f,13.098779f,16.382473f,13.098779f,17.00259f,12.73952f)
                curveTo(17.62271f,12.38026f,18.003204f,11.716661f,18.0f,11.0f)
                curveTo(18.003204f,10.283339f,17.62271f,9.61974f,17.00259f,9.26048f)
                curveTo(16.382473f,8.901221f,15.617528f,8.901221f,14.997409f,9.26048f)
                curveTo(14.377291f,9.61974f,13.996795f,10.283339f,14.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,11.0f)
                curveTo(5.996795f,11.716661f,6.3772902f,12.38026f,6.9974093f,12.73952f)
                curveTo(7.617528f,13.098779f,8.382472f,13.098779f,9.002591f,12.73952f)
                curveTo(9.622709f,12.38026f,10.003205f,11.716661f,10.0f,11.0f)
                curveTo(10.003205f,10.283339f,9.622709f,9.61974f,9.002591f,9.26048f)
                curveTo(8.382472f,8.901221f,7.617528f,8.901221f,6.9974093f,9.26048f)
                curveTo(6.3772902f,9.61974f,5.996795f,10.283339f,6.0f,11.0f)
            }
}

public val LucideIcons.All.GpuDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Gpu: ImageVector
    @Composable get() = GpuDefinition.asImageVector()
