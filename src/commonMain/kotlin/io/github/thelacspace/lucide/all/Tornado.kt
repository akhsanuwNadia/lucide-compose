package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Tornado") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0,4.0)
                lineTo(3.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,8.0)
                lineTo(6.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,12.0)
                lineTo(9.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,16.0)
                lineTo(10.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,20.0)
                lineTo(9.0,20.0)
            }
}

public val LucideIcons.All.TornadoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Tornado: ImageVector
    @Composable get() = TornadoDefinition.asImageVector()
