package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Van") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0f,6.0f)
                lineTo(13.0f,11.0f)
                curveTo(13.0f,11.552285f,13.447715f,12.0f,14.0f,12.0f)
                lineTo(20.102001f,12.0f)
                curveTo(20.369652f,12.000048f,20.626112f,12.107387f,20.814001f,12.298f)
                lineTo(21.712002f,13.208f)
                curveTo(21.896498f,13.395078f,21.999954f,13.647251f,22.000002f,13.91f)
                lineTo(22.000002f,17.0f)
                curveTo(22.000002f,17.552284f,21.552286f,18.0f,21.000002f,18.0f)
                lineTo(18.000002f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,18.0f)
                lineTo(3.0f,18.0f)
                curveTo(2.4477153f,18.0f,2.0f,17.552284f,2.0f,17.0f)
                lineTo(2.0f,8.0f)
                curveTo(2.0f,6.8954306f,2.8954306f,6.0f,4.0f,6.0f)
                lineTo(16.0f,6.0f)
                curveTo(17.1f,6.0f,18.1f,6.8f,18.4f,7.8f)
                lineTo(19.576f,12.0f)
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
            lucidePath(strokeWidth) {
                moveTo(5.0f,18.0f)
                curveTo(4.996795f,18.716661f,5.3772902f,19.38026f,5.9974093f,19.73952f)
                curveTo(6.617528f,20.09878f,7.382472f,20.09878f,8.002591f,19.73952f)
                curveTo(8.622709f,19.38026f,9.003205f,18.716661f,9.0f,18.0f)
                curveTo(9.003205f,17.283339f,8.622709f,16.61974f,8.002591f,16.26048f)
                curveTo(7.382472f,15.901221f,6.617528f,15.901221f,5.9974093f,16.26048f)
                curveTo(5.3772902f,16.61974f,4.996795f,17.283339f,5.0f,18.0f)
            }
}

public val LucideIcons.All.VanDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Van: ImageVector
    @Composable get() = VanDefinition.asImageVector()
