package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlignEndVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,4.0)
                lineTo(16.0,4.0)
                lineTo(18.0,4.0)
                lineTo(18.0,10.0)
                lineTo(16.0,10.0)
                lineTo(4.0,10.0)
                lineTo(2.0,10.0)
                lineTo(2.0,4.0)
                lineTo(4.0,4.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,14.0)
                lineTo(16.0,14.0)
                lineTo(18.0,14.0)
                lineTo(18.0,20.0)
                lineTo(16.0,20.0)
                lineTo(11.0,20.0)
                lineTo(9.0,20.0)
                lineTo(9.0,14.0)
                lineTo(11.0,14.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,22.0)
                lineTo(22.0,2.0)
            }
}

public val LucideIcons.All.AlignEndVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlignEndVertical: ImageVector
    @Composable get() = AlignEndVerticalDefinition.asImageVector()
