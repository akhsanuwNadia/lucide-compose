package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("KeyboardOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0f,4.0f)
                curveTo(21.10457f,4.0f,22.0f,4.8954306f,22.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,6.0f)
                lineTo(22.0f,16.41f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,16.0f)
                lineTo(16.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.69f,4.0f)
                lineTo(20.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,8.0f)
                lineTo(14.01f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,8.0f)
                lineTo(18.01f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,20.0f)
                lineTo(4.0f,20.0f)
                curveTo(2.8954306f,20.0f,2.0f,19.10457f,2.0f,18.0f)
                lineTo(2.0f,6.0f)
                curveTo(2.0f,4.8954306f,2.8954306f,4.0f,4.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,8.0f)
                lineTo(6.01f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,12.0f)
                lineTo(8.01f,12.0f)
            }
}

public val LucideIcons.All.KeyboardOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.KeyboardOff: ImageVector
    @Composable get() = KeyboardOffDefinition.asImageVector()
