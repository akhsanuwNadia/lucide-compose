package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Landmark") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,18.0)
                lineTo(10.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.119000434875488,2.2049999237060547)
                curveTo(11.674689292907715,1.932340145111084,12.325311660766602,1.932340145111084,12.881000518798828,2.2049999237060547)
                lineTo(20.72100067138672,6.050999641418457)
                curveTo(20.930082321166992,6.1534423828125,21.040782928466797,6.386642932891846,20.98797607421875,6.613405227661133)
                curveTo(20.93516731262207,6.84016752243042,20.732830047607422,7.0004682540893555,20.5,7.0)
                lineTo(3.5,7.0)
                curveTo(3.2673583030700684,7.000000953674316,3.06545352935791,6.839548587799072,3.0129151344299316,6.612916946411133)
                curveTo(2.960376739501953,6.386285305023193,3.0710878372192383,6.1533613204956055,3.2799999713897705,6.051000118255615)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,18.0)
                lineTo(14.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,18.0)
                lineTo(18.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,22.0)
                lineTo(21.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,18.0)
                lineTo(6.0,11.0)
            }
}

public val LucideIcons.All.LandmarkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Landmark: ImageVector
    @Composable get() = LandmarkDefinition.asImageVector()
