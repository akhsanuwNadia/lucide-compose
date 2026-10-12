package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RectangleCircle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,4.0)
                lineTo(14.0,20.0)
                lineTo(3.0,20.0)
                curveTo(2.4477152824401855,20.0,2.0,19.552284240722656,2.0,19.0)
                lineTo(2.0,5.0)
                curveTo(2.0,4.4477152824401855,2.4477152824401855,4.0,3.0,4.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,12.0)
                curveTo(5.987179756164551,14.866647720336914,7.509161472320557,17.521041870117188,9.989636421203613,18.958078384399414)
                curveTo(12.470111846923828,20.395116806030273,15.529888153076172,20.395116806030273,18.01036262512207,18.958078384399414)
                curveTo(20.4908390045166,17.521041870117188,22.012819290161133,14.866647720336914,22.0,12.0)
                curveTo(22.012819290161133,9.133352279663086,20.4908390045166,6.4789581298828125,18.01036262512207,5.0419206619262695)
                curveTo(15.529888153076172,3.6048834323883057,12.470111846923828,3.6048834323883057,9.989636421203613,5.0419206619262695)
                curveTo(7.509161472320557,6.4789581298828125,5.987179756164551,9.133352279663086,6.0,12.0)
            }
}

public val LucideIcons.All.RectangleCircleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RectangleCircle: ImageVector
    @Composable get() = RectangleCircleDefinition.asImageVector()
