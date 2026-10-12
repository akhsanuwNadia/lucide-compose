package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Binary") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,14.0f)
                lineTo(16.0f,14.0f)
                lineTo(18.0f,14.0f)
                lineTo(18.0f,20.0f)
                lineTo(16.0f,20.0f)
                lineTo(16.0f,20.0f)
                lineTo(14.0f,20.0f)
                lineTo(14.0f,14.0f)
                lineTo(16.0f,14.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,4.0f)
                lineTo(8.0f,4.0f)
                lineTo(10.0f,4.0f)
                lineTo(10.0f,10.0f)
                lineTo(8.0f,10.0f)
                lineTo(8.0f,10.0f)
                lineTo(6.0f,10.0f)
                lineTo(6.0f,4.0f)
                lineTo(8.0f,4.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,20.0f)
                lineTo(10.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,10.0f)
                lineTo(18.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,14.0f)
                lineTo(8.0f,14.0f)
                lineTo(8.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,4.0f)
                lineTo(16.0f,4.0f)
                lineTo(16.0f,10.0f)
            }
}

public val LucideIcons.All.BinaryDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Binary: ImageVector
    @Composable get() = BinaryDefinition.asImageVector()
