package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlignHorizontalJustifyCenter") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,5.0f)
                lineTo(6.0f,5.0f)
                lineTo(8.0f,5.0f)
                lineTo(8.0f,19.0f)
                lineTo(6.0f,19.0f)
                lineTo(4.0f,19.0f)
                lineTo(2.0f,19.0f)
                lineTo(2.0f,5.0f)
                lineTo(4.0f,5.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,7.0f)
                lineTo(20.0f,7.0f)
                lineTo(22.0f,7.0f)
                lineTo(22.0f,17.0f)
                lineTo(20.0f,17.0f)
                lineTo(18.0f,17.0f)
                lineTo(16.0f,17.0f)
                lineTo(16.0f,7.0f)
                lineTo(18.0f,7.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,22.0f)
            }
}

public val LucideIcons.All.AlignHorizontalJustifyCenterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlignHorizontalJustifyCenter: ImageVector
    @Composable get() = AlignHorizontalJustifyCenterDefinition.asImageVector()
