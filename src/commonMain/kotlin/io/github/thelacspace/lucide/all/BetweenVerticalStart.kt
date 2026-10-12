package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BetweenVerticalStart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,8.0f)
                lineTo(9.0f,8.0f)
                lineTo(10.0f,8.0f)
                lineTo(10.0f,21.0f)
                lineTo(9.0f,21.0f)
                lineTo(4.0f,21.0f)
                lineTo(3.0f,21.0f)
                lineTo(3.0f,8.0f)
                lineTo(4.0f,8.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,2.0f)
                lineTo(12.0f,5.0f)
                lineTo(9.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,8.0f)
                lineTo(20.0f,8.0f)
                lineTo(21.0f,8.0f)
                lineTo(21.0f,21.0f)
                lineTo(20.0f,21.0f)
                lineTo(15.0f,21.0f)
                lineTo(14.0f,21.0f)
                lineTo(14.0f,8.0f)
                lineTo(15.0f,8.0f)
                close()
            }
}

public val LucideIcons.All.BetweenVerticalStartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BetweenVerticalStart: ImageVector
    @Composable get() = BetweenVerticalStartDefinition.asImageVector()
