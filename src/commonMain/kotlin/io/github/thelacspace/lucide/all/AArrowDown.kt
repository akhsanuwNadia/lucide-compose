package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AArrowDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,12.0)
                lineTo(18.0,16.0)
                lineTo(22.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,16.0)
                lineTo(18.0,7.0)
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

public val LucideIcons.All.AArrowDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AArrowDown: ImageVector
    @Composable get() = AArrowDownDefinition.asImageVector()
