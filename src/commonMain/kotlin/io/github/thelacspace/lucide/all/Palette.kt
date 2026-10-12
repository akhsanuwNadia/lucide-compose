package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Palette") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,22.0f)
                curveTo(6.4946094f,21.97538f,2.0446215f,17.505445f,2.0446215f,12.0f)
                curveTo(2.0446215f,6.494554f,6.4946094f,2.024621f,12.0f,2.0f)
                curveTo(17.522848f,2.0f,22.0f,6.029437f,22.0f,11.0f)
                curveTo(22.0f,13.761424f,19.761423f,16.0f,17.0f,16.0f)
                lineTo(14.75f,16.0f)
                curveTo(14.08715f,16.0f,13.481189f,16.374504f,13.184753f,16.967377f)
                curveTo(12.888317f,17.560247f,12.952291f,18.269718f,13.35f,18.8f)
                lineTo(13.650001f,19.199999f)
                curveTo(14.04771f,19.73028f,14.111684f,20.43975f,13.815248f,21.032621f)
                curveTo(13.518812f,21.625494f,12.912851f,21.999998f,12.250001f,21.999998f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,6.5f)
                curveTo(12.999199f,6.6791654f,13.094322f,6.845065f,13.249352f,6.93488f)
                curveTo(13.404382f,7.024695f,13.595618f,7.024695f,13.750648f,6.93488f)
                curveTo(13.905678f,6.845065f,14.000801f,6.6791654f,14.0f,6.5f)
                curveTo(14.000801f,6.3208346f,13.905678f,6.154935f,13.750648f,6.06512f)
                curveTo(13.595618f,5.975305f,13.404382f,5.975305f,13.249352f,6.06512f)
                curveTo(13.094322f,6.154935f,12.999199f,6.3208346f,13.0f,6.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,10.5f)
                curveTo(16.999199f,10.679166f,17.094322f,10.845065f,17.249352f,10.93488f)
                curveTo(17.404383f,11.024694f,17.595617f,11.024694f,17.750648f,10.93488f)
                curveTo(17.905678f,10.845065f,18.000801f,10.679166f,18.0f,10.5f)
                curveTo(18.000801f,10.320834f,17.905678f,10.154935f,17.750648f,10.06512f)
                curveTo(17.595617f,9.975306f,17.404383f,9.975306f,17.249352f,10.06512f)
                curveTo(17.094322f,10.154935f,16.999199f,10.320834f,17.0f,10.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,12.5f)
                curveTo(5.999199f,12.679166f,6.0943227f,12.845065f,6.2493525f,12.93488f)
                curveTo(6.4043818f,13.024694f,6.5956182f,13.024694f,6.7506475f,12.93488f)
                curveTo(6.9056773f,12.845065f,7.000801f,12.679166f,7.0f,12.5f)
                curveTo(7.000801f,12.320834f,6.9056773f,12.154935f,6.7506475f,12.06512f)
                curveTo(6.5956182f,11.975306f,6.4043818f,11.975306f,6.2493525f,12.06512f)
                curveTo(6.0943227f,12.154935f,5.999199f,12.320834f,6.0f,12.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,7.5f)
                curveTo(7.999199f,7.6791654f,8.094322f,7.845065f,8.249352f,7.93488f)
                curveTo(8.404382f,8.024694f,8.595618f,8.024694f,8.750648f,7.93488f)
                curveTo(8.905678f,7.845065f,9.000801f,7.6791654f,9.0f,7.5f)
                curveTo(9.000801f,7.3208346f,8.905678f,7.154935f,8.750648f,7.06512f)
                curveTo(8.595618f,6.975305f,8.404382f,6.975305f,8.249352f,7.06512f)
                curveTo(8.094322f,7.154935f,7.999199f,7.3208346f,8.0f,7.5f)
            }
}

public val LucideIcons.All.PaletteDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Palette: ImageVector
    @Composable get() = PaletteDefinition.asImageVector()
