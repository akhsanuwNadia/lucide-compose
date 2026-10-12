package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Heading6") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,12.0)
                lineTo(12.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,18.0)
                lineTo(4.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,18.0)
                lineTo(12.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,16.0)
                curveTo(16.996795654296875,16.71666145324707,17.377290725708008,17.380260467529297,17.99740982055664,17.739519119262695)
                curveTo(18.61752700805664,18.098779678344727,19.38247299194336,18.098779678344727,20.00259017944336,17.739519119262695)
                curveTo(20.622709274291992,17.380260467529297,21.003204345703125,16.71666145324707,21.0,16.0)
                curveTo(21.003204345703125,15.28333854675293,20.622709274291992,14.619739532470703,20.00259017944336,14.260479927062988)
                curveTo(19.38247299194336,13.90122127532959,18.61752700805664,13.90122127532959,17.99740982055664,14.260479927062988)
                curveTo(17.377290725708008,14.619739532470703,16.996795654296875,15.28333854675293,17.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,10.0)
                curveTo(18.0,12.0,17.0,13.5,17.0,16.0)
            }
}

public val LucideIcons.All.Heading6Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Heading6: ImageVector
    @Composable get() = Heading6Definition.asImageVector()
