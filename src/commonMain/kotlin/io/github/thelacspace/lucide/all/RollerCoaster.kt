package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RollerCoaster") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,19.0)
                lineTo(6.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,19.0)
                lineTo(10.0,6.800000190734863)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,19.0)
                lineTo(14.0,11.199999809265137)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,5.0)
                lineTo(18.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,19.0)
                lineTo(18.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,19.0)
                lineTo(22.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,19.0)
                lineTo(2.0,9.0)
                curveTo(2.0,6.790861129760742,3.790860891342163,5.0,6.0,5.0)
                curveTo(8.0,5.0,10.0,6.329999923706055,12.0,9.0)
                curveTo(14.0,11.670000076293945,16.0,13.0,18.0,13.0)
                curveTo(19.840364456176758,12.998272895812988,21.442060470581055,11.741043090820312,21.880876541137695,9.953758239746094)
                curveTo(22.319690704345703,8.166473388671875,21.482372283935547,6.310415744781494,19.852067947387695,5.456567764282227)
                curveTo(18.221763610839844,4.602719783782959,16.2192440032959,4.971452713012695,15.0,6.349999904632568)
            }
}

public val LucideIcons.All.RollerCoasterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RollerCoaster: ImageVector
    @Composable get() = RollerCoasterDefinition.asImageVector()
