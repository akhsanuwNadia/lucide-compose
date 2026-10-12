package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareArrowDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,3.0f)
                lineTo(19.0f,3.0f)
                lineTo(21.0f,3.0f)
                lineTo(21.0f,21.0f)
                lineTo(19.0f,21.0f)
                lineTo(5.0f,21.0f)
                lineTo(3.0f,21.0f)
                lineTo(3.0f,3.0f)
                lineTo(5.0f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,8.0f)
                lineTo(12.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,12.0f)
                lineTo(12.0f,16.0f)
                lineTo(16.0f,12.0f)
            }
}

public val LucideIcons.All.SquareArrowDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareArrowDown: ImageVector
    @Composable get() = SquareArrowDownDefinition.asImageVector()
