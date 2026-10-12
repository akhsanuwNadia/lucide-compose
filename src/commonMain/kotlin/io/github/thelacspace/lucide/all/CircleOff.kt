package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.350000381469727,2.690000057220459)
                curveTo(12.049880981445312,1.2449358701705933,16.254268646240234,2.1266472339630127,19.061861038208008,4.936407566070557)
                curveTo(21.86945343017578,7.746168613433838,22.7479190826416,11.951234817504883,21.299999237060547,15.649999618530273)
            }
            lucidePath(strokeWidth) {
                moveTo(19.079999923706055,19.079999923706055)
                curveTo(16.554363250732422,21.628328323364258,12.858270645141602,22.63051414489746,9.391271591186523,21.70707130432129)
                curveTo(5.9242730140686035,20.783628463745117,3.2163705825805664,18.075727462768555,2.2929282188415527,14.608728408813477)
                curveTo(1.3694859743118286,11.141729354858398,2.371671199798584,7.4456377029418945,4.920000076293945,4.920000076293945)
            }
}

public val LucideIcons.All.CircleOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleOff: ImageVector
    @Composable get() = CircleOffDefinition.asImageVector()
