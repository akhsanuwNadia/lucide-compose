package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowDown01") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,16.0f)
                lineTo(7.0f,20.0f)
                lineTo(11.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,20.0f)
                lineTo(7.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,4.0f)
                lineTo(19.0f,4.0f)
                lineTo(19.0f,6.0f)
                lineTo(19.0f,8.0f)
                lineTo(19.0f,10.0f)
                lineTo(15.0f,10.0f)
                lineTo(15.0f,8.0f)
                lineTo(15.0f,6.0f)
                lineTo(15.0f,4.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,20.0f)
                lineTo(17.0f,14.0f)
                lineTo(15.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,20.0f)
                lineTo(19.0f,20.0f)
            }
}

public val LucideIcons.All.ArrowDown01Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowDown01: ImageVector
    @Composable get() = ArrowDown01Definition.asImageVector()
