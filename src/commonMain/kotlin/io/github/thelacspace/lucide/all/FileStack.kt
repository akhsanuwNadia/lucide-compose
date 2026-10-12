package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileStack") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,21.0)
                curveTo(11.0,21.552284240722656,10.552285194396973,22.0,10.0,22.0)
                lineTo(4.0,22.0)
                curveTo(3.4477152824401855,22.0,3.0,21.552284240722656,3.0,21.0)
                lineTo(3.0,13.0)
                curveTo(3.0,12.447714805603027,3.4477152824401855,12.0,4.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,16.0)
                curveTo(16.0,16.552284240722656,15.552285194396973,17.0,15.0,17.0)
                lineTo(9.0,17.0)
                curveTo(8.447714805603027,17.0,8.0,16.552284240722656,8.0,16.0)
                lineTo(8.0,8.0)
                curveTo(8.0,7.4477152824401855,8.447714805603027,7.0,9.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,6.0)
                curveTo(20.999887466430664,5.469610214233398,20.789098739624023,4.96098518371582,20.413999557495117,4.585999965667725)
                lineTo(18.413999557495117,2.5859999656677246)
                curveTo(18.03901481628418,2.2109012603759766,17.5303897857666,2.0001134872436523,17.0,2.0)
                lineTo(14.0,2.0)
                curveTo(13.447714805603027,2.0,13.0,2.4477152824401855,13.0,3.0)
                lineTo(13.0,11.0)
                curveTo(13.0,11.552285194396973,13.447714805603027,12.0,14.0,12.0)
                lineTo(20.0,12.0)
                curveTo(20.552284240722656,12.0,21.0,11.552285194396973,21.0,11.0)
                close()
            }
}

public val LucideIcons.All.FileStackDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileStack: ImageVector
    @Composable get() = FileStackDefinition.asImageVector()
