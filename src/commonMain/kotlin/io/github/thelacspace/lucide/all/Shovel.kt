package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Shovel") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.56f,4.56f)
                curveTo(21.841513f,4.841332f,21.99968f,5.2230086f,21.99968f,5.6210003f)
                curveTo(21.99968f,6.0189915f,21.841513f,6.400668f,21.56f,6.682f)
                lineTo(21.09f,7.152f)
                curveTo(19.913834f,8.295014f,18.037766f,8.2816515f,16.878f,7.1219997f)
                curveTo(16.31528f,6.5593762f,15.999141f,5.7962375f,15.999141f,5.0004997f)
                curveTo(15.999141f,4.204762f,16.31528f,3.4416234f,16.878f,2.8789997f)
                lineTo(17.318f,2.4389997f)
                curveTo(17.903751f,1.8534266f,18.85325f,1.8534266f,19.439001f,2.4389997f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,22.0f)
                curveTo(2.4477153f,22.0f,2.0f,21.552284f,2.0f,21.0f)
                lineTo(2.0f,17.414f)
                curveTo(2.0000565f,17.148804f,2.1054504f,16.894491f,2.293f,16.706999f)
                lineTo(5.648f,13.351999f)
                curveTo(6.118567f,12.881502f,6.8814325f,12.881502f,7.3519998f,13.351999f)
                lineTo(10.648f,16.647999f)
                curveTo(11.118497f,17.118567f,11.118497f,17.881432f,10.648f,18.352f)
                lineTo(7.2929997f,21.706999f)
                curveTo(7.105507f,21.894548f,6.8511944f,21.99994f,6.5859995f,21.999998f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,15.0f)
                lineTo(16.879f,7.122f)
            }
}

public val LucideIcons.All.ShovelDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Shovel: ImageVector
    @Composable get() = ShovelDefinition.asImageVector()
