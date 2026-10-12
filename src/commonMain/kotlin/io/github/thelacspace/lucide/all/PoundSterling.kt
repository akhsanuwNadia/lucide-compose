package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PoundSterling") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0,7.0)
                curveTo(18.0,1.6669998168945312,10.0,1.6669998168945312,10.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,7.0)
                lineTo(10.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,21.0)
                lineTo(18.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,13.0)
                lineTo(16.0,13.0)
            }
}

public val LucideIcons.All.PoundSterlingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PoundSterling: ImageVector
    @Composable get() = PoundSterlingDefinition.asImageVector()
