package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CarFront") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0,8.0)
                lineTo(19.0,10.0)
                lineTo(17.5,6.300000190734863)
                curveTo(17.21042823791504,5.524862289428711,16.473421096801758,5.008082389831543,15.645999908447266,5.0)
                lineTo(8.399999618530273,5.0)
                curveTo(7.565510272979736,4.980834007263184,6.8068742752075195,5.481940269470215,6.496999740600586,6.256999969482422)
                lineTo(5.0,10.0)
                lineTo(3.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,14.0)
                lineTo(7.010000228881836,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,14.0)
                lineTo(17.010000228881836,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,10.0)
                lineTo(19.0,10.0)
                lineTo(21.0,10.0)
                lineTo(21.0,18.0)
                lineTo(19.0,18.0)
                lineTo(5.0,18.0)
                lineTo(3.0,18.0)
                lineTo(3.0,10.0)
                lineTo(5.0,10.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,18.0)
                lineTo(5.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,18.0)
                lineTo(19.0,20.0)
            }
}

public val LucideIcons.All.CarFrontDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CarFront: ImageVector
    @Composable get() = CarFrontDefinition.asImageVector()
