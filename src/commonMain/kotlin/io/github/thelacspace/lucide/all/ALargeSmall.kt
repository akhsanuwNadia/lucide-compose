package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ALargeSmall") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,16.0)
                lineTo(17.535999298095703,8.67199993133545)
                curveTo(17.678104400634766,8.261018753051758,18.065143585205078,7.985323429107666,18.5,7.985323429107666)
                curveTo(18.93485450744629,7.985323429107666,19.3218936920166,8.261018753051758,19.463998794555664,8.67199993133545)
                lineTo(22.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.696999549865723,14.0)
                lineTo(21.30299949645996,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,16.0)
                lineTo(6.039000034332275,6.310000419616699)
                curveTo(6.1166582107543945,6.1237263679504395,6.2986860275268555,6.0024003982543945,6.500499725341797,6.0024003982543945)
                curveTo(6.7023138999938965,6.0024003982543945,6.884341716766357,6.1237263679504395,6.961999893188477,6.310000419616699)
                lineTo(11.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.303999900817871,13.0)
                lineTo(9.696000099182129,13.0)
            }
}

public val LucideIcons.All.ALargeSmallDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ALargeSmall: ImageVector
    @Composable get() = ALargeSmallDefinition.asImageVector()
