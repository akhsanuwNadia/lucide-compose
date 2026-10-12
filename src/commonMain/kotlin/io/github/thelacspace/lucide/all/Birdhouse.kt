package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Birdhouse") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,18.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,18.0f)
                lineTo(18.956f,6.5319996f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,8.0f)
                lineTo(10.82f,2.3850002f)
                curveTo(11.52284f,1.871409f,12.4771595f,1.871409f,13.179999f,2.3850002f)
                lineTo(21.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,18.0f)
                lineTo(20.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,18.0f)
                lineTo(5.044f,6.532f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,10.0f)
                curveTo(9.996795f,10.716661f,10.377291f,11.38026f,10.997409f,11.73952f)
                curveTo(11.617528f,12.098779f,12.382472f,12.098779f,13.002591f,11.73952f)
                curveTo(13.622709f,11.38026f,14.003205f,10.716661f,14.0f,10.0f)
                curveTo(14.003205f,9.283339f,13.622709f,8.61974f,13.002591f,8.26048f)
                curveTo(12.382472f,7.901221f,11.617528f,7.901221f,10.997409f,8.26048f)
                curveTo(10.377291f,8.61974f,9.996795f,9.283339f,10.0f,10.0f)
            }
}

public val LucideIcons.All.BirdhouseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Birdhouse: ImageVector
    @Composable get() = BirdhouseDefinition.asImageVector()
