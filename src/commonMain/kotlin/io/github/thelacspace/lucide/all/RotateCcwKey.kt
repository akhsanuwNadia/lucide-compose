package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RotateCcwKey") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,7.0f)
                lineTo(12.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,9.0f)
                lineTo(14.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,12.0f)
                curveTo(3.0f,16.970562f,7.029437f,21.0f,12.0f,21.0f)
                curveTo(16.970562f,21.0f,21.0f,16.970562f,21.0f,12.0f)
                curveTo(21.0f,7.029437f,16.970562f,3.0f,12.0f,3.0f)
                curveTo(9.4837475f,3.008427f,7.068392f,3.990337f,5.26f,5.74f)
                lineTo(3.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,3.0f)
                lineTo(3.0f,8.0f)
                lineTo(8.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,15.0f)
                curveTo(9.996795f,15.716661f,10.377291f,16.38026f,10.997409f,16.73952f)
                curveTo(11.617528f,17.09878f,12.382472f,17.09878f,13.002591f,16.73952f)
                curveTo(13.622709f,16.38026f,14.003205f,15.716661f,14.0f,15.0f)
                curveTo(14.003205f,14.283339f,13.622709f,13.61974f,13.002591f,13.26048f)
                curveTo(12.382472f,12.901221f,11.617528f,12.901221f,10.997409f,13.26048f)
                curveTo(10.377291f,13.61974f,9.996795f,14.283339f,10.0f,15.0f)
            }
}

public val LucideIcons.All.RotateCcwKeyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RotateCcwKey: ImageVector
    @Composable get() = RotateCcwKeyDefinition.asImageVector()
