package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Proportions") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,4.0f)
                lineTo(20.0f,4.0f)
                lineTo(22.0f,4.0f)
                lineTo(22.0f,20.0f)
                lineTo(20.0f,20.0f)
                lineTo(4.0f,20.0f)
                lineTo(2.0f,20.0f)
                lineTo(2.0f,4.0f)
                lineTo(4.0f,4.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,9.0f)
                lineTo(12.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,9.0f)
                lineTo(15.0f,9.0f)
                curveTo(16.10457f,9.0f,17.0f,9.895431f,17.0f,11.0f)
                lineTo(17.0f,20.0f)
            }
}

public val LucideIcons.All.ProportionsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Proportions: ImageVector
    @Composable get() = ProportionsDefinition.asImageVector()
