package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Pointer") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0,14.0)
                curveTo(22.0,18.418277740478516,18.418277740478516,22.0,14.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,11.0)
                lineTo(18.0,10.0)
                curveTo(18.0,8.895430564880371,17.104570388793945,8.0,16.0,8.0)
                curveTo(14.895430564880371,8.0,14.0,8.895430564880371,14.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,10.0)
                lineTo(14.0,9.0)
                curveTo(14.0,7.895430564880371,13.104569435119629,7.0,12.0,7.0)
                curveTo(10.895430564880371,7.0,10.0,7.895430564880371,10.0,9.0)
                lineTo(10.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,9.5)
                lineTo(10.0,4.0)
                curveTo(10.0,2.895430564880371,9.104569435119629,2.0,8.0,2.0)
                curveTo(6.895430564880371,2.0,6.0,2.895430564880371,6.0,4.0)
                lineTo(6.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,11.0)
                curveTo(17.996795654296875,10.28333854675293,18.377290725708008,9.619739532470703,18.99740982055664,9.260479927062988)
                curveTo(19.61752700805664,8.90122127532959,20.38247299194336,8.90122127532959,21.00259017944336,9.260479927062988)
                curveTo(21.622709274291992,9.619739532470703,22.003204345703125,10.28333854675293,22.0,11.0)
                lineTo(22.0,14.0)
                curveTo(22.0,18.418277740478516,18.418277740478516,22.0,14.0,22.0)
                lineTo(12.0,22.0)
                curveTo(9.199999809265137,22.0,7.5,21.139999389648438,6.010000228881836,19.65999984741211)
                lineTo(2.4100003242492676,16.059999465942383)
                curveTo(1.6953849792480469,15.268550872802734,1.727378010749817,14.055638313293457,2.4827229976654053,13.302962303161621)
                curveTo(3.238067626953125,12.550286293029785,4.451086044311523,12.522586822509766,5.240000247955322,13.239999771118164)
                lineTo(7.0,15.0)
            }
}

public val LucideIcons.All.PointerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Pointer: ImageVector
    @Composable get() = PointerDefinition.asImageVector()
