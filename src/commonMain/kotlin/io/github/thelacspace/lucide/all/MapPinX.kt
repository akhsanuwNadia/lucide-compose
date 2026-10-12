package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MapPinX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.752f,11.901f)
                curveTo(19.912722f,11.279981f,19.996021f,10.641467f,20.0f,10.0f)
                curveTo(19.980303f,5.5956874f,16.404356f,2.0356972f,12.0f,2.0356972f)
                curveTo(7.595643f,2.0356972f,4.0196967f,5.5956874f,4.0f,10.0f)
                curveTo(4.0f,14.993f,9.539f,20.193f,11.399f,21.799f)
                curveTo(11.754962f,22.066668f,12.245038f,22.066668f,12.601f,21.799f)
                curveTo(12.63108f,21.773426f,12.66108f,21.74776f,12.691f,21.722f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,10.0f)
                curveTo(8.995193f,11.074993f,9.565935f,12.070391f,10.496114f,12.60928f)
                curveTo(11.426291f,13.148169f,12.573709f,13.148169f,13.503886f,12.60928f)
                curveTo(14.434065f,12.070391f,15.004807f,11.074993f,15.0f,10.0f)
                curveTo(15.004807f,8.925007f,14.434065f,7.9296093f,13.503886f,7.3907204f)
                curveTo(12.573709f,6.8518314f,11.426291f,6.8518314f,10.496114f,7.3907204f)
                curveTo(9.565935f,7.9296093f,8.995193f,8.925007f,9.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.5f,15.5f)
                lineTo(16.5f,20.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.5f,20.5f)
                lineTo(16.5f,15.5f)
            }
}

public val LucideIcons.All.MapPinXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MapPinX: ImageVector
    @Composable get() = MapPinXDefinition.asImageVector()
