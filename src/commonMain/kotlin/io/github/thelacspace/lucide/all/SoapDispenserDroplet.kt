package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SoapDispenserDroplet") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.5,2.0)
                lineTo(10.5,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,2.0)
                lineTo(7.0,2.0)
                curveTo(5.895430564880371,2.0,5.0,2.895430564880371,5.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.290000915527344,14.760000228881836)
                curveTo(18.12312126159668,13.801963806152344,17.31578826904297,12.476387023925781,17.0,11.0)
                curveTo(16.689495086669922,12.478485107421875,15.8811674118042,13.805695533752441,14.710000038146973,14.760000228881836)
                curveTo(13.5600004196167,15.680000305175781,13.0,16.799999237060547,13.0,17.950000762939453)
                curveTo(13.0,20.170000076293945,14.800000190734863,22.0,17.0,22.0)
                curveTo(19.200000762939453,22.0,21.0,20.170000076293945,21.0,17.950000762939453)
                curveTo(21.0,16.790000915527344,20.43000030517578,15.690000534057617,19.290000915527344,14.760000228881836)
            }
            lucidePath(strokeWidth) {
                moveTo(9.607000350952148,21.0)
                lineTo(6.0,21.0)
                curveTo(4.895430564880371,21.0,4.0,20.104570388793945,4.0,19.0)
                lineTo(4.0,12.0)
                curveTo(4.0,10.895430564880371,4.895430564880371,10.0,6.0,10.0)
                lineTo(13.0,10.0)
                lineTo(13.0,7.0)
                curveTo(13.0,6.4477152824401855,12.552285194396973,6.0,12.0,6.0)
                lineTo(9.0,6.0)
                curveTo(8.447714805603027,6.0,8.0,6.4477152824401855,8.0,7.0)
                lineTo(8.0,10.0)
            }
}

public val LucideIcons.All.SoapDispenserDropletDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SoapDispenserDroplet: ImageVector
    @Composable get() = SoapDispenserDropletDefinition.asImageVector()
