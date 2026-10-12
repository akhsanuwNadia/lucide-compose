package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleGauge") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.600000381469727,2.700000047683716)
                curveTo(11.191832542419434,0.9874430298805237,6.186670303344727,2.5970053672790527,3.6030054092407227,6.557999134063721)
                curveTo(1.0193405151367188,10.51899242401123,1.5636392831802368,15.748340606689453,4.907648086547852,19.092350006103516)
                curveTo(8.251657485961914,22.436359405517578,13.48100471496582,22.98065757751465,17.441999435424805,20.39699363708496)
                curveTo(21.402992248535156,17.813329696655273,23.012556076049805,12.808167457580566,21.299999237060547,8.399999618530273)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,12.0)
                curveTo(9.996794700622559,12.71666145324707,10.377290725708008,13.380260467529297,10.997408866882324,13.739520072937012)
                curveTo(11.617527961730957,14.09877872467041,12.382472038269043,14.09877872467041,13.002591133117676,13.739520072937012)
                curveTo(13.622709274291992,13.380260467529297,14.003205299377441,12.71666145324707,14.0,12.0)
                curveTo(14.003205299377441,11.28333854675293,13.622709274291992,10.619739532470703,13.002591133117676,10.260479927062988)
                curveTo(12.382472038269043,9.90122127532959,11.617527961730957,9.90122127532959,10.997408866882324,10.260479927062988)
                curveTo(10.377290725708008,10.619739532470703,9.996794700622559,11.28333854675293,10.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.399999618530273,10.600000381469727)
                lineTo(19.0,5.0)
            }
}

public val LucideIcons.All.CircleGaugeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleGauge: ImageVector
    @Composable get() = CircleGaugeDefinition.asImageVector()
