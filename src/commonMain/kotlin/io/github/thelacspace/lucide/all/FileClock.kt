package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileClock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,22.0)
                lineTo(18.0,22.0)
                curveTo(19.104570388793945,22.0,20.0,21.104570388793945,20.0,20.0)
                lineTo(20.0,8.0)
                curveTo(20.001569747924805,7.359942436218262,19.747406005859375,6.745773792266846,19.29400062561035,6.294000148773193)
                lineTo(15.706000328063965,2.7060000896453857)
                curveTo(15.254226684570312,2.252593755722046,14.640057563781738,1.9984302520751953,14.0,2.0)
                lineTo(6.0,2.0)
                curveTo(4.895430564880371,2.0,4.0,2.895430564880371,4.0,4.0)
                lineTo(4.0,6.849999904632568)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,2.0)
                lineTo(14.0,7.0)
                curveTo(14.0,7.5522847175598145,14.447714805603027,8.0,15.0,8.0)
                lineTo(20.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,14.0)
                lineTo(8.0,16.200000762939453)
                lineTo(9.600000381469727,17.200000762939453)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,16.0)
                curveTo(1.9903849363327026,18.149986267089844,3.131870985031128,20.14078140258789,4.992227554321289,21.21855926513672)
                curveTo(6.852583408355713,22.296337127685547,9.147416114807129,22.296337127685547,11.007772445678711,21.21855926513672)
                curveTo(12.868128776550293,20.14078140258789,14.009614944458008,18.149986267089844,14.0,16.0)
                curveTo(14.009614944458008,13.850014686584473,12.868128776550293,11.85921859741211,11.007772445678711,10.781440734863281)
                curveTo(9.147416114807129,9.703662872314453,6.852583408355713,9.703662872314453,4.992227554321289,10.781440734863281)
                curveTo(3.131870985031128,11.85921859741211,1.9903849363327026,13.850014686584473,2.0,16.0)
            }
}

public val LucideIcons.All.FileClockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileClock: ImageVector
    @Composable get() = FileClockDefinition.asImageVector()
