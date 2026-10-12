package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MarsStroke") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,6.0)
                lineTo(18.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,3.0)
                lineTo(13.25,10.75)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,15.0)
                curveTo(2.990385055541992,17.149986267089844,4.131871223449707,19.14078140258789,5.992227554321289,20.21855926513672)
                curveTo(7.852583408355713,21.296337127685547,10.147416114807129,21.296337127685547,12.007772445678711,20.21855926513672)
                curveTo(13.868128776550293,19.14078140258789,15.009614944458008,17.149986267089844,15.0,15.0)
                curveTo(15.009614944458008,12.850014686584473,13.868128776550293,10.85921859741211,12.007772445678711,9.781440734863281)
                curveTo(10.147416114807129,8.703662872314453,7.852583408355713,8.703662872314453,5.992227554321289,9.781440734863281)
                curveTo(4.131871223449707,10.85921859741211,2.990385055541992,12.850014686584473,3.0,15.0)
            }
}

public val LucideIcons.All.MarsStrokeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MarsStroke: ImageVector
    @Composable get() = MarsStrokeDefinition.asImageVector()
