package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlignHorizontalDistributeStart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,5.0)
                lineTo(8.0,5.0)
                lineTo(10.0,5.0)
                lineTo(10.0,19.0)
                lineTo(8.0,19.0)
                lineTo(6.0,19.0)
                lineTo(4.0,19.0)
                lineTo(4.0,5.0)
                lineTo(6.0,5.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,7.0)
                lineTo(18.0,7.0)
                lineTo(20.0,7.0)
                lineTo(20.0,17.0)
                lineTo(18.0,17.0)
                lineTo(16.0,17.0)
                lineTo(14.0,17.0)
                lineTo(14.0,7.0)
                lineTo(16.0,7.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,2.0)
                lineTo(4.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,2.0)
                lineTo(14.0,22.0)
            }
}

public val LucideIcons.All.AlignHorizontalDistributeStartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlignHorizontalDistributeStart: ImageVector
    @Composable get() = AlignHorizontalDistributeStartDefinition.asImageVector()
