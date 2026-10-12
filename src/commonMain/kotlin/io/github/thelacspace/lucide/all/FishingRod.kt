package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FishingRod") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,11.0)
                lineTo(5.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,15.0)
                curveTo(7.995075702667236,16.101078033447266,7.101089000701904,16.99107551574707,6.0,16.99107551574707)
                curveTo(4.898910999298096,16.99107551574707,4.004924297332764,16.101078033447266,4.0,15.0)
                lineTo(4.0,3.0)
                curveTo(4.0,2.4477152824401855,4.4477152824401855,2.0,5.0,2.0)
                lineTo(5.5,2.0)
                curveTo(14.0,2.0,20.0,9.0,20.0,18.0)
                lineTo(20.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,18.0)
                curveTo(15.996794700622559,18.71666145324707,16.377290725708008,19.380260467529297,16.99740982055664,19.739519119262695)
                curveTo(17.61752700805664,20.098779678344727,18.38247299194336,20.098779678344727,19.00259017944336,19.739519119262695)
                curveTo(19.622709274291992,19.380260467529297,20.003204345703125,18.71666145324707,20.0,18.0)
                curveTo(20.003204345703125,17.28333854675293,19.622709274291992,16.619739532470703,19.00259017944336,16.260480880737305)
                curveTo(18.38247299194336,15.90122127532959,17.61752700805664,15.90122127532959,16.99740982055664,16.260480880737305)
                curveTo(16.377290725708008,16.619739532470703,15.996794700622559,17.28333854675293,16.0,18.0)
            }
}

public val LucideIcons.All.FishingRodDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FishingRod: ImageVector
    @Composable get() = FishingRodDefinition.asImageVector()
