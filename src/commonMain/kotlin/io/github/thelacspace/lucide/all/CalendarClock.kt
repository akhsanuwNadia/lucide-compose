package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CalendarClock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,14.0)
                lineTo(16.0,16.200000762939453)
                lineTo(17.600000381469727,17.200000762939453)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,2.0)
                lineTo(16.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,7.3379998207092285)
                lineTo(21.0,5.0)
                curveTo(21.0,3.895430564880371,20.104570388793945,3.0,19.0,3.0)
                lineTo(5.0,3.0)
                curveTo(3.895430564880371,3.0,3.0,3.895430564880371,3.0,5.0)
                lineTo(3.0,19.0)
                curveTo(3.0,20.104570388793945,3.895430564880371,21.0,5.0,21.0)
                lineTo(7.338000297546387,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,9.0)
                lineTo(8.859000205993652,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,2.0)
                lineTo(8.0,5.0)
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

public val LucideIcons.All.CalendarClockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CalendarClock: ImageVector
    @Composable get() = CalendarClockDefinition.asImageVector()
