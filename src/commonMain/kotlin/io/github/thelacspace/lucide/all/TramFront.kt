package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TramFront") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,3.0)
                lineTo(18.0,3.0)
                lineTo(20.0,3.0)
                lineTo(20.0,19.0)
                lineTo(18.0,19.0)
                lineTo(6.0,19.0)
                lineTo(4.0,19.0)
                lineTo(4.0,3.0)
                lineTo(6.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,11.0)
                lineTo(20.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,3.0)
                lineTo(12.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,19.0)
                lineTo(6.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,22.0)
                lineTo(16.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,15.0)
                lineTo(8.010000228881836,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,15.0)
                lineTo(16.010000228881836,15.0)
            }
}

public val LucideIcons.All.TramFrontDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TramFront: ImageVector
    @Composable get() = TramFrontDefinition.asImageVector()
