package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PaintbrushVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,2.0)
                lineTo(10.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,2.0)
                lineTo(14.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,2.0)
                curveTo(17.552284240722656,2.0,18.0,2.4477152824401855,18.0,3.0)
                lineTo(18.0,12.0)
                lineTo(6.0,12.0)
                lineTo(6.0,3.0)
                curveTo(6.0,2.4477152824401855,6.4477152824401855,2.0,7.0,2.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,12.0)
                curveTo(5.4477152824401855,12.0,5.0,12.447714805603027,5.0,13.0)
                lineTo(5.0,14.0)
                curveTo(5.0,15.104569435119629,5.895430564880371,16.0,7.0,16.0)
                lineTo(9.0,16.0)
                curveTo(9.552285194396973,16.0,10.0,16.447715759277344,10.0,17.0)
                lineTo(10.0,19.899999618530273)
                curveTo(9.996794700622559,20.616661071777344,10.377290725708008,21.28026008605957,10.997408866882324,21.63951873779297)
                curveTo(11.617527961730957,21.998779296875,12.382472038269043,21.998779296875,13.002591133117676,21.63951873779297)
                curveTo(13.622709274291992,21.28026008605957,14.003205299377441,20.616661071777344,14.0,19.899999618530273)
                lineTo(14.0,17.0)
                curveTo(14.0,16.447715759277344,14.447714805603027,16.0,15.0,16.0)
                lineTo(17.0,16.0)
                curveTo(18.104570388793945,16.0,19.0,15.104569435119629,19.0,14.0)
                lineTo(19.0,13.0)
                curveTo(19.0,12.447714805603027,18.552284240722656,12.0,18.0,12.0)
            }
}

public val LucideIcons.All.PaintbrushVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PaintbrushVertical: ImageVector
    @Composable get() = PaintbrushVerticalDefinition.asImageVector()
