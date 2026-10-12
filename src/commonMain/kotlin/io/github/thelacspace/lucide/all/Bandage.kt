package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bandage") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,10.01f)
                lineTo(10.01f,10.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,14.01f)
                lineTo(10.01f,14.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,10.01f)
                lineTo(14.01f,10.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,14.01f)
                lineTo(14.01f,14.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,6.0f)
                lineTo(18.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,6.0f)
                lineTo(6.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,6.0f)
                lineTo(20.0f,6.0f)
                lineTo(22.0f,6.0f)
                lineTo(22.0f,18.0f)
                lineTo(20.0f,18.0f)
                lineTo(4.0f,18.0f)
                lineTo(2.0f,18.0f)
                lineTo(2.0f,6.0f)
                lineTo(4.0f,6.0f)
                close()
            }
}

public val LucideIcons.All.BandageDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bandage: ImageVector
    @Composable get() = BandageDefinition.asImageVector()
