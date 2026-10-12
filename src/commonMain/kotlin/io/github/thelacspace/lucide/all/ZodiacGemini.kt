package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacGemini") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,4.525f)
                lineTo(16.0f,19.473f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,3.0f)
                curveTo(15.0f,5.6666665f,9.0f,5.6666665f,4.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,21.0f)
                curveTo(9.0f,18.333334f,15.0f,18.333334f,20.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,4.525f)
                lineTo(8.0f,19.473f)
            }
}

public val LucideIcons.All.ZodiacGeminiDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacGemini: ImageVector
    @Composable get() = ZodiacGeminiDefinition.asImageVector()
