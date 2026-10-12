package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookLock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0,6.0)
                lineTo(18.0,4.0)
                curveTo(18.003204345703125,3.2833380699157715,17.622709274291992,2.619739532470703,17.00259017944336,2.2604801654815674)
                curveTo(16.38247299194336,1.9012209177017212,15.617527961730957,1.9012209177017212,14.997408866882324,2.2604801654815674)
                curveTo(14.377290725708008,2.619739532470703,13.996794700622559,3.2833380699157715,14.0,4.0)
                lineTo(14.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,15.0)
                lineTo(20.0,21.0)
                curveTo(20.0,21.552284240722656,19.552284240722656,22.0,19.0,22.0)
                lineTo(6.5,22.0)
                curveTo(5.123652458190918,21.993844985961914,4.011155605316162,20.876361846923828,4.011155605316162,19.5)
                curveTo(4.011155605316162,18.123638153076172,5.123652458190918,17.006155014038086,6.5,17.0)
                lineTo(20.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,19.5)
                lineTo(4.0,4.5)
                curveTo(4.0,3.119288206100464,5.119287967681885,2.0,6.5,2.0)
                lineTo(10.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,6.0)
                lineTo(19.0,6.0)
                lineTo(20.0,6.0)
                lineTo(20.0,11.0)
                lineTo(19.0,11.0)
                lineTo(13.0,11.0)
                lineTo(12.0,11.0)
                lineTo(12.0,6.0)
                lineTo(13.0,6.0)
                close()
            }
}

public val LucideIcons.All.BookLockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookLock: ImageVector
    @Composable get() = BookLockDefinition.asImageVector()
