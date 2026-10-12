package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CannabisOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,22.0)
                lineTo(12.0,18.0)
                curveTo(13.5,19.5,15.5,21.0,18.0,21.0)
                curveTo(18.0,19.5,17.5,17.5,16.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.98799991607666,8.32699966430664)
                curveTo(13.902000427246094,6.053999900817871,13.364999771118164,3.819999933242798,12.0,2.0)
                curveTo(11.35235595703125,2.874668836593628,10.863268852233887,3.856228828430176,10.555000305175781,4.900000095367432)
            }
            lucidePath(strokeWidth) {
                moveTo(17.375,11.725000381469727)
                curveTo(18.881999969482422,10.529999732971191,21.0,7.841000080108643,21.0,6.0)
                curveTo(18.676000595092773,6.0,15.920000076293945,7.296000003814697,14.33799934387207,8.684000015258789)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.02400016784668,15.378000259399414)
                curveTo(21.3536319732666,15.263392448425293,21.679162979125977,15.13731575012207,22.0,15.0)
                curveTo(21.573999404907227,13.720999717712402,19.329999923706055,12.442999839782715,17.75,12.093000411987305)
            }
            lucidePath(strokeWidth) {
                moveTo(6.994999885559082,6.992000102996826)
                curveTo(5.714000225067139,6.400000095367432,4.289999961853027,6.0,3.0,6.0)
                curveTo(3.0,8.0,5.5,11.0,7.0,12.0)
                curveTo(5.5,12.0,2.5,13.5,2.0,15.0)
                curveTo(5.5,16.5,8.0,16.0,8.0,16.0)
                curveTo(6.5,17.5,6.0,19.5,6.0,21.0)
                curveTo(8.5,21.0,10.5,19.5,12.0,18.0)
            }
}

public val LucideIcons.All.CannabisOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CannabisOff: ImageVector
    @Composable get() = CannabisOffDefinition.asImageVector()
