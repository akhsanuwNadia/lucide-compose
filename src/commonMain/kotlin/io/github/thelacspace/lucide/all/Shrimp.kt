package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Shrimp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,2.0)
                curveTo(10.603822708129883,3.2056756019592285,11.88400936126709,3.9189627170562744,13.22700023651123,3.797999858856201)
                lineTo(19.39699935913086,3.236999988555908)
                curveTo(20.25019073486328,3.1943044662475586,21.061012268066406,3.6113789081573486,21.522441864013672,4.330295562744141)
                curveTo(21.983871459960938,5.0492119789123535,22.02536964416504,5.960069179534912,21.631223678588867,6.717965602874756)
                curveTo(21.237077713012695,7.4758620262146,20.467538833618164,7.964937210083008,19.61400032043457,8.0)
                lineTo(8.5,8.0)
                curveTo(6.16166877746582,7.961411952972412,3.9861972332000732,9.193510055541992,2.816742420196533,11.218765258789062)
                curveTo(1.6472876071929932,13.244019508361816,1.6676737070083618,15.744085311889648,2.869999885559082,17.75)
                curveTo(4.031262397766113,19.76136589050293,6.177475452423096,21.00029754638672,8.5,21.0)
                curveTo(9.880000114440918,21.0,10.5,20.5,11.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,8.0)
                curveTo(8.666666984558105,10.5,8.666666984558105,13.5,10.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,22.0)
                curveTo(10.5,21.5,9.880000114440918,21.0,8.5,21.0)
                curveTo(7.123652458190918,20.993844985961914,6.011155605316162,19.876361846923828,6.011155605316162,18.5)
                curveTo(6.011155605316162,17.123638153076172,7.123652458190918,16.006155014038086,8.5,16.0)
                lineTo(12.0,16.0)
                curveTo(15.86599349975586,16.0,19.0,12.86599349975586,19.0,9.0)
                lineTo(19.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,12.0)
                lineTo(13.010000228881836,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,16.0)
                curveTo(6.0,16.0,3.5,12.0,4.0,10.0)
            }
}

public val LucideIcons.All.ShrimpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Shrimp: ImageVector
    @Composable get() = ShrimpDefinition.asImageVector()
