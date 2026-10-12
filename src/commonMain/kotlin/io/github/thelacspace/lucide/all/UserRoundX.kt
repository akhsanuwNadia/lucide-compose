package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserRoundX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.5,16.5)
                lineTo(21.5,21.5)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,21.0)
                curveTo(1.9995099306106567,18.23640251159668,3.4254150390625,15.668261528015137,5.771396160125732,14.207490921020508)
                curveTo(8.117377281188965,12.746720314025879,11.05116081237793,12.600215911865234,13.531000137329102,13.819999694824219)
            }
            lucidePath(strokeWidth) {
                moveTo(21.5,16.5)
                lineTo(16.5,21.5)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,8.0)
                curveTo(4.991987228393555,9.791654586791992,5.943225860595703,11.450651168823242,7.493522644042969,12.348799705505371)
                curveTo(9.043819427490234,13.2469482421875,10.956180572509766,13.2469482421875,12.506477355957031,12.348799705505371)
                curveTo(14.056774139404297,11.450651168823242,15.008012771606445,9.791654586791992,15.0,8.0)
                curveTo(15.008012771606445,6.208345413208008,14.056774139404297,4.549348831176758,12.506477355957031,3.651200532913208)
                curveTo(10.956180572509766,2.753052234649658,9.043819427490234,2.753052234649658,7.493522644042969,3.651200532913208)
                curveTo(5.943225860595703,4.549348831176758,4.991987228393555,6.208345413208008,5.0,8.0)
            }
}

public val LucideIcons.All.UserRoundXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserRoundX: ImageVector
    @Composable get() = UserRoundXDefinition.asImageVector()
