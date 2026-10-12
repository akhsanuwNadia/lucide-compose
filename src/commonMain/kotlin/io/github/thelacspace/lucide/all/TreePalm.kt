package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TreePalm") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0,8.0)
                curveTo(13.0,5.239999771118164,10.539999961853027,3.0,7.5,3.0)
                curveTo(4.460000038146973,3.0,2.0,5.239999771118164,2.0,8.0)
                lineTo(4.0,8.0)
                lineTo(5.0,7.0)
                lineTo(6.0,8.0)
                lineTo(10.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,7.139999866485596)
                curveTo(14.01260757446289,6.391350269317627,15.240723609924316,5.991335391998291,16.5,6.0)
                curveTo(19.540000915527344,6.0,22.0,8.239999771118164,22.0,11.0)
                lineTo(19.0,11.0)
                lineTo(18.0,10.0)
                lineTo(17.0,11.0)
                lineTo(14.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.889999866485596,9.710000038146973)
                curveTo(3.739999771118164,11.860000610351562,3.5899999141693115,15.180000305175781,5.539999961853027,17.139999389648438)
                lineTo(9.779999732971191,12.889999389648438)
                lineTo(10.479999542236328,12.1899995803833)
                lineTo(11.1899995803833,11.479999542236328)
                lineTo(13.309999465942383,9.359999656677246)
                curveTo(11.359999656677246,7.399999618530273,8.039999008178711,7.559999465942383,5.8899993896484375,9.710000038146973)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,15.5)
                curveTo(11.5,18.0,10.829999923706055,20.0,10.0,22.0)
                lineTo(14.0,22.0)
                curveTo(16.0,16.5,13.5,10.0,13.0,8.0)
            }
}

public val LucideIcons.All.TreePalmDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TreePalm: ImageVector
    @Composable get() = TreePalmDefinition.asImageVector()
