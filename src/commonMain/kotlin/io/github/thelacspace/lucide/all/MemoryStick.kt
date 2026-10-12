package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MemoryStick") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,12.0)
                lineTo(12.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,18.0)
                lineTo(12.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,12.0)
                lineTo(16.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,18.0)
                lineTo(16.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,11.0)
                lineTo(3.5,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,18.0)
                lineTo(20.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.5,11.0)
                lineTo(22.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,18.0)
                lineTo(4.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,12.0)
                lineTo(8.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,18.0)
                lineTo(8.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,6.0)
                lineTo(20.0,6.0)
                lineTo(22.0,6.0)
                lineTo(22.0,16.0)
                lineTo(20.0,16.0)
                lineTo(4.0,16.0)
                lineTo(2.0,16.0)
                lineTo(2.0,6.0)
                lineTo(4.0,6.0)
                close()
            }
}

public val LucideIcons.All.MemoryStickDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MemoryStick: ImageVector
    @Composable get() = MemoryStickDefinition.asImageVector()
