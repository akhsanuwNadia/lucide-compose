package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BoomBox") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,9.0f)
                lineTo(4.0f,5.0f)
                curveTo(4.0f,3.8954306f,4.8954306f,3.0f,6.0f,3.0f)
                lineTo(18.0f,3.0f)
                curveTo(19.10457f,3.0f,20.0f,3.8954306f,20.0f,5.0f)
                lineTo(20.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,8.0f)
                lineTo(8.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,8.0f)
                lineTo(12.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,8.0f)
                lineTo(16.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,9.0f)
                lineTo(20.0f,9.0f)
                lineTo(22.0f,9.0f)
                lineTo(22.0f,21.0f)
                lineTo(20.0f,21.0f)
                lineTo(4.0f,21.0f)
                lineTo(2.0f,21.0f)
                lineTo(2.0f,9.0f)
                lineTo(4.0f,9.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,15.0f)
                curveTo(5.996795f,15.716661f,6.3772902f,16.38026f,6.9974093f,16.73952f)
                curveTo(7.617528f,17.09878f,8.382472f,17.09878f,9.002591f,16.73952f)
                curveTo(9.622709f,16.38026f,10.003205f,15.716661f,10.0f,15.0f)
                curveTo(10.003205f,14.283339f,9.622709f,13.61974f,9.002591f,13.26048f)
                curveTo(8.382472f,12.901221f,7.617528f,12.901221f,6.9974093f,13.26048f)
                curveTo(6.3772902f,13.61974f,5.996795f,14.283339f,6.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,15.0f)
                curveTo(13.996795f,15.716661f,14.377291f,16.38026f,14.997409f,16.73952f)
                curveTo(15.617528f,17.09878f,16.382473f,17.09878f,17.00259f,16.73952f)
                curveTo(17.62271f,16.38026f,18.003204f,15.716661f,18.0f,15.0f)
                curveTo(18.003204f,14.283339f,17.62271f,13.61974f,17.00259f,13.26048f)
                curveTo(16.382473f,12.901221f,15.617528f,12.901221f,14.997409f,13.26048f)
                curveTo(14.377291f,13.61974f,13.996795f,14.283339f,14.0f,15.0f)
            }
}

public val LucideIcons.All.BoomBoxDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BoomBox: ImageVector
    @Composable get() = BoomBoxDefinition.asImageVector()
