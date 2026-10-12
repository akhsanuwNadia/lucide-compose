package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlignVerticalJustifyEnd") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0f,12.0f)
                lineTo(17.0f,12.0f)
                lineTo(19.0f,12.0f)
                lineTo(19.0f,18.0f)
                lineTo(17.0f,18.0f)
                lineTo(7.0f,18.0f)
                lineTo(5.0f,18.0f)
                lineTo(5.0f,12.0f)
                lineTo(7.0f,12.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,2.0f)
                lineTo(15.0f,2.0f)
                lineTo(17.0f,2.0f)
                lineTo(17.0f,8.0f)
                lineTo(15.0f,8.0f)
                lineTo(9.0f,8.0f)
                lineTo(7.0f,8.0f)
                lineTo(7.0f,2.0f)
                lineTo(9.0f,2.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,22.0f)
                lineTo(22.0f,22.0f)
            }
}

public val LucideIcons.All.AlignVerticalJustifyEndDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlignVerticalJustifyEnd: ImageVector
    @Composable get() = AlignVerticalJustifyEndDefinition.asImageVector()
