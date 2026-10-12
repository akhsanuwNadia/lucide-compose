package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Tornado") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0f,4.0f)
                lineTo(3.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,8.0f)
                lineTo(6.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,12.0f)
                lineTo(9.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,16.0f)
                lineTo(10.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,20.0f)
                lineTo(9.0f,20.0f)
            }
}

public val LucideIcons.All.TornadoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Tornado: ImageVector
    @Composable get() = TornadoDefinition.asImageVector()
