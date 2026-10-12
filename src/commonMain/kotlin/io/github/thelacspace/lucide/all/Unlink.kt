package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Unlink") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.84000015258789,12.25)
                lineTo(20.559999465942383,10.539999961853027)
                lineTo(20.53999900817871,10.539999961853027)
                curveTo(22.456947326660156,8.5536527633667,22.40325355529785,5.390148162841797,20.419998168945312,3.4699997901916504)
                curveTo(18.480754852294922,1.5998517274856567,15.409241676330566,1.5998517274856567,13.469998359680176,3.4699997901916504)
                lineTo(11.749998092651367,5.179999828338623)
            }
            lucidePath(strokeWidth) {
                moveTo(5.170000076293945,11.75)
                lineTo(3.4600000381469727,13.460000038146973)
                curveTo(1.5430508852005005,15.4463472366333,1.5967453718185425,18.609851837158203,3.5799999237060547,20.530000686645508)
                curveTo(5.519243240356445,22.400148391723633,8.5907564163208,22.400148391723633,10.529999732971191,20.530000686645508)
                lineTo(12.239999771118164,18.81999969482422)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,2.0)
                lineTo(8.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,8.0)
                lineTo(5.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,19.0)
                lineTo(16.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,16.0)
                lineTo(22.0,16.0)
            }
}

public val LucideIcons.All.UnlinkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Unlink: ImageVector
    @Composable get() = UnlinkDefinition.asImageVector()
