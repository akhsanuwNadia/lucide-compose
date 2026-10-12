package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListClock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,13.0)
                lineTo(16.0,15.199999809265137)
                lineTo(17.600000381469727,16.200000762939453)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,12.0)
                lineTo(6.458000183105469,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,19.0)
                lineTo(6.831999778747559,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,5.0)
                lineTo(21.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,15.0)
                curveTo(9.990385055541992,17.149986267089844,11.131871223449707,19.14078140258789,12.992227554321289,20.21855926513672)
                curveTo(14.852583885192871,21.296337127685547,17.147417068481445,21.296337127685547,19.00777244567871,20.21855926513672)
                curveTo(20.86812973022461,19.14078140258789,22.009614944458008,17.149986267089844,22.0,15.0)
                curveTo(22.009614944458008,12.850014686584473,20.86812973022461,10.85921859741211,19.00777244567871,9.781440734863281)
                curveTo(17.147417068481445,8.703662872314453,14.852583885192871,8.703662872314453,12.992227554321289,9.781440734863281)
                curveTo(11.131871223449707,10.85921859741211,9.990385055541992,12.850014686584473,10.0,15.0)
            }
}

public val LucideIcons.All.ListClockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListClock: ImageVector
    @Composable get() = ListClockDefinition.asImageVector()
