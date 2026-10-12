package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WavesLadder") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0,5.0)
                curveTo(17.895429611206055,5.0,17.0,5.895430564880371,17.0,7.0)
                lineTo(17.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,18.0)
                curveTo(2.5999999046325684,18.5,3.200000047683716,19.0,4.5,19.0)
                curveTo(7.0,19.0,7.0,17.0,9.5,17.0)
                curveTo(12.100000381469727,17.0,11.899999618530273,19.0,14.5,19.0)
                curveTo(17.0,19.0,17.0,17.0,19.5,17.0)
                curveTo(20.799999237060547,17.0,21.399999618530273,17.5,22.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,13.0)
                lineTo(17.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,9.0)
                lineTo(17.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,5.0)
                curveTo(7.895430564880371,5.0,7.0,5.895430564880371,7.0,7.0)
                lineTo(7.0,18.0)
            }
}

public val LucideIcons.All.WavesLadderDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WavesLadder: ImageVector
    @Composable get() = WavesLadderDefinition.asImageVector()
