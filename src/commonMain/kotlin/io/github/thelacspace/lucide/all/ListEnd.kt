package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListEnd") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,5.0f)
                lineTo(3.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,12.0f)
                lineTo(3.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,19.0f)
                lineTo(3.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,16.0f)
                lineTo(13.0f,19.0f)
                lineTo(16.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,5.0f)
                lineTo(21.0f,17.0f)
                curveTo(21.0f,18.10457f,20.10457f,19.0f,19.0f,19.0f)
                lineTo(13.0f,19.0f)
            }
}

public val LucideIcons.All.ListEndDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListEnd: ImageVector
    @Composable get() = ListEndDefinition.asImageVector()
