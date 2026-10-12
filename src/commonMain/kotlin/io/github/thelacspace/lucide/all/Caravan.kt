package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Caravan") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0f,19.0f)
                lineTo(18.0f,9.0f)
                curveTo(18.0f,6.790861f,16.209139f,5.0f,14.0f,5.0f)
                lineTo(6.0f,5.0f)
                curveTo(3.790861f,5.0f,2.0f,6.790861f,2.0f,9.0f)
                lineTo(2.0f,17.0f)
                curveTo(2.0f,18.10457f,2.8954306f,19.0f,4.0f,19.0f)
                lineTo(6.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,9.0f)
                lineTo(5.0f,9.0f)
                curveTo(5.5522847f,9.0f,6.0f,9.447715f,6.0f,10.0f)
                lineTo(6.0f,12.0f)
                curveTo(6.0f,12.552285f,5.5522847f,13.0f,5.0f,13.0f)
                lineTo(2.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,17.0f)
                lineTo(22.0f,18.0f)
                curveTo(22.0f,18.552284f,21.552284f,19.0f,21.0f,19.0f)
                lineTo(10.0f,19.0f)
                lineTo(10.0f,10.0f)
                curveTo(10.0f,9.447715f,10.447715f,9.0f,11.0f,9.0f)
                lineTo(13.0f,9.0f)
                curveTo(13.552285f,9.0f,14.0f,9.447715f,14.0f,10.0f)
                lineTo(14.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,19.0f)
                curveTo(5.996795f,19.716661f,6.3772902f,20.38026f,6.9974093f,20.73952f)
                curveTo(7.617528f,21.09878f,8.382472f,21.09878f,9.002591f,20.73952f)
                curveTo(9.622709f,20.38026f,10.003205f,19.716661f,10.0f,19.0f)
                curveTo(10.003205f,18.283339f,9.622709f,17.61974f,9.002591f,17.26048f)
                curveTo(8.382472f,16.90122f,7.617528f,16.90122f,6.9974093f,17.26048f)
                curveTo(6.3772902f,17.61974f,5.996795f,18.283339f,6.0f,19.0f)
            }
}

public val LucideIcons.All.CaravanDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Caravan: ImageVector
    @Composable get() = CaravanDefinition.asImageVector()
