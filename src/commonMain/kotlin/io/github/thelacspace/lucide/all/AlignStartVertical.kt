package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlignStartVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0f,14.0f)
                lineTo(13.0f,14.0f)
                lineTo(15.0f,14.0f)
                lineTo(15.0f,20.0f)
                lineTo(13.0f,20.0f)
                lineTo(8.0f,20.0f)
                lineTo(6.0f,20.0f)
                lineTo(6.0f,14.0f)
                lineTo(8.0f,14.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,4.0f)
                lineTo(20.0f,4.0f)
                lineTo(22.0f,4.0f)
                lineTo(22.0f,10.0f)
                lineTo(20.0f,10.0f)
                lineTo(8.0f,10.0f)
                lineTo(6.0f,10.0f)
                lineTo(6.0f,4.0f)
                lineTo(8.0f,4.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(2.0f,22.0f)
            }
}

public val LucideIcons.All.AlignStartVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlignStartVertical: ImageVector
    @Composable get() = AlignStartVerticalDefinition.asImageVector()
