package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Binary") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,14.0)
                lineTo(16.0,14.0)
                lineTo(18.0,14.0)
                lineTo(18.0,20.0)
                lineTo(16.0,20.0)
                lineTo(16.0,20.0)
                lineTo(14.0,20.0)
                lineTo(14.0,14.0)
                lineTo(16.0,14.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,4.0)
                lineTo(8.0,4.0)
                lineTo(10.0,4.0)
                lineTo(10.0,10.0)
                lineTo(8.0,10.0)
                lineTo(8.0,10.0)
                lineTo(6.0,10.0)
                lineTo(6.0,4.0)
                lineTo(8.0,4.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,20.0)
                lineTo(10.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,10.0)
                lineTo(18.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,14.0)
                lineTo(8.0,14.0)
                lineTo(8.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,4.0)
                lineTo(16.0,4.0)
                lineTo(16.0,10.0)
            }
}

public val LucideIcons.All.BinaryDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Binary: ImageVector
    @Composable get() = BinaryDefinition.asImageVector()
