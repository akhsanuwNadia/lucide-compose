package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BrickWallShield") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,9.0)
                lineTo(12.0,10.258000373840332)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,3.0)
                lineTo(16.0,8.460000038146973)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,9.118000030517578)
                lineTo(21.0,5.0)
                curveTo(21.0,3.895430564880371,20.104570388793945,3.0,19.0,3.0)
                lineTo(5.0,3.0)
                curveTo(3.895430564880371,3.0,3.0,3.895430564880371,3.0,5.0)
                lineTo(3.0,19.0)
                curveTo(3.0,20.104570388793945,3.895430564880371,21.0,5.0,21.0)
                lineTo(10.75,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,17.5)
                curveTo(22.0,19.999000549316406,20.25,21.249000549316406,18.170000076293945,21.9739990234375)
                curveTo(18.061080932617188,22.010908126831055,17.94277000427246,22.00914192199707,17.83500099182129,21.9689998626709)
                curveTo(15.750000953674316,21.249000549316406,14.000000953674316,19.999000549316406,14.000000953674316,17.499000549316406)
                lineTo(14.000000953674316,14.0)
                curveTo(14.000553131103516,13.724247932434082,14.224248886108398,13.500999450683594,14.500000953674316,13.50100040435791)
                curveTo(15.500000953674316,13.50100040435791,16.75,12.901000022888184,17.6200008392334,12.141000747680664)
                curveTo(17.840803146362305,11.959813117980957,18.158721923828125,11.959394454956055,18.380001068115234,12.140000343322754)
                curveTo(19.255001068115234,12.905000686645508,20.5,13.5,21.5,13.5)
                curveTo(21.776142120361328,13.5,22.0,13.723857879638672,22.0,14.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,15.0)
                lineTo(10.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,9.0)
                lineTo(15.142000198364258,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,15.0)
                lineTo(8.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,3.0)
                lineTo(8.0,9.0)
            }
}

public val LucideIcons.All.BrickWallShieldDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BrickWallShield: ImageVector
    @Composable get() = BrickWallShieldDefinition.asImageVector()
