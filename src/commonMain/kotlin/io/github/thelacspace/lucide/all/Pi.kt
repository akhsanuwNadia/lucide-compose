package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Pi") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f,4.0f)
                lineTo(9.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,7.0f)
                curveTo(4.0f,5.3f,5.3f,4.0f,7.0f,4.0f)
                lineTo(20.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,20.0f)
                curveTo(16.3f,20.0f,15.0f,18.7f,15.0f,17.0f)
                lineTo(15.0f,4.0f)
            }
}

public val LucideIcons.All.PiDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Pi: ImageVector
    @Composable get() = PiDefinition.asImageVector()
