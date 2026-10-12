package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareParkingOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.5999999046325684,3.5999999046325684)
                curveTo(3.9692609310150146,3.2231714725494385,4.472461223602295,3.007513999938965,5.0,3.0)
                lineTo(19.0,3.0)
                curveTo(20.104570388793945,3.0,21.0,3.895430564880371,21.0,5.0)
                lineTo(21.0,19.0)
                curveTo(20.997766494750977,19.529577255249023,20.785587310791016,20.036649703979492,20.40999984741211,20.40999984741211)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,8.699999809265137)
                lineTo(3.0,19.0)
                curveTo(3.0,20.104570388793945,3.895430564880371,21.0,5.0,21.0)
                lineTo(15.300000190734863,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,13.0)
                curveTo(14.074993133544922,13.004807472229004,15.070390701293945,12.434064865112305,15.60927963256836,11.503886222839355)
                curveTo(16.148168563842773,10.573708534240723,16.148168563842773,9.426291465759277,15.60927963256836,8.496113777160645)
                curveTo(15.070390701293945,7.5659356117248535,14.074993133544922,6.995192527770996,13.0,7.0)
                lineTo(9.0,7.0)
                lineTo(9.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,17.0)
                lineTo(9.0,14.699999809265137)
            }
}

public val LucideIcons.All.SquareParkingOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareParkingOff: ImageVector
    @Composable get() = SquareParkingOffDefinition.asImageVector()
