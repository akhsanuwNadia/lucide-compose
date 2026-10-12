package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Microchip") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,12.0)
                lineTo(14.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,17.0)
                lineTo(14.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,7.0)
                lineTo(14.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,12.0)
                lineTo(20.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,18.0)
                lineTo(20.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,6.0)
                lineTo(20.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,12.0)
                lineTo(6.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,18.0)
                lineTo(6.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,6.0)
                lineTo(6.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,2.0)
                lineTo(16.0,2.0)
                lineTo(18.0,2.0)
                lineTo(18.0,22.0)
                lineTo(16.0,22.0)
                lineTo(8.0,22.0)
                lineTo(6.0,22.0)
                lineTo(6.0,2.0)
                lineTo(8.0,2.0)
                close()
            }
}

public val LucideIcons.All.MicrochipDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Microchip: ImageVector
    @Composable get() = MicrochipDefinition.asImageVector()
