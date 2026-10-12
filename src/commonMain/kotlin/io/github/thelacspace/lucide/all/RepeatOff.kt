package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RepeatOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.656000137329102,6.0)
                lineTo(21.0,6.0)
                lineTo(17.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.898000717163086,17.898000717163086)
                curveTo(17.60348129272461,17.965816497802734,17.30222511291504,18.00003433227539,17.0,18.0)
                lineTo(3.0,18.0)
                lineTo(7.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,13.0)
                lineTo(21.0,14.0)
                curveTo(21.00019073486328,14.392632484436035,20.94257354736328,14.783153533935547,20.82900047302246,15.159000396728516)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,6.0)
                lineTo(17.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,11.0)
                lineTo(3.0,10.0)
                curveTo(2.9999518394470215,8.136785507202148,4.286345958709717,6.520291805267334,6.1020002365112305,6.1020002365112305)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,22.0)
                lineTo(3.0,18.0)
            }
}

public val LucideIcons.All.RepeatOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RepeatOff: ImageVector
    @Composable get() = RepeatOffDefinition.asImageVector()
