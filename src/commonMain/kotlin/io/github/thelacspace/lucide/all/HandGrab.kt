package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HandGrab") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0,11.5)
                lineTo(18.0,9.0)
                curveTo(18.0,7.895430564880371,17.104570388793945,7.0,16.0,7.0)
                curveTo(14.895430564880371,7.0,14.0,7.895430564880371,14.0,9.0)
                lineTo(14.0,10.399999618530273)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,10.0)
                lineTo(14.0,8.0)
                curveTo(14.0,6.895430564880371,13.104569435119629,6.0,12.0,6.0)
                curveTo(10.895430564880371,6.0,10.0,6.895430564880371,10.0,8.0)
                lineTo(10.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,9.899999618530273)
                lineTo(10.0,9.0)
                curveTo(10.0,7.895430564880371,9.104569435119629,7.0,8.0,7.0)
                curveTo(6.895430564880371,7.0,6.0,7.895430564880371,6.0,9.0)
                lineTo(6.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,14.0)
                curveTo(6.0,12.895430564880371,5.104569435119629,12.0,4.0,12.0)
                curveTo(2.895430564880371,12.0,2.0,12.895430564880371,2.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,11.0)
                curveTo(17.996795654296875,10.28333854675293,18.377290725708008,9.619739532470703,18.99740982055664,9.260479927062988)
                curveTo(19.61752700805664,8.90122127532959,20.38247299194336,8.90122127532959,21.00259017944336,9.260479927062988)
                curveTo(21.622709274291992,9.619739532470703,22.003204345703125,10.28333854675293,22.0,11.0)
                lineTo(22.0,14.0)
                curveTo(22.0,18.418277740478516,18.418277740478516,22.0,14.0,22.0)
                lineTo(10.0,22.0)
                curveTo(5.581721782684326,22.0,2.0,18.418277740478516,2.0,14.0)
                curveTo(1.9967949390411377,13.28333854675293,2.3772902488708496,12.619739532470703,2.9974091053009033,12.260479927062988)
                curveTo(3.617527961730957,11.90122127532959,4.382472038269043,11.90122127532959,5.002590656280518,12.260479927062988)
                curveTo(5.62270975112915,12.619739532470703,6.003204822540283,13.28333854675293,6.0,14.0)
            }
}

public val LucideIcons.All.HandGrabDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HandGrab: ImageVector
    @Composable get() = HandGrabDefinition.asImageVector()
