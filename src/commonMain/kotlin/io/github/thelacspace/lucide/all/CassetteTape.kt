package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CassetteTape") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,4.0f)
                lineTo(20.0f,4.0f)
                lineTo(22.0f,4.0f)
                lineTo(22.0f,20.0f)
                lineTo(20.0f,20.0f)
                lineTo(4.0f,20.0f)
                lineTo(2.0f,20.0f)
                lineTo(2.0f,4.0f)
                lineTo(4.0f,4.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,10.0f)
                curveTo(5.996795f,10.716661f,6.3772902f,11.38026f,6.9974093f,11.73952f)
                curveTo(7.617528f,12.098779f,8.382472f,12.098779f,9.002591f,11.73952f)
                curveTo(9.622709f,11.38026f,10.003205f,10.716661f,10.0f,10.0f)
                curveTo(10.003205f,9.283339f,9.622709f,8.61974f,9.002591f,8.26048f)
                curveTo(8.382472f,7.901221f,7.617528f,7.901221f,6.9974093f,8.26048f)
                curveTo(6.3772902f,8.61974f,5.996795f,9.283339f,6.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,12.0f)
                lineTo(16.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,10.0f)
                curveTo(13.996795f,10.716661f,14.377291f,11.38026f,14.997409f,11.73952f)
                curveTo(15.617528f,12.098779f,16.382473f,12.098779f,17.00259f,11.73952f)
                curveTo(17.62271f,11.38026f,18.003204f,10.716661f,18.0f,10.0f)
                curveTo(18.003204f,9.283339f,17.62271f,8.61974f,17.00259f,8.26048f)
                curveTo(16.382473f,7.901221f,15.617528f,7.901221f,14.997409f,8.26048f)
                curveTo(14.377291f,8.61974f,13.996795f,9.283339f,14.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,20.0f)
                lineTo(6.7f,17.1f)
                curveTo(6.843375f,16.445599f,7.430256f,15.984478f,8.1f,16.0f)
                lineTo(15.900001f,16.0f)
                curveTo(16.540594f,15.973437f,17.117367f,16.385418f,17.300001f,17.0f)
                lineTo(18.000002f,20.0f)
            }
}

public val LucideIcons.All.CassetteTapeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CassetteTape: ImageVector
    @Composable get() = CassetteTapeDefinition.asImageVector()
