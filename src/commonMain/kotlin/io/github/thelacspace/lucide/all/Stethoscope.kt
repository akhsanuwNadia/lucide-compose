package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Stethoscope") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,2.0)
                lineTo(11.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,2.0)
                lineTo(5.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,3.0)
                lineTo(4.0,3.0)
                curveTo(2.895430564880371,3.0,2.0,3.895430564880371,2.0,5.0)
                lineTo(2.0,9.0)
                curveTo(2.014772653579712,12.303234100341797,4.696732521057129,14.973227500915527,8.0,14.973227500915527)
                curveTo(11.303267478942871,14.973227500915527,13.985227584838867,12.303234100341797,14.0,9.0)
                lineTo(14.0,5.0)
                curveTo(14.0,3.895430564880371,13.104569435119629,3.0,12.0,3.0)
                lineTo(11.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,15.0)
                curveTo(8.014772415161133,18.303234100341797,10.696732521057129,20.97322654724121,14.0,20.97322654724121)
                curveTo(17.303268432617188,20.97322654724121,19.985227584838867,18.303234100341797,20.0,15.0)
                lineTo(20.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,10.0)
                curveTo(17.996795654296875,10.71666145324707,18.377290725708008,11.380260467529297,18.99740982055664,11.739520072937012)
                curveTo(19.61752700805664,12.09877872467041,20.38247299194336,12.09877872467041,21.00259017944336,11.739520072937012)
                curveTo(21.622709274291992,11.380260467529297,22.003204345703125,10.71666145324707,22.0,10.0)
                curveTo(22.003204345703125,9.28333854675293,21.622709274291992,8.619739532470703,21.00259017944336,8.260479927062988)
                curveTo(20.38247299194336,7.901220798492432,19.61752700805664,7.901220798492432,18.99740982055664,8.260479927062988)
                curveTo(18.377290725708008,8.619739532470703,17.996795654296875,9.28333854675293,18.0,10.0)
            }
}

public val LucideIcons.All.StethoscopeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Stethoscope: ImageVector
    @Composable get() = StethoscopeDefinition.asImageVector()
