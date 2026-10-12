package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Rocket") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,15.0)
                lineTo(12.0,20.0)
                curveTo(12.0,20.0,15.029999732971191,19.450000762939453,16.0,18.0)
                curveTo(17.079999923706055,16.3799991607666,16.0,13.0,16.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.5,16.5)
                curveTo(3.0,17.760000228881836,2.5,21.5,2.5,21.5)
                curveTo(2.5,21.5,6.239999771118164,21.0,7.5,19.5)
                curveTo(8.210000038146973,18.65999984741211,8.199999809265137,17.369998931884766,7.409999847412109,16.59000015258789)
                curveTo(6.605107307434082,15.821764945983887,5.350828170776367,15.78297233581543,4.5,16.5)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,12.0)
                curveTo(9.532144546508789,10.619429588317871,10.202203750610352,9.296063423156738,11.0,8.050000190734863)
                curveTo(13.369152069091797,4.261955261230469,17.532182693481445,1.9722886085510254,22.0,2.0)
                curveTo(22.0,4.720000267028809,21.219999313354492,9.5,16.0,13.0)
                curveTo(14.73672103881836,13.798430442810059,13.396711349487305,14.468435287475586,12.0,15.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,12.0)
                lineTo(4.0,12.0)
                curveTo(4.0,12.0,4.550000190734863,8.970000267028809,6.0,8.0)
                curveTo(7.619999885559082,6.920000076293945,11.0,8.050000190734863,11.0,8.050000190734863)
            }
}

public val LucideIcons.All.RocketDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Rocket: ImageVector
    @Composable get() = RocketDefinition.asImageVector()
