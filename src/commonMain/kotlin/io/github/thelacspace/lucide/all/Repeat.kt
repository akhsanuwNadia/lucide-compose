package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Repeat") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0f,2.0f)
                lineTo(21.0f,6.0f)
                lineTo(17.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,11.0f)
                lineTo(3.0f,10.0f)
                curveTo(3.0f,7.790861f,4.790861f,6.0f,7.0f,6.0f)
                lineTo(21.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,22.0f)
                lineTo(3.0f,18.0f)
                lineTo(7.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,13.0f)
                lineTo(21.0f,14.0f)
                curveTo(21.0f,16.209139f,19.209139f,18.0f,17.0f,18.0f)
                lineTo(3.0f,18.0f)
            }
}

public val LucideIcons.All.RepeatDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Repeat: ImageVector
    @Composable get() = RepeatDefinition.asImageVector()
