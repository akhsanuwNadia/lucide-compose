package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Share") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,6.0f)
                lineTo(12.0f,2.0f)
                lineTo(8.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,12.0f)
                lineTo(4.0f,20.0f)
                curveTo(4.0f,21.10457f,4.8954306f,22.0f,6.0f,22.0f)
                lineTo(18.0f,22.0f)
                curveTo(19.10457f,22.0f,20.0f,21.10457f,20.0f,20.0f)
                lineTo(20.0f,12.0f)
            }
}

public val LucideIcons.All.ShareDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Share: ImageVector
    @Composable get() = ShareDefinition.asImageVector()
