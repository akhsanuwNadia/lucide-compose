package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlignStartVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0,14.0)
                lineTo(13.0,14.0)
                lineTo(15.0,14.0)
                lineTo(15.0,20.0)
                lineTo(13.0,20.0)
                lineTo(8.0,20.0)
                lineTo(6.0,20.0)
                lineTo(6.0,14.0)
                lineTo(8.0,14.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,4.0)
                lineTo(20.0,4.0)
                lineTo(22.0,4.0)
                lineTo(22.0,10.0)
                lineTo(20.0,10.0)
                lineTo(8.0,10.0)
                lineTo(6.0,10.0)
                lineTo(6.0,4.0)
                lineTo(8.0,4.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(2.0,22.0)
            }
}

public val LucideIcons.All.AlignStartVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlignStartVertical: ImageVector
    @Composable get() = AlignStartVerticalDefinition.asImageVector()
