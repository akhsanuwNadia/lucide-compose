package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PaperBag") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.363999843597412,3.8480000495910645)
                curveTo(4.0,6.0,3.0,9.652000427246094,3.0,12.652000427246094)
                lineTo(3.0,19.0)
                curveTo(3.0,20.104570388793945,3.895430564880371,21.0,5.0,21.0)
                lineTo(19.0,21.0)
                curveTo(20.104570388793945,21.0,21.0,20.104570388793945,21.0,19.0)
                lineTo(21.0,14.0)
                curveTo(21.0,11.666000366210938,19.18400001525879,9.331999778747559,18.378000259399414,6.998000144958496)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,3.0)
                lineTo(18.378999710083008,3.0)
                curveTo(19.13669204711914,3.000025987625122,19.82931137084961,3.4282190799713135,20.167999267578125,4.105999946594238)
                lineTo(20.89099884033203,5.552999973297119)
                curveTo(21.04585838317871,5.8629021644592285,21.02928352355957,6.230878829956055,20.847192764282227,6.525605201721191)
                curveTo(20.665103912353516,6.820331573486328,20.34343910217285,6.999814510345459,19.996999740600586,7.0)
                lineTo(11.472000122070312,7.0)
                curveTo(10.714308738708496,6.999974250793457,10.021688461303711,6.571780681610107,9.683000564575195,5.894000053405762)
                lineTo(8.789999961853027,4.105000019073486)
                curveTo(8.47234058380127,3.4623334407806396,7.835097789764404,3.038755178451538,7.11956787109375,2.9946558475494385)
                curveTo(6.404037952423096,2.950556755065918,5.719604015350342,3.292678117752075,5.3254313468933105,3.8914735317230225)
                curveTo(4.9312591552734375,4.490268707275391,4.8876051902771,5.254200458526611,5.210999965667725,5.894000053405762)
                lineTo(7.4720001220703125,10.416000366210938)
                curveTo(7.8191752433776855,11.110245704650879,7.9999470710754395,11.875786781311035,8.0,12.652000427246094)
                lineTo(8.0,21.0)
            }
}

public val LucideIcons.All.PaperBagDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PaperBag: ImageVector
    @Composable get() = PaperBagDefinition.asImageVector()
