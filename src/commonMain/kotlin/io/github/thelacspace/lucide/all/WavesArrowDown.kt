package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WavesArrowDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,10.0)
                lineTo(12.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,6.0)
                lineTo(12.0,10.0)
                lineTo(8.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,15.0)
                curveTo(2.5999999046325684,15.5,3.200000047683716,16.0,4.5,16.0)
                curveTo(7.0,16.0,7.0,14.0,9.5,14.0)
                curveTo(12.100000381469727,14.0,11.899999618530273,16.0,14.5,16.0)
                curveTo(17.0,16.0,17.0,14.0,19.5,14.0)
                curveTo(20.799999237060547,14.0,21.399999618530273,14.5,22.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,21.0)
                curveTo(2.5999999046325684,21.5,3.200000047683716,22.0,4.5,22.0)
                curveTo(7.0,22.0,7.0,20.0,9.5,20.0)
                curveTo(12.100000381469727,20.0,11.899999618530273,22.0,14.5,22.0)
                curveTo(17.0,22.0,17.0,20.0,19.5,20.0)
                curveTo(20.799999237060547,20.0,21.399999618530273,20.5,22.0,21.0)
            }
}

public val LucideIcons.All.WavesArrowDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WavesArrowDown: ImageVector
    @Composable get() = WavesArrowDownDefinition.asImageVector()
