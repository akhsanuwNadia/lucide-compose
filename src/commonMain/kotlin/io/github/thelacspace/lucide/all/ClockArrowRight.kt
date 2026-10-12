package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClockArrowRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,6.0)
                lineTo(12.0,12.0)
                lineTo(14.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.5,21.885000228881836)
                curveTo(9.36510944366455,22.512331008911133,5.276558876037598,20.500268936157227,3.2510571479797363,16.841279983520508)
                curveTo(1.225555419921875,13.182289123535156,1.690969705581665,8.649295806884766,4.417730808258057,5.4782328605651855)
                curveTo(7.144492149353027,2.3071696758270264,11.556598663330078,1.167892575263977,15.47774600982666,2.622358560562134)
                curveTo(19.398893356323242,4.07682466506958,22.000778198242188,7.81779146194458,22.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,18.0)
                lineTo(22.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,22.0)
                lineTo(22.0,18.0)
                lineTo(18.0,14.0)
            }
}

public val LucideIcons.All.ClockArrowRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClockArrowRight: ImageVector
    @Composable get() = ClockArrowRightDefinition.asImageVector()
