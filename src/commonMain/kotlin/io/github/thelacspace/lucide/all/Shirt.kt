package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Shirt") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.3799991607666,3.4600000381469727)
                lineTo(16.0,2.0)
                curveTo(15.990151405334473,4.2021565437316895,14.202178001403809,5.982151508331299,12.0,5.982151508331299)
                curveTo(9.797821998596191,5.982151508331299,8.009848594665527,4.2021565437316895,8.0,2.0)
                lineTo(3.619999885559082,3.4600000381469727)
                curveTo(2.6848342418670654,3.7715606689453125,2.116109609603882,4.718019962310791,2.2799997329711914,5.690000057220459)
                lineTo(2.859999656677246,9.15999984741211)
                curveTo(2.9386565685272217,9.645284652709961,3.3583834171295166,10.00141716003418,3.8499996662139893,10.0)
                lineTo(6.0,10.0)
                lineTo(6.0,20.0)
                curveTo(6.0,21.100000381469727,6.900000095367432,22.0,8.0,22.0)
                lineTo(16.0,22.0)
                curveTo(17.104570388793945,22.0,18.0,21.104570388793945,18.0,20.0)
                lineTo(18.0,10.0)
                lineTo(20.149999618530273,10.0)
                curveTo(20.64161491394043,10.00141716003418,21.061342239379883,9.645284652709961,21.139999389648438,9.15999984741211)
                lineTo(21.719999313354492,5.689999580383301)
                curveTo(21.88389015197754,4.718019485473633,21.31516456604004,3.7715601921081543,20.3799991607666,3.4599995613098145)
                close()
            }
}

public val LucideIcons.All.ShirtDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Shirt: ImageVector
    @Composable get() = ShirtDefinition.asImageVector()
