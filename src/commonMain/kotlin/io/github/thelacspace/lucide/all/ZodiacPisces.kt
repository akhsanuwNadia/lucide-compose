package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacPisces") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0,21.0)
                curveTo(15.0,15.666666984558105,15.0,8.333333015441895,19.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,12.0)
                lineTo(4.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,3.0)
                curveTo(9.0,8.333333015441895,9.0,15.666666984558105,5.0,21.0)
            }
}

public val LucideIcons.All.ZodiacPiscesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacPisces: ImageVector
    @Composable get() = ZodiacPiscesDefinition.asImageVector()
