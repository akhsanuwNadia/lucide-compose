package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PinOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,17.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,9.34000015258789)
                lineTo(15.0,7.0)
                curveTo(15.0,6.4477152824401855,15.447714805603027,6.0,16.0,6.0)
                curveTo(17.101078033447266,5.995075702667236,17.99107551574707,5.101089000701904,17.99107551574707,4.0)
                curveTo(17.99107551574707,2.8989107608795166,17.101078033447266,2.0049242973327637,16.0,2.0)
                lineTo(7.889999866485596,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,9.0)
                lineTo(9.0,10.760000228881836)
                curveTo(8.999597549438477,11.518943786621094,8.569657325744629,12.21226978302002,7.889999866485596,12.550000190734863)
                lineTo(6.109999656677246,13.449999809265137)
                curveTo(5.430342197418213,13.78773021697998,5.000402450561523,14.481056213378906,5.0,15.239999771118164)
                lineTo(5.0,16.0)
                curveTo(5.0,16.552284240722656,5.4477152824401855,17.0,6.0,17.0)
                lineTo(17.0,17.0)
            }
}

public val LucideIcons.All.PinOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PinOff: ImageVector
    @Composable get() = PinOffDefinition.asImageVector()
