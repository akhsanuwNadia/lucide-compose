package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Wine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0f,22.0f)
                lineTo(16.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,10.0f)
                lineTo(17.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,15.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,15.0f)
                curveTo(14.761424f,15.0f,17.0f,12.761424f,17.0f,10.0f)
                curveTo(17.0f,8.0f,16.5f,6.0f,15.0f,2.0f)
                lineTo(9.0f,2.0f)
                curveTo(7.5f,6.0f,7.0f,8.0f,7.0f,10.0f)
                curveTo(7.0f,12.761424f,9.238576f,15.0f,12.0f,15.0f)
                close()
            }
}

public val LucideIcons.All.WineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Wine: ImageVector
    @Composable get() = WineDefinition.asImageVector()
