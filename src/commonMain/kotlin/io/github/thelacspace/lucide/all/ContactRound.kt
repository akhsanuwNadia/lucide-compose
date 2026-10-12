package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ContactRound") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,2.0)
                lineTo(16.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.915000915527344,21.0)
                curveTo(17.92461585998535,18.850013732910156,16.783130645751953,16.85921859741211,14.922773361206055,15.781440734863281)
                curveTo(13.062417030334473,14.703662872314453,10.767584800720215,14.703662872314453,8.907228469848633,15.781440734863281)
                curveTo(7.046872138977051,16.85921859741211,5.905385971069336,18.850013732910156,5.915000915527344,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,2.0)
                lineTo(8.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,11.0)
                curveTo(7.993589878082275,12.433323860168457,8.7545804977417,13.760520935058594,9.994818687438965,14.479039192199707)
                curveTo(11.235055923461914,15.197558403015137,12.764944076538086,15.197558403015137,14.005181312561035,14.479039192199707)
                curveTo(15.2454195022583,13.760520935058594,16.006410598754883,12.433323860168457,16.0,11.0)
                curveTo(16.006410598754883,9.566676139831543,15.2454195022583,8.239479064941406,14.005181312561035,7.520960330963135)
                curveTo(12.764944076538086,6.802441596984863,11.235055923461914,6.802441596984863,9.994818687438965,7.520960330963135)
                curveTo(8.7545804977417,8.239479064941406,7.993589878082275,9.566676139831543,8.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,3.0)
                lineTo(19.0,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,21.0)
                lineTo(19.0,21.0)
                lineTo(5.0,21.0)
                lineTo(3.0,21.0)
                lineTo(3.0,3.0)
                lineTo(5.0,3.0)
                close()
            }
}

public val LucideIcons.All.ContactRoundDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ContactRound: ImageVector
    @Composable get() = ContactRoundDefinition.asImageVector()
