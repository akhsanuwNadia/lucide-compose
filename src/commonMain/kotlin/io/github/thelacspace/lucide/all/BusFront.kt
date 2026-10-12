package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BusFront") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,6.0f)
                lineTo(2.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,6.0f)
                lineTo(14.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,7.0f)
                lineTo(20.0f,6.0f)
            }
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
                moveTo(8.0f,15.0f)
                lineTo(8.01f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,15.0f)
                lineTo(16.01f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,19.0f)
                lineTo(6.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,21.0f)
                lineTo(18.0f,19.0f)
            }
}

public val LucideIcons.All.BusFrontDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BusFront: ImageVector
    @Composable get() = BusFrontDefinition.asImageVector()
