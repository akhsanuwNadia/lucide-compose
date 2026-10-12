package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0f,6.0f)
                lineTo(8.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,6.0f)
                lineTo(15.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                lineTo(21.6f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,18.0f)
                lineTo(21.0f,18.0f)
                curveTo(21.0f,18.0f,21.5f,16.3f,21.8f,15.2f)
                curveTo(21.9f,14.8f,22.0f,14.4f,22.0f,14.0f)
                curveTo(22.0f,13.6f,21.9f,13.2f,21.8f,12.8f)
                lineTo(20.4f,7.8f)
                curveTo(20.1f,6.8f,19.1f,6.0f,18.0f,6.0f)
                lineTo(4.0f,6.0f)
                curveTo(2.8954306f,6.0f,2.0f,6.8954306f,2.0f,8.0f)
                lineTo(2.0f,18.0f)
                lineTo(5.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,18.0f)
                curveTo(4.996795f,18.716661f,5.3772902f,19.38026f,5.9974093f,19.73952f)
                curveTo(6.617528f,20.09878f,7.382472f,20.09878f,8.002591f,19.73952f)
                curveTo(8.622709f,19.38026f,9.003205f,18.716661f,9.0f,18.0f)
                curveTo(9.003205f,17.283339f,8.622709f,16.61974f,8.002591f,16.26048f)
                curveTo(7.382472f,15.901221f,6.617528f,15.901221f,5.9974093f,16.26048f)
                curveTo(5.3772902f,16.61974f,4.996795f,17.283339f,5.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,18.0f)
                lineTo(14.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,18.0f)
                curveTo(13.996795f,18.716661f,14.377291f,19.38026f,14.997409f,19.73952f)
                curveTo(15.617528f,20.09878f,16.382473f,20.09878f,17.00259f,19.73952f)
                curveTo(17.62271f,19.38026f,18.003204f,18.716661f,18.0f,18.0f)
                curveTo(18.003204f,17.283339f,17.62271f,16.61974f,17.00259f,16.26048f)
                curveTo(16.382473f,15.901221f,15.617528f,15.901221f,14.997409f,16.26048f)
                curveTo(14.377291f,16.61974f,13.996795f,17.283339f,14.0f,18.0f)
            }
}

public val LucideIcons.All.BusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bus: ImageVector
    @Composable get() = BusDefinition.asImageVector()
