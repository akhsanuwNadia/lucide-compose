package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("VenusAndMars") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,20.0)
                lineTo(14.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,16.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,2.0)
                lineTo(21.0,2.0)
                lineTo(21.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,2.0)
                lineTo(15.539999961853027,7.460000038146973)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,11.0)
                curveTo(6.991987228393555,12.791654586791992,7.943225860595703,14.450651168823242,9.493522644042969,15.348799705505371)
                curveTo(11.043819427490234,16.2469482421875,12.956180572509766,16.2469482421875,14.506477355957031,15.348799705505371)
                curveTo(16.056774139404297,14.450651168823242,17.008012771606445,12.791654586791992,17.0,11.0)
                curveTo(17.008012771606445,9.208345413208008,16.056774139404297,7.549348831176758,14.506477355957031,6.651200771331787)
                curveTo(12.956180572509766,5.753052234649658,11.043819427490234,5.753052234649658,9.493522644042969,6.651200771331787)
                curveTo(7.943225860595703,7.549348831176758,6.991987228393555,9.208345413208008,7.0,11.0)
            }
}

public val LucideIcons.All.VenusAndMarsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.VenusAndMars: ImageVector
    @Composable get() = VenusAndMarsDefinition.asImageVector()
