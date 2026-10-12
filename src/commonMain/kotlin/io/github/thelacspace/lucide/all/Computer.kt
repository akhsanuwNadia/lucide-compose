package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Computer") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,18.0f)
                lineTo(18.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,18.0f)
                lineTo(6.01f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,6.0f)
                lineTo(9.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,14.0f)
                lineTo(20.0f,14.0f)
                lineTo(22.0f,14.0f)
                lineTo(22.0f,22.0f)
                lineTo(20.0f,22.0f)
                lineTo(4.0f,22.0f)
                lineTo(2.0f,22.0f)
                lineTo(2.0f,14.0f)
                lineTo(4.0f,14.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,2.0f)
                lineTo(18.0f,2.0f)
                lineTo(20.0f,2.0f)
                lineTo(20.0f,14.0f)
                lineTo(18.0f,14.0f)
                lineTo(6.0f,14.0f)
                lineTo(4.0f,14.0f)
                lineTo(4.0f,2.0f)
                lineTo(6.0f,2.0f)
                close()
            }
}

public val LucideIcons.All.ComputerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Computer: ImageVector
    @Composable get() = ComputerDefinition.asImageVector()
