package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircuitBoard") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,3.0f)
                lineTo(19.0f,3.0f)
                lineTo(21.0f,3.0f)
                lineTo(21.0f,21.0f)
                lineTo(19.0f,21.0f)
                lineTo(5.0f,21.0f)
                lineTo(3.0f,21.0f)
                lineTo(3.0f,3.0f)
                lineTo(5.0f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,9.0f)
                lineTo(15.0f,9.0f)
                curveTo(16.10457f,9.0f,17.0f,8.104569f,17.0f,7.0f)
                lineTo(17.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,9.0f)
                curveTo(6.996795f,9.716661f,7.3772902f,10.38026f,7.9974093f,10.73952f)
                curveTo(8.617528f,11.098779f,9.382472f,11.098779f,10.002591f,10.73952f)
                curveTo(10.622709f,10.38026f,11.003205f,9.716661f,11.0f,9.0f)
                curveTo(11.003205f,8.283339f,10.622709f,7.6197395f,10.002591f,7.2604804f)
                curveTo(9.382472f,6.901221f,8.617528f,6.901221f,7.9974093f,7.2604804f)
                curveTo(7.3772902f,7.6197395f,6.996795f,8.283339f,7.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,21.0f)
                lineTo(7.0f,17.0f)
                curveTo(7.0f,15.895431f,7.8954306f,15.0f,9.0f,15.0f)
                lineTo(13.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,15.0f)
                curveTo(12.996795f,15.716661f,13.377291f,16.38026f,13.997409f,16.73952f)
                curveTo(14.617528f,17.09878f,15.382472f,17.09878f,16.00259f,16.73952f)
                curveTo(16.62271f,16.38026f,17.003204f,15.716661f,17.0f,15.0f)
                curveTo(17.003204f,14.283339f,16.62271f,13.61974f,16.00259f,13.26048f)
                curveTo(15.382472f,12.901221f,14.617528f,12.901221f,13.997409f,13.26048f)
                curveTo(13.377291f,13.61974f,12.996795f,14.283339f,13.0f,15.0f)
            }
}

public val LucideIcons.All.CircuitBoardDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircuitBoard: ImageVector
    @Composable get() = CircuitBoardDefinition.asImageVector()
