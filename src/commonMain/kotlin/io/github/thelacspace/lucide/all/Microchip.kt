package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Microchip") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,12.0f)
                lineTo(14.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,17.0f)
                lineTo(14.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,7.0f)
                lineTo(14.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,12.0f)
                lineTo(20.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,18.0f)
                lineTo(20.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,6.0f)
                lineTo(20.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,12.0f)
                lineTo(6.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,18.0f)
                lineTo(6.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,6.0f)
                lineTo(6.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,2.0f)
                lineTo(16.0f,2.0f)
                lineTo(18.0f,2.0f)
                lineTo(18.0f,22.0f)
                lineTo(16.0f,22.0f)
                lineTo(8.0f,22.0f)
                lineTo(6.0f,22.0f)
                lineTo(6.0f,2.0f)
                lineTo(8.0f,2.0f)
                close()
            }
}

public val LucideIcons.All.MicrochipDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Microchip: ImageVector
    @Composable get() = MicrochipDefinition.asImageVector()
