package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareM") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0,16.0)
                lineTo(8.0,8.5)
                curveTo(8.0,8.284785270690918,8.137715339660645,8.09371566772461,8.341885566711426,8.02565860748291)
                curveTo(8.546056747436523,7.957601547241211,8.770870208740234,8.027828216552734,8.899999618530273,8.199999809265137)
                lineTo(11.59999942779541,11.798999786376953)
                curveTo(11.694426536560059,11.92490291595459,11.842620849609375,11.99899959564209,12.0,11.99899959564209)
                curveTo(12.157378196716309,11.99899959564209,12.305572509765625,11.92490291595459,12.399999618530273,11.798999786376953)
                lineTo(15.09999942779541,8.198999404907227)
                curveTo(15.22912883758545,8.026827812194824,15.45394229888916,7.956601142883301,15.658113479614258,8.024658203125)
                curveTo(15.862283706665039,8.0927152633667,15.999999046325684,8.283784866333008,15.999999046325684,8.49899959564209)
                lineTo(15.999999046325684,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,3.0)
                lineTo(19.0,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,21.0)
                lineTo(19.0,21.0)
                lineTo(5.0,21.0)
                lineTo(3.0,21.0)
                lineTo(3.0,3.0)
                lineTo(5.0,3.0)
                close()
            }
}

public val LucideIcons.All.SquareMDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareM: ImageVector
    @Composable get() = SquareMDefinition.asImageVector()
