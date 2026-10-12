package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChartScatter") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0f,7.5f)
                curveTo(6.999199f,7.6791654f,7.0943227f,7.845065f,7.2493525f,7.93488f)
                curveTo(7.4043818f,8.024694f,7.5956182f,8.024694f,7.7506475f,7.93488f)
                curveTo(7.9056773f,7.845065f,8.000801f,7.6791654f,8.0f,7.5f)
                curveTo(8.000801f,7.3208346f,7.9056773f,7.154935f,7.7506475f,7.06512f)
                curveTo(7.5956182f,6.975305f,7.4043818f,6.975305f,7.2493525f,7.06512f)
                curveTo(7.0943227f,7.154935f,6.999199f,7.3208346f,7.0f,7.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,5.5f)
                curveTo(17.999199f,5.6791654f,18.094322f,5.845065f,18.249352f,5.93488f)
                curveTo(18.404383f,6.024695f,18.595617f,6.024695f,18.750648f,5.93488f)
                curveTo(18.905678f,5.845065f,19.000801f,5.6791654f,19.0f,5.5f)
                curveTo(19.000801f,5.3208346f,18.905678f,5.154935f,18.750648f,5.06512f)
                curveTo(18.595617f,4.975305f,18.404383f,4.975305f,18.249352f,5.06512f)
                curveTo(18.094322f,5.154935f,17.999199f,5.3208346f,18.0f,5.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,11.5f)
                curveTo(10.999199f,11.679166f,11.094322f,11.845065f,11.249352f,11.93488f)
                curveTo(11.404382f,12.024694f,11.595618f,12.024694f,11.750648f,11.93488f)
                curveTo(11.905678f,11.845065f,12.000801f,11.679166f,12.0f,11.5f)
                curveTo(12.000801f,11.320834f,11.905678f,11.154935f,11.750648f,11.06512f)
                curveTo(11.595618f,10.975306f,11.404382f,10.975306f,11.249352f,11.06512f)
                curveTo(11.094322f,11.154935f,10.999199f,11.320834f,11.0f,11.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,16.5f)
                curveTo(6.999199f,16.679165f,7.0943227f,16.845064f,7.2493525f,16.93488f)
                curveTo(7.4043818f,17.024694f,7.5956182f,17.024694f,7.7506475f,16.93488f)
                curveTo(7.9056773f,16.845064f,8.000801f,16.679165f,8.0f,16.5f)
                curveTo(8.000801f,16.320835f,7.9056773f,16.154936f,7.7506475f,16.06512f)
                curveTo(7.5956182f,15.975306f,7.4043818f,15.975306f,7.2493525f,16.06512f)
                curveTo(7.0943227f,16.154936f,6.999199f,16.320835f,7.0f,16.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,14.5f)
                curveTo(16.999199f,14.679166f,17.094322f,14.845065f,17.249352f,14.93488f)
                curveTo(17.404383f,15.024694f,17.595617f,15.024694f,17.750648f,14.93488f)
                curveTo(17.905678f,14.845065f,18.000801f,14.679166f,18.0f,14.5f)
                curveTo(18.000801f,14.320834f,17.905678f,14.154935f,17.750648f,14.06512f)
                curveTo(17.595617f,13.975306f,17.404383f,13.975306f,17.249352f,14.06512f)
                curveTo(17.094322f,14.154935f,16.999199f,14.320834f,17.0f,14.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,3.0f)
                lineTo(3.0f,19.0f)
                curveTo(3.0f,20.10457f,3.8954306f,21.0f,5.0f,21.0f)
                lineTo(21.0f,21.0f)
            }
}

public val LucideIcons.All.ChartScatterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChartScatter: ImageVector
    @Composable get() = ChartScatterDefinition.asImageVector()
