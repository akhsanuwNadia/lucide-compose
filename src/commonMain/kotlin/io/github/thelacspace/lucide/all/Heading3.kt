package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Heading3") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,12.0f)
                lineTo(12.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,18.0f)
                lineTo(4.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,18.0f)
                lineTo(12.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.5f,10.5f)
                curveTo(19.2f,9.5f,21.0f,10.5f,21.0f,12.0f)
                curveTo(21.0f,13.104569f,20.10457f,14.0f,19.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,17.5f)
                curveTo(19.0f,19.0f,21.0f,17.8f,21.0f,16.0f)
                curveTo(21.0f,14.895431f,20.10457f,14.0f,19.0f,14.0f)
            }
}

public val LucideIcons.All.Heading3Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Heading3: ImageVector
    @Composable get() = Heading3Definition.asImageVector()
