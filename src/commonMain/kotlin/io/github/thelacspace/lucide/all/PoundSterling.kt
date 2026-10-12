package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PoundSterling") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0f,7.0f)
                curveTo(18.0f,1.6669998f,10.0f,1.6669998f,10.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,7.0f)
                lineTo(10.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,21.0f)
                lineTo(18.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,13.0f)
                lineTo(16.0f,13.0f)
            }
}

public val LucideIcons.All.PoundSterlingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PoundSterling: ImageVector
    @Composable get() = PoundSterlingDefinition.asImageVector()
