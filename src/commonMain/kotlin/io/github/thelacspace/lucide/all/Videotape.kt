package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Videotape") { strokeWidth ->
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
                moveTo(2.0f,8.0f)
                lineTo(22.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,14.0f)
                curveTo(5.996795f,14.716661f,6.3772902f,15.38026f,6.9974093f,15.73952f)
                curveTo(7.617528f,16.09878f,8.382472f,16.09878f,9.002591f,15.73952f)
                curveTo(9.622709f,15.38026f,10.003205f,14.716661f,10.0f,14.0f)
                curveTo(10.003205f,13.283339f,9.622709f,12.61974f,9.002591f,12.26048f)
                curveTo(8.382472f,11.901221f,7.617528f,11.901221f,6.9974093f,12.26048f)
                curveTo(6.3772902f,12.61974f,5.996795f,13.283339f,6.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,12.0f)
                lineTo(16.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,14.0f)
                curveTo(13.996795f,14.716661f,14.377291f,15.38026f,14.997409f,15.73952f)
                curveTo(15.617528f,16.09878f,16.382473f,16.09878f,17.00259f,15.73952f)
                curveTo(17.62271f,15.38026f,18.003204f,14.716661f,18.0f,14.0f)
                curveTo(18.003204f,13.283339f,17.62271f,12.61974f,17.00259f,12.26048f)
                curveTo(16.382473f,11.901221f,15.617528f,11.901221f,14.997409f,12.26048f)
                curveTo(14.377291f,12.61974f,13.996795f,13.283339f,14.0f,14.0f)
            }
}

public val LucideIcons.All.VideotapeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Videotape: ImageVector
    @Composable get() = VideotapeDefinition.asImageVector()
