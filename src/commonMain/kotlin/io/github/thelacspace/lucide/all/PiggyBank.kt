package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PiggyBank") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,17.0)
                lineTo(14.0,17.0)
                lineTo(14.0,19.0)
                curveTo(14.0,19.552284240722656,14.447714805603027,20.0,15.0,20.0)
                lineTo(17.0,20.0)
                curveTo(17.552284240722656,20.0,18.0,19.552284240722656,18.0,19.0)
                lineTo(18.0,16.0)
                curveTo(18.94446563720703,15.685556411743164,19.685556411743164,14.944465637207031,20.0,14.0)
                lineTo(21.0,14.0)
                curveTo(21.552284240722656,14.0,22.0,13.552285194396973,22.0,13.0)
                lineTo(22.0,11.0)
                curveTo(22.0,10.447714805603027,21.552284240722656,10.0,21.0,10.0)
                lineTo(20.0,10.0)
                curveTo(20.0,8.426213264465332,19.259029388427734,6.944272041320801,18.0,6.0)
                lineTo(18.0,3.0)
                curveTo(16.740970611572266,3.0,15.555418014526367,3.5927765369415283,14.800000190734863,4.599999904632568)
                lineTo(14.5,5.0)
                lineTo(11.0,5.0)
                curveTo(7.686291694641113,5.0,5.0,7.686291694641113,5.0,11.0)
                lineTo(5.0,12.0)
                curveTo(5.0,13.573786735534668,5.740970611572266,15.0557279586792,7.0,16.0)
                lineTo(7.0,19.0)
                curveTo(7.0,19.552284240722656,7.4477152824401855,20.0,8.0,20.0)
                lineTo(10.0,20.0)
                curveTo(10.552285194396973,20.0,11.0,19.552284240722656,11.0,19.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,10.0)
                lineTo(16.010000228881836,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,8.0)
                lineTo(2.0,9.0)
                curveTo(2.0,10.104569435119629,2.895430564880371,11.0,4.0,11.0)
                lineTo(5.0,11.0)
            }
}

public val LucideIcons.All.PiggyBankDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PiggyBank: ImageVector
    @Composable get() = PiggyBankDefinition.asImageVector()
