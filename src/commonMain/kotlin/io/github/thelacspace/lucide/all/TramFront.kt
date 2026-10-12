package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TramFront") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,3.0f)
                lineTo(18.0f,3.0f)
                lineTo(20.0f,3.0f)
                lineTo(20.0f,19.0f)
                lineTo(18.0f,19.0f)
                lineTo(6.0f,19.0f)
                lineTo(4.0f,19.0f)
                lineTo(4.0f,3.0f)
                lineTo(6.0f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,11.0f)
                lineTo(20.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,3.0f)
                lineTo(12.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,19.0f)
                lineTo(6.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,22.0f)
                lineTo(16.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,15.0f)
                lineTo(8.01f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,15.0f)
                lineTo(16.01f,15.0f)
            }
}

public val LucideIcons.All.TramFrontDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TramFront: ImageVector
    @Composable get() = TramFrontDefinition.asImageVector()
