package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Pin") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,17.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,10.760000228881836)
                curveTo(8.999597549438477,11.518943786621094,8.569657325744629,12.21226978302002,7.889999866485596,12.550000190734863)
                lineTo(6.109999656677246,13.449999809265137)
                curveTo(5.430342197418213,13.78773021697998,5.000402450561523,14.481056213378906,5.0,15.239999771118164)
                lineTo(5.0,16.0)
                curveTo(5.0,16.552284240722656,5.4477152824401855,17.0,6.0,17.0)
                lineTo(18.0,17.0)
                curveTo(18.552284240722656,17.0,19.0,16.552284240722656,19.0,16.0)
                lineTo(19.0,15.239999771118164)
                curveTo(18.999597549438477,14.48105525970459,18.569656372070312,13.787729263305664,17.889999389648438,13.449999809265137)
                lineTo(16.10999870300293,12.550000190734863)
                curveTo(15.430341720581055,12.21226978302002,15.000402450561523,11.518943786621094,15.0,10.760000228881836)
                lineTo(15.0,7.0)
                curveTo(15.0,6.4477152824401855,15.447714805603027,6.0,16.0,6.0)
                curveTo(17.101078033447266,5.995075702667236,17.99107551574707,5.101089000701904,17.99107551574707,4.0)
                curveTo(17.99107551574707,2.8989107608795166,17.101078033447266,2.0049242973327637,16.0,2.0)
                lineTo(8.0,2.0)
                curveTo(6.898921966552734,2.0049242973327637,6.00892448425293,2.8989107608795166,6.00892448425293,4.0)
                curveTo(6.00892448425293,5.101089000701904,6.898921966552734,5.995075702667236,8.0,6.0)
                curveTo(8.552285194396973,6.0,9.0,6.4477152824401855,9.0,7.0)
                close()
            }
}

public val LucideIcons.All.PinDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Pin: ImageVector
    @Composable get() = PinDefinition.asImageVector()
