package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BusFront") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,6.0)
                lineTo(2.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,6.0)
                lineTo(14.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,7.0)
                lineTo(20.0,6.0)
            }
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
                moveTo(8.0,15.0)
                lineTo(8.010000228881836,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,15.0)
                lineTo(16.010000228881836,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,19.0)
                lineTo(6.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,21.0)
                lineTo(18.0,19.0)
            }
}

public val LucideIcons.All.BusFrontDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BusFront: ImageVector
    @Composable get() = BusFrontDefinition.asImageVector()
