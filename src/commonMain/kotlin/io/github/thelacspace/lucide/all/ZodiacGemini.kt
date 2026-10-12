package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacGemini") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,4.525000095367432)
                lineTo(16.0,19.472999572753906)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,3.0)
                curveTo(15.0,5.666666507720947,9.0,5.666666507720947,4.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,21.0)
                curveTo(9.0,18.33333396911621,15.0,18.33333396911621,20.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,4.525000095367432)
                lineTo(8.0,19.472999572753906)
            }
}

public val LucideIcons.All.ZodiacGeminiDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacGemini: ImageVector
    @Composable get() = ZodiacGeminiDefinition.asImageVector()
