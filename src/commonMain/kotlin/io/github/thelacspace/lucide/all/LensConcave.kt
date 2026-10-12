package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LensConcave") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0,2.0)
                curveTo(6.621227741241455,2.0,6.274964809417725,2.2140023708343506,6.105572700500488,2.552786350250244)
                curveTo(5.936180591583252,2.8915703296661377,5.972736835479736,3.2969822883605957,6.199999809265137,3.5999999046325684)
                curveTo(9.933333396911621,8.577777862548828,9.933333396911621,15.422222137451172,6.199999809265137,20.399999618530273)
                curveTo(5.972736358642578,20.703018188476562,5.936180114746094,21.108428955078125,6.10557222366333,21.447214126586914)
                curveTo(6.274964332580566,21.78599739074707,6.621227741241455,22.0,7.0,22.0)
                lineTo(17.0,22.0)
                curveTo(17.378772735595703,22.0,17.725034713745117,21.78599739074707,17.894426345825195,21.44721221923828)
                curveTo(18.063817977905273,21.108428955078125,18.02726173400879,20.70301628112793,17.799999237060547,20.399999618530273)
                curveTo(14.066666603088379,15.422222137451172,14.066666603088379,8.577777862548828,17.799999237060547,3.6000003814697266)
                curveTo(18.02726173400879,3.296982765197754,18.063817977905273,2.891571044921875,17.894426345825195,2.5527868270874023)
                curveTo(17.725034713745117,2.2140026092529297,17.378772735595703,2.000000238418579,17.0,2.0)
                close()
            }
}

public val LucideIcons.All.LensConcaveDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LensConcave: ImageVector
    @Composable get() = LensConcaveDefinition.asImageVector()
