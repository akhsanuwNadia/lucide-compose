package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareUserRound") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0,21.0)
                curveTo(17.985227584838867,17.696765899658203,15.303267478942871,15.026772499084473,12.0,15.026772499084473)
                curveTo(8.696732521057129,15.026772499084473,6.014772415161133,17.696765899658203,6.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,11.0)
                curveTo(7.993589878082275,12.433323860168457,8.7545804977417,13.760520935058594,9.994818687438965,14.479039192199707)
                curveTo(11.235055923461914,15.197558403015137,12.764944076538086,15.197558403015137,14.005181312561035,14.479039192199707)
                curveTo(15.2454195022583,13.760520935058594,16.006410598754883,12.433323860168457,16.0,11.0)
                curveTo(16.006410598754883,9.566676139831543,15.2454195022583,8.239479064941406,14.005181312561035,7.520960330963135)
                curveTo(12.764944076538086,6.802441596984863,11.235055923461914,6.802441596984863,9.994818687438965,7.520960330963135)
                curveTo(8.7545804977417,8.239479064941406,7.993589878082275,9.566676139831543,8.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,3.0)
                lineTo(19.0,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,21.0)
                lineTo(19.0,21.0)
                lineTo(5.0,21.0)
                lineTo(3.0,21.0)
                lineTo(3.0,3.0)
                lineTo(5.0,3.0)
                close()
            }
}

public val LucideIcons.All.SquareUserRoundDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareUserRound: ImageVector
    @Composable get() = SquareUserRoundDefinition.asImageVector()
