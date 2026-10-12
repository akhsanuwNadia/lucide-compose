package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlignHorizontalSpaceBetween") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,5.0f)
                lineTo(7.0f,5.0f)
                lineTo(9.0f,5.0f)
                lineTo(9.0f,19.0f)
                lineTo(7.0f,19.0f)
                lineTo(5.0f,19.0f)
                lineTo(3.0f,19.0f)
                lineTo(3.0f,5.0f)
                lineTo(5.0f,5.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,7.0f)
                lineTo(19.0f,7.0f)
                lineTo(21.0f,7.0f)
                lineTo(21.0f,17.0f)
                lineTo(19.0f,17.0f)
                lineTo(17.0f,17.0f)
                lineTo(15.0f,17.0f)
                lineTo(15.0f,7.0f)
                lineTo(17.0f,7.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,2.0f)
                lineTo(3.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,2.0f)
                lineTo(21.0f,22.0f)
            }
}

public val LucideIcons.All.AlignHorizontalSpaceBetweenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlignHorizontalSpaceBetween: ImageVector
    @Composable get() = AlignHorizontalSpaceBetweenDefinition.asImageVector()
