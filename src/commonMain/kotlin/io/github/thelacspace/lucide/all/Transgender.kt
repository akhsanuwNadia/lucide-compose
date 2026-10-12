package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Transgender") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,16.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,20.0)
                lineTo(10.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,2.0)
                lineTo(22.0,2.0)
                lineTo(22.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(9.170000076293945,9.170000076293945)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,5.355000019073486)
                lineTo(2.0,2.0)
                lineTo(5.357000350952148,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,2.0)
                lineTo(14.829999923706055,9.170000076293945)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,5.0)
                lineTo(5.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,12.0)
                curveTo(7.993589878082275,13.433323860168457,8.7545804977417,14.760520935058594,9.994818687438965,15.479039192199707)
                curveTo(11.235055923461914,16.19755744934082,12.764944076538086,16.19755744934082,14.005181312561035,15.479039192199707)
                curveTo(15.2454195022583,14.760520935058594,16.006410598754883,13.433323860168457,16.0,12.0)
                curveTo(16.006410598754883,10.566676139831543,15.2454195022583,9.239479064941406,14.005181312561035,8.520960807800293)
                curveTo(12.764944076538086,7.802441596984863,11.235055923461914,7.802441596984863,9.994818687438965,8.520960807800293)
                curveTo(8.7545804977417,9.239479064941406,7.993589878082275,10.566676139831543,8.0,12.0)
            }
}

public val LucideIcons.All.TransgenderDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Transgender: ImageVector
    @Composable get() = TransgenderDefinition.asImageVector()
