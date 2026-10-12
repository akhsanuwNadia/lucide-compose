package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HandHelping") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,12.0)
                lineTo(13.0,12.0)
                curveTo(13.71666145324707,12.003205299377441,14.380260467529297,11.622709274291992,14.739520072937012,11.002591133117676)
                curveTo(15.09877872467041,10.382472038269043,15.09877872467041,9.617527961730957,14.739520072937012,8.997408866882324)
                curveTo(14.380260467529297,8.377290725708008,13.71666145324707,7.996795177459717,13.0,8.0)
                lineTo(10.0,8.0)
                curveTo(9.399999618530273,8.0,8.899999618530273,8.199999809265137,8.600000381469727,8.600000381469727)
                lineTo(3.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,18.0)
                lineTo(8.600000381469727,16.600000381469727)
                curveTo(8.90000057220459,16.200000762939453,9.40000057220459,16.0,10.0,16.0)
                lineTo(14.0,16.0)
                curveTo(15.100000381469727,16.0,16.100000381469727,15.600000381469727,16.799999237060547,14.800000190734863)
                lineTo(21.399999618530273,10.399999618530273)
                curveTo(22.197649002075195,9.639426231384277,22.230504989624023,8.377177238464355,21.473506927490234,7.576135158538818)
                curveTo(20.716508865356445,6.775092601776123,19.45442008972168,6.73659086227417,18.649999618530273,7.489999771118164)
                lineTo(14.449999809265137,11.389999389648438)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,13.0)
                lineTo(8.0,19.0)
            }
}

public val LucideIcons.All.HandHelpingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HandHelping: ImageVector
    @Composable get() = HandHelpingDefinition.asImageVector()
