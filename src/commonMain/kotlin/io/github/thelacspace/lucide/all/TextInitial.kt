package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TextInitial") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,5.0f)
                lineTo(21.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,12.0f)
                lineTo(21.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,19.0f)
                lineTo(21.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,12.0f)
                lineTo(6.553f,4.276f)
                curveTo(6.6377807f,4.1068425f,6.810786f,4.0000334f,7.0f,4.0000334f)
                curveTo(7.189214f,4.0000334f,7.3622193f,4.1068425f,7.447f,4.276f)
                lineTo(11.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.92f,10.0f)
                lineTo(10.08f,10.0f)
            }
}

public val LucideIcons.All.TextInitialDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TextInitial: ImageVector
    @Composable get() = TextInitialDefinition.asImageVector()
