package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Video") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,13.0)
                lineTo(21.222999572753906,16.48200035095215)
                curveTo(21.37641143798828,16.584089279174805,21.573543548583984,16.59351921081543,21.736000061035156,16.506542205810547)
                curveTo(21.89845848083496,16.41956329345703,21.99990463256836,16.250276565551758,22.0,16.06599998474121)
                lineTo(22.0,7.869999885559082)
                curveTo(22.00005340576172,7.690927028656006,21.90433692932129,7.525498867034912,21.749061584472656,7.436298370361328)
                curveTo(21.593786239624023,7.347097873687744,21.402664184570312,7.347746849060059,21.24799919128418,7.437999725341797)
                lineTo(16.0,10.5)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,6.0)
                lineTo(14.0,6.0)
                lineTo(16.0,6.0)
                lineTo(16.0,18.0)
                lineTo(14.0,18.0)
                lineTo(4.0,18.0)
                lineTo(2.0,18.0)
                lineTo(2.0,6.0)
                lineTo(4.0,6.0)
                close()
            }
}

public val LucideIcons.All.VideoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Video: ImageVector
    @Composable get() = VideoDefinition.asImageVector()
