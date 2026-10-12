package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CaseUpper") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,11.0)
                lineTo(19.5,11.0)
                curveTo(20.8763484954834,11.006155014038086,21.98884391784668,12.123638153076172,21.98884391784668,13.5)
                curveTo(21.98884391784668,14.876361846923828,20.8763484954834,15.993844985961914,19.5,16.0)
                lineTo(15.5,16.0)
                curveTo(15.223857879638672,16.0,15.0,15.776142120361328,15.0,15.5)
                lineTo(15.0,6.5)
                curveTo(15.0,6.223857402801514,15.223857879638672,6.0,15.5,6.0)
                lineTo(18.5,6.0)
                curveTo(19.8763484954834,6.006155014038086,20.98884391784668,7.12363862991333,20.98884391784668,8.5)
                curveTo(20.98884391784668,9.876361846923828,19.8763484954834,10.993844985961914,18.5,11.0)
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

public val LucideIcons.All.CaseUpperDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CaseUpper: ImageVector
    @Composable get() = CaseUpperDefinition.asImageVector()
