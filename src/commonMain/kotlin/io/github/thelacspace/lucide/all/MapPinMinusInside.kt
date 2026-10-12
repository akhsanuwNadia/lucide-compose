package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MapPinMinusInside") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0,10.0)
                curveTo(20.0,14.993000030517578,14.461000442504883,20.19300079345703,12.60099983215332,21.798999786376953)
                curveTo(12.245038032531738,22.066667556762695,11.754961967468262,22.066667556762695,11.39900016784668,21.798999786376953)
                curveTo(9.538999557495117,20.19300079345703,4.0,14.993000030517578,4.0,10.0)
                curveTo(4.0196967124938965,5.595687389373779,7.595643043518066,2.0356972217559814,12.0,2.0356972217559814)
                curveTo(16.404356002807617,2.0356972217559814,19.980302810668945,5.595687389373779,20.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,10.0)
                lineTo(15.0,10.0)
            }
}

public val LucideIcons.All.MapPinMinusInsideDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MapPinMinusInside: ImageVector
    @Composable get() = MapPinMinusInsideDefinition.asImageVector()
