package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlignEndVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,4.0f)
                lineTo(16.0f,4.0f)
                lineTo(18.0f,4.0f)
                lineTo(18.0f,10.0f)
                lineTo(16.0f,10.0f)
                lineTo(4.0f,10.0f)
                lineTo(2.0f,10.0f)
                lineTo(2.0f,4.0f)
                lineTo(4.0f,4.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,14.0f)
                lineTo(16.0f,14.0f)
                lineTo(18.0f,14.0f)
                lineTo(18.0f,20.0f)
                lineTo(16.0f,20.0f)
                lineTo(11.0f,20.0f)
                lineTo(9.0f,20.0f)
                lineTo(9.0f,14.0f)
                lineTo(11.0f,14.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,22.0f)
                lineTo(22.0f,2.0f)
            }
}

public val LucideIcons.All.AlignEndVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlignEndVertical: ImageVector
    @Composable get() = AlignEndVerticalDefinition.asImageVector()
