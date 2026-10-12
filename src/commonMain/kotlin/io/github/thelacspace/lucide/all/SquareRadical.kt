package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareRadical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0f,12.0f)
                lineTo(9.0f,12.0f)
                lineTo(11.0f,17.0f)
                lineTo(13.0f,7.0f)
                lineTo(17.0f,7.0f)
            }
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
}

public val LucideIcons.All.SquareRadicalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareRadical: ImageVector
    @Composable get() = SquareRadicalDefinition.asImageVector()
