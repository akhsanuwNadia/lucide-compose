package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bird") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,7.0)
                lineTo(16.010000228881836,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.4000000953674316,18.0)
                lineTo(12.0,18.0)
                curveTo(16.418277740478516,18.0,20.0,14.418277740478516,20.0,10.0)
                lineTo(20.0,7.0)
                curveTo(20.004619598388672,5.251180648803711,18.872621536254883,3.702106237411499,17.205039978027344,3.175260543823242)
                curveTo(15.537460327148438,2.6484150886535645,13.720953941345215,3.265956401824951,12.719999313354492,4.699999809265137)
                lineTo(2.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,7.0)
                lineTo(22.0,7.5)
                lineTo(20.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,18.0)
                lineTo(10.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,17.75)
                lineTo(14.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,18.0)
                curveTo(9.526259422302246,17.999874114990234,11.781824111938477,16.417383193969727,12.641559600830078,14.041916847229004)
                curveTo(13.50129508972168,11.666450500488281,12.78100872039795,9.006932258605957,10.84000015258789,7.390000343322754)
            }
}

public val LucideIcons.All.BirdDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bird: ImageVector
    @Composable get() = BirdDefinition.asImageVector()
