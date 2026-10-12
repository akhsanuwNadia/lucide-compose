package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Hd") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,12.0)
                lineTo(6.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,15.0)
                lineTo(10.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,14.5)
                curveTo(14.0,14.776142120361328,14.223857879638672,15.0,14.5,15.0)
                lineTo(15.5,15.0)
                curveTo(16.880712509155273,15.0,18.0,13.880711555480957,18.0,12.5)
                lineTo(18.0,11.5)
                curveTo(18.0,10.119288444519043,16.880712509155273,9.0,15.5,9.0)
                lineTo(14.5,9.0)
                curveTo(14.223857879638672,9.0,14.0,9.223857879638672,14.0,9.5)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,15.0)
                lineTo(6.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,5.0)
                lineTo(20.0,5.0)
                lineTo(22.0,5.0)
                lineTo(22.0,19.0)
                lineTo(20.0,19.0)
                lineTo(4.0,19.0)
                lineTo(2.0,19.0)
                lineTo(2.0,5.0)
                lineTo(4.0,5.0)
                close()
            }
}

public val LucideIcons.All.HdDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Hd: ImageVector
    @Composable get() = HdDefinition.asImageVector()
