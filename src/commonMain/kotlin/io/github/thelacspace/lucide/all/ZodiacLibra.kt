package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacLibra") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,16.0)
                lineTo(9.857000350952148,16.0)
                curveTo(10.019000053405762,15.98799991607666,10.04699993133545,15.677000045776367,9.895000457763672,15.619999885559082)
                curveTo(7.178645133972168,14.601775169372559,5.579799652099609,11.78599739074707,6.097208499908447,8.931587219238281)
                curveTo(6.614617347717285,6.07717752456665,9.100074768066406,4.001747131347656,12.00100040435791,4.001747131347656)
                curveTo(14.901926040649414,4.001747131347656,17.38738250732422,6.07717752456665,17.90479278564453,8.931587219238281)
                curveTo(18.42220115661621,11.78599739074707,16.82335662841797,14.601775169372559,14.107000350952148,15.619999885559082)
                curveTo(13.954000473022461,15.677000045776367,13.982000350952148,15.98799991607666,14.145000457763672,16.0)
                lineTo(21.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,20.0)
                lineTo(21.0,20.0)
            }
}

public val LucideIcons.All.ZodiacLibraDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacLibra: ImageVector
    @Composable get() = ZodiacLibraDefinition.asImageVector()
