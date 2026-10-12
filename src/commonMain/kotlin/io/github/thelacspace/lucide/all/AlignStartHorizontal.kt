package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlignStartHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,6.0)
                lineTo(8.0,6.0)
                lineTo(10.0,6.0)
                lineTo(10.0,22.0)
                lineTo(8.0,22.0)
                lineTo(6.0,22.0)
                lineTo(4.0,22.0)
                lineTo(4.0,6.0)
                lineTo(6.0,6.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,6.0)
                lineTo(18.0,6.0)
                lineTo(20.0,6.0)
                lineTo(20.0,15.0)
                lineTo(18.0,15.0)
                lineTo(16.0,15.0)
                lineTo(14.0,15.0)
                lineTo(14.0,6.0)
                lineTo(16.0,6.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,2.0)
                lineTo(2.0,2.0)
            }
}

public val LucideIcons.All.AlignStartHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlignStartHorizontal: ImageVector
    @Composable get() = AlignStartHorizontalDefinition.asImageVector()
