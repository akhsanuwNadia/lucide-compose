package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EarthLock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0,3.3399999141693115)
                lineTo(7.0,5.0)
                curveTo(7.0,6.656854152679443,8.343145370483398,8.0,10.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,21.950000762939453)
                lineTo(11.0,18.0)
                curveTo(11.0,16.895429611206055,10.104569435119629,16.0,9.0,16.0)
                curveTo(7.895430564880371,16.0,7.0,15.104569435119629,7.0,14.0)
                lineTo(7.0,13.0)
                curveTo(7.0,11.895430564880371,6.104569435119629,11.0,5.0,11.0)
                lineTo(2.049999952316284,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.540000915527344,15.0)
                lineTo(17.0,15.0)
                curveTo(15.895430564880371,15.0,15.0,15.895430564880371,15.0,17.0)
                lineTo(15.0,21.540000915527344)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                curveTo(6.869818687438965,2.000312328338623,2.572040319442749,5.8827409744262695,2.0520999431610107,10.986506462097168)
                curveTo(1.5321595668792725,16.090272903442383,4.958735942840576,20.759611129760742,9.983463287353516,21.794443130493164)
                curveTo(15.008191108703613,22.829275131225586,20.000946044921875,19.89388084411621,21.540000915527344,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,6.0)
                lineTo(20.0,4.0)
                curveTo(20.003204345703125,3.2833380699157715,19.622709274291992,2.619739532470703,19.00259017944336,2.2604801654815674)
                curveTo(18.38247299194336,1.9012209177017212,17.61752700805664,1.9012209177017212,16.99740982055664,2.2604801654815674)
                curveTo(16.377290725708008,2.619739532470703,15.996794700622559,3.2833380699157715,16.0,4.0)
                lineTo(16.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,6.0)
                lineTo(21.0,6.0)
                lineTo(22.0,6.0)
                lineTo(22.0,11.0)
                lineTo(21.0,11.0)
                lineTo(15.0,11.0)
                lineTo(14.0,11.0)
                lineTo(14.0,6.0)
                lineTo(15.0,6.0)
                close()
            }
}

public val LucideIcons.All.EarthLockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EarthLock: ImageVector
    @Composable get() = EarthLockDefinition.asImageVector()
