package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClipboardClock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,14.0)
                lineTo(16.0,16.200000762939453)
                lineTo(17.600000381469727,17.200000762939453)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,4.0)
                lineTo(18.0,4.0)
                curveTo(19.104570388793945,4.0,20.0,4.895430564880371,20.0,6.0)
                lineTo(20.0,6.831999778747559)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,4.0)
                lineTo(6.0,4.0)
                curveTo(4.895430564880371,4.0,4.0,4.895430564880371,4.0,6.0)
                lineTo(4.0,20.0)
                curveTo(4.0,21.104570388793945,4.895430564880371,22.0,6.0,22.0)
                lineTo(8.0,22.0)
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
            lucidePath(strokeWidth) {
                moveTo(9.0,2.0)
                lineTo(15.0,2.0)
                lineTo(16.0,2.0)
                lineTo(16.0,6.0)
                lineTo(15.0,6.0)
                lineTo(9.0,6.0)
                lineTo(8.0,6.0)
                lineTo(8.0,2.0)
                lineTo(9.0,2.0)
                close()
            }
}

public val LucideIcons.All.ClipboardClockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClipboardClock: ImageVector
    @Composable get() = ClipboardClockDefinition.asImageVector()
