package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Mars") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,3.0)
                lineTo(14.25,9.75)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,14.0)
                curveTo(3.990385055541992,16.149986267089844,5.131871223449707,18.14078140258789,6.992227554321289,19.21855926513672)
                curveTo(8.852583885192871,20.296337127685547,11.147416114807129,20.296337127685547,13.007772445678711,19.21855926513672)
                curveTo(14.868128776550293,18.14078140258789,16.009614944458008,16.149986267089844,16.0,14.0)
                curveTo(16.009614944458008,11.850014686584473,14.868128776550293,9.85921859741211,13.007772445678711,8.781440734863281)
                curveTo(11.147416114807129,7.703662395477295,8.852583885192871,7.703662395477295,6.992227554321289,8.781440734863281)
                curveTo(5.131871223449707,9.85921859741211,3.990385055541992,11.850014686584473,4.0,14.0)
            }
}

public val LucideIcons.All.MarsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Mars: ImageVector
    @Composable get() = MarsDefinition.asImageVector()
