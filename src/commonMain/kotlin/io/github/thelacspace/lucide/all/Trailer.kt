package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Trailer") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,11.341f)
                lineTo(10.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,13.0f)
                lineTo(14.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,17.0f)
                lineTo(18.0f,8.0f)
                curveTo(18.0f,6.8954306f,17.10457f,6.0f,16.0f,6.0f)
                lineTo(4.0f,6.0f)
                curveTo(2.8954306f,6.0f,2.0f,6.8954306f,2.0f,8.0f)
                lineTo(2.0f,15.0f)
                curveTo(2.0f,16.10457f,2.8954306f,17.0f,4.0f,17.0f)
                lineTo(6.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,15.0f)
                lineTo(22.0f,16.0f)
                curveTo(22.0f,16.552284f,21.552284f,17.0f,21.0f,17.0f)
                lineTo(10.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,11.341f)
                lineTo(6.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,17.0f)
                curveTo(5.996795f,17.716661f,6.3772902f,18.38026f,6.9974093f,18.73952f)
                curveTo(7.617528f,19.09878f,8.382472f,19.09878f,9.002591f,18.73952f)
                curveTo(9.622709f,18.38026f,10.003205f,17.716661f,10.0f,17.0f)
                curveTo(10.003205f,16.283339f,9.622709f,15.61974f,9.002591f,15.26048f)
                curveTo(8.382472f,14.901221f,7.617528f,14.901221f,6.9974093f,15.26048f)
                curveTo(6.3772902f,15.61974f,5.996795f,16.283339f,6.0f,17.0f)
            }
}

public val LucideIcons.All.TrailerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Trailer: ImageVector
    @Composable get() = TrailerDefinition.asImageVector()
