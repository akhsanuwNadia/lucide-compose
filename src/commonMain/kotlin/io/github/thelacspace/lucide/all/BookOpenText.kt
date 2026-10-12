package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookOpenText") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,5.0)
                lineTo(12.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,13.0)
                lineTo(18.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,9.0)
                lineTo(18.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.000999450683594,19.0)
                curveTo(21.105178833007812,18.999448776245117,22.0,18.10417938232422,22.0,17.0)
                lineTo(22.0,5.0)
                curveTo(22.0,3.8958206176757812,21.105178833007812,3.000551700592041,20.000999450683594,3.0)
                lineTo(16.0,3.002000093460083)
                curveTo(14.426565170288086,3.001527786254883,12.944689750671387,3.7417244911193848,12.0,5.0)
                curveTo(11.0557279586792,3.7409708499908447,9.573786735534668,3.0,8.0,3.0)
                lineTo(4.0,3.0)
                curveTo(2.895430564880371,3.0,2.0,3.895430564880371,2.0,5.0)
                lineTo(2.0,17.0)
                curveTo(1.9999998807907104,18.10417938232422,2.8948211669921875,18.999448776245117,3.999000072479248,19.0)
                lineTo(8.0,19.0)
                curveTo(9.573786735534668,19.0,11.0557279586792,19.740970611572266,12.0,21.0)
                curveTo(12.9442720413208,19.740970611572266,14.426213264465332,19.0,16.0,19.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,13.0)
                lineTo(8.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,9.0)
                lineTo(8.0,9.0)
            }
}

public val LucideIcons.All.BookOpenTextDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookOpenText: ImageVector
    @Composable get() = BookOpenTextDefinition.asImageVector()
