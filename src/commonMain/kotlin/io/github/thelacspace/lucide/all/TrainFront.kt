package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TrainFront") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0,3.0999999046325684)
                lineTo(8.0,7.0)
                curveTo(8.009848594665527,9.202156066894531,9.797821998596191,10.98215103149414,12.0,10.98215103149414)
                curveTo(14.202178001403809,10.98215103149414,15.990151405334473,9.202156066894531,16.0,7.0)
                lineTo(16.0,3.0999999046325684)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,15.0)
                lineTo(8.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,15.0)
                lineTo(16.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,19.0)
                curveTo(6.199999809265137,19.0,4.0,16.799999237060547,4.0,14.0)
                lineTo(4.0,10.0)
                curveTo(4.0196967124938965,5.595687389373779,7.595643043518066,2.0356972217559814,12.0,2.0356972217559814)
                curveTo(16.404356002807617,2.0356972217559814,19.980302810668945,5.595687389373779,20.0,10.0)
                lineTo(20.0,14.0)
                curveTo(20.0,16.799999237060547,17.799999237060547,19.0,15.0,19.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,19.0)
                lineTo(6.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,19.0)
                lineTo(18.0,22.0)
            }
}

public val LucideIcons.All.TrainFrontDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TrainFront: ImageVector
    @Composable get() = TrainFrontDefinition.asImageVector()
