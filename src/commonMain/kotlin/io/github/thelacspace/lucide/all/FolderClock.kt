package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderClock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,14.0)
                lineTo(16.0,16.200000762939453)
                lineTo(17.600000381469727,17.200000762939453)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,20.0)
                lineTo(4.0,20.0)
                curveTo(2.895430564880371,20.0,2.0,19.104570388793945,2.0,18.0)
                lineTo(2.0,5.0)
                curveTo(2.0,3.895430564880371,2.895430564880371,3.0,4.0,3.0)
                lineTo(7.900000095367432,3.0)
                curveTo(8.579667091369629,2.9933364391326904,9.216197967529297,3.3323171138763428,9.59000015258789,3.9000000953674316)
                lineTo(10.40000057220459,5.100000381469727)
                curveTo(10.769923210144043,5.6617207527160645,11.397414207458496,5.999889850616455,12.070000648498535,6.000000476837158)
                lineTo(20.0,6.000000476837158)
                curveTo(21.104568481445312,6.000000476837158,22.0,6.895430564880371,22.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,16.0)
                curveTo(9.990385055541992,18.149986267089844,11.131871223449707,20.14078140258789,12.992227554321289,21.21855926513672)
                curveTo(14.852583885192871,22.296337127685547,17.147417068481445,22.296337127685547,19.00777244567871,21.21855926513672)
                curveTo(20.86812973022461,20.14078140258789,22.009614944458008,18.149986267089844,22.0,16.0)
                curveTo(22.009614944458008,13.850014686584473,20.86812973022461,11.85921859741211,19.00777244567871,10.781440734863281)
                curveTo(17.147417068481445,9.703662872314453,14.852583885192871,9.703662872314453,12.992227554321289,10.781440734863281)
                curveTo(11.131871223449707,11.85921859741211,9.990385055541992,13.850014686584473,10.0,16.0)
            }
}

public val LucideIcons.All.FolderClockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderClock: ImageVector
    @Composable get() = FolderClockDefinition.asImageVector()
