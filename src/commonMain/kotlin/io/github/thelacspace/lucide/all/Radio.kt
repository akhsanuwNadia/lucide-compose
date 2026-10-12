package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Radio") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.247f,7.761f)
                curveTo(18.585295f,10.103311f,18.585295f,13.896689f,16.247f,16.239f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.075f,4.933f)
                curveTo(22.974823f,8.837311f,22.974823f,15.162689f,19.075f,19.067f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.925f,19.067f)
                curveTo(1.0251781f,15.162689f,1.0251781f,8.83731f,4.925f,4.9329996f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.753f,16.239f)
                curveTo(5.4147043f,13.89669f,5.4147043f,10.103311f,7.753f,7.7610006f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,12.0f)
                curveTo(9.996795f,12.716661f,10.377291f,13.38026f,10.997409f,13.73952f)
                curveTo(11.617528f,14.098779f,12.382472f,14.098779f,13.002591f,13.73952f)
                curveTo(13.622709f,13.38026f,14.003205f,12.716661f,14.0f,12.0f)
                curveTo(14.003205f,11.283339f,13.622709f,10.61974f,13.002591f,10.26048f)
                curveTo(12.382472f,9.901221f,11.617528f,9.901221f,10.997409f,10.26048f)
                curveTo(10.377291f,10.61974f,9.996795f,11.283339f,10.0f,12.0f)
            }
}

public val LucideIcons.All.RadioDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Radio: ImageVector
    @Composable get() = RadioDefinition.asImageVector()
