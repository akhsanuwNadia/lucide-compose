package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MapPinHouse") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,22.0f)
                curveTo(14.447715f,22.0f,14.0f,21.552284f,14.0f,21.0f)
                lineTo(14.0f,17.0f)
                curveTo(13.999949f,16.665722f,14.16693f,16.353523f,14.445f,16.168f)
                lineTo(17.445f,14.167999f)
                curveTo(17.781036f,13.943799f,18.218964f,13.943799f,18.555f,14.167999f)
                lineTo(21.555f,16.168f)
                curveTo(21.83307f,16.353523f,22.00005f,16.665722f,22.0f,17.0f)
                lineTo(22.0f,21.0f)
                curveTo(22.0f,21.552284f,21.552284f,22.0f,21.0f,22.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,10.0f)
                curveTo(17.980303f,5.5956874f,14.404357f,2.0356972f,10.0f,2.0356972f)
                curveTo(5.595643f,2.0356972f,2.0196967f,5.5956874f,2.0f,10.0f)
                curveTo(2.0f,14.993f,7.539f,20.193f,9.399f,21.799f)
                curveTo(9.57237f,21.929028f,9.783288f,21.999216f,10.0f,21.999f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,22.0f)
                lineTo(18.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,10.0f)
                curveTo(6.9951925f,11.074993f,7.5659356f,12.070391f,8.496114f,12.60928f)
                curveTo(9.426291f,13.148169f,10.573709f,13.148169f,11.503886f,12.60928f)
                curveTo(12.434065f,12.070391f,13.004807f,11.074993f,13.0f,10.0f)
                curveTo(13.004807f,8.925007f,12.434065f,7.9296093f,11.503886f,7.3907204f)
                curveTo(10.573709f,6.8518314f,9.426291f,6.8518314f,8.496114f,7.3907204f)
                curveTo(7.5659356f,7.9296093f,6.9951925f,8.925007f,7.0f,10.0f)
            }
}

public val LucideIcons.All.MapPinHouseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MapPinHouse: ImageVector
    @Composable get() = MapPinHouseDefinition.asImageVector()
