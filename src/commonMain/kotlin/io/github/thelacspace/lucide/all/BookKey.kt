package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookKey") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0,2.0)
                lineTo(6.5,2.0)
                curveTo(5.119287967681885,2.0,4.0,3.119288206100464,4.0,4.5)
                lineTo(4.0,19.5)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,2.0)
                lineTo(17.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,4.0)
                lineTo(19.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,15.199999809265137)
                lineTo(20.0,21.0)
                curveTo(20.0,21.552284240722656,19.552284240722656,22.0,19.0,22.0)
                lineTo(6.5,22.0)
                curveTo(5.123652458190918,21.993844985961914,4.011155605316162,20.876361846923828,4.011155605316162,19.5)
                curveTo(4.011155605316162,18.123638153076172,5.123652458190918,17.006155014038086,6.5,17.0)
                lineTo(20.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,10.0)
                curveTo(14.996794700622559,10.71666145324707,15.377290725708008,11.380260467529297,15.997408866882324,11.739520072937012)
                curveTo(16.61752700805664,12.09877872467041,17.38247299194336,12.09877872467041,18.00259017944336,11.739520072937012)
                curveTo(18.622709274291992,11.380260467529297,19.003204345703125,10.71666145324707,19.0,10.0)
                curveTo(19.003204345703125,9.28333854675293,18.622709274291992,8.619739532470703,18.00259017944336,8.260479927062988)
                curveTo(17.38247299194336,7.901220798492432,16.61752700805664,7.901220798492432,15.997408866882324,8.260479927062988)
                curveTo(15.377290725708008,8.619739532470703,14.996794700622559,9.28333854675293,15.0,10.0)
            }
}

public val LucideIcons.All.BookKeyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookKey: ImageVector
    @Composable get() = BookKeyDefinition.asImageVector()
