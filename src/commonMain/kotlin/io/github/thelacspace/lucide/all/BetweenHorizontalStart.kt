package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BetweenHorizontalStart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f,3.0f)
                lineTo(20.0f,3.0f)
                lineTo(21.0f,3.0f)
                lineTo(21.0f,10.0f)
                lineTo(20.0f,10.0f)
                lineTo(9.0f,10.0f)
                lineTo(8.0f,10.0f)
                lineTo(8.0f,3.0f)
                lineTo(9.0f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,9.0f)
                lineTo(5.0f,12.0f)
                lineTo(2.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,14.0f)
                lineTo(20.0f,14.0f)
                lineTo(21.0f,14.0f)
                lineTo(21.0f,21.0f)
                lineTo(20.0f,21.0f)
                lineTo(9.0f,21.0f)
                lineTo(8.0f,21.0f)
                lineTo(8.0f,14.0f)
                lineTo(9.0f,14.0f)
                close()
            }
}

public val LucideIcons.All.BetweenHorizontalStartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BetweenHorizontalStart: ImageVector
    @Composable get() = BetweenHorizontalStartDefinition.asImageVector()
