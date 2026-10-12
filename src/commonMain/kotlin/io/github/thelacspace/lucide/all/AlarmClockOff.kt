package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlarmClockOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.869999885559082,6.869999885559082)
                curveTo(4.517773628234863,8.803171157836914,3.4668023586273193,11.903972625732422,4.158868312835693,14.868962287902832)
                curveTo(4.8509345054626465,17.833951950073242,7.166049003601074,20.149066925048828,10.131038665771484,20.84113311767578)
                curveTo(13.096028327941895,21.533199310302734,16.196828842163086,20.482227325439453,18.130001068115234,18.130001068115234)
            }
            lucidePath(strokeWidth) {
                moveTo(19.899999618530273,14.25)
                curveTo(20.299272537231445,11.721757888793945,19.464679718017578,9.155106544494629,17.654787063598633,7.345213413238525)
                curveTo(15.844893455505371,5.535320281982422,13.278242111206055,4.700728416442871,10.75,5.100000381469727)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,6.0)
                lineTo(19.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.260000228881836,18.670000076293945)
                lineTo(4.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,4.0)
                lineTo(2.0,6.0)
            }
}

public val LucideIcons.All.AlarmClockOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlarmClockOff: ImageVector
    @Composable get() = AlarmClockOffDefinition.asImageVector()
