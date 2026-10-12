package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HardDrive") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,16.0)
                lineTo(10.010000228881836,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.2119998931884766,11.57699966430664)
                curveTo(2.072610855102539,11.855113983154297,2.000020742416382,12.161910057067871,1.9999998807907104,12.472999572753906)
                lineTo(1.9999998807907104,18.0)
                curveTo(1.9999998807907104,18.530433654785156,2.2107136249542236,19.039140701293945,2.5857863426208496,19.414213180541992)
                curveTo(2.9608590602874756,19.78928565979004,3.469567060470581,20.0,4.0,20.0)
                lineTo(20.0,20.0)
                curveTo(21.104570388793945,20.0,22.0,19.104570388793945,22.0,18.0)
                lineTo(22.0,12.472999572753906)
                curveTo(21.99997901916504,12.161910057067871,21.92738914489746,11.855113983154297,21.788000106811523,11.57699966430664)
                lineTo(18.549999237060547,5.110000133514404)
                curveTo(18.212268829345703,4.430342674255371,17.518943786621094,4.000402927398682,16.760000228881836,4.0)
                lineTo(7.239999771118164,4.0)
                curveTo(6.481055736541748,4.000402927398682,5.787729740142822,4.430342197418213,5.449999809265137,5.110000133514404)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(21.945999145507812,12.012999534606934)
                lineTo(2.053999900817871,12.012999534606934)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,16.0)
                lineTo(6.010000228881836,16.0)
            }
}

public val LucideIcons.All.HardDriveDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HardDrive: ImageVector
    @Composable get() = HardDriveDefinition.asImageVector()
