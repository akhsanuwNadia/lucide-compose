package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlignHorizontalJustifyStart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0,5.0)
                lineTo(10.0,5.0)
                lineTo(12.0,5.0)
                lineTo(12.0,19.0)
                lineTo(10.0,19.0)
                lineTo(8.0,19.0)
                lineTo(6.0,19.0)
                lineTo(6.0,5.0)
                lineTo(8.0,5.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,7.0)
                lineTo(20.0,7.0)
                lineTo(22.0,7.0)
                lineTo(22.0,17.0)
                lineTo(20.0,17.0)
                lineTo(18.0,17.0)
                lineTo(16.0,17.0)
                lineTo(16.0,7.0)
                lineTo(18.0,7.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(2.0,22.0)
            }
}

public val LucideIcons.All.AlignHorizontalJustifyStartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlignHorizontalJustifyStart: ImageVector
    @Composable get() = AlignHorizontalJustifyStartDefinition.asImageVector()
