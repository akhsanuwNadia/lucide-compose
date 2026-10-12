package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlignHorizontalJustifyEnd") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,5.0)
                lineTo(6.0,5.0)
                lineTo(8.0,5.0)
                lineTo(8.0,19.0)
                lineTo(6.0,19.0)
                lineTo(4.0,19.0)
                lineTo(2.0,19.0)
                lineTo(2.0,5.0)
                lineTo(4.0,5.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,7.0)
                lineTo(16.0,7.0)
                lineTo(18.0,7.0)
                lineTo(18.0,17.0)
                lineTo(16.0,17.0)
                lineTo(14.0,17.0)
                lineTo(12.0,17.0)
                lineTo(12.0,7.0)
                lineTo(14.0,7.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,2.0)
                lineTo(22.0,22.0)
            }
}

public val LucideIcons.All.AlignHorizontalJustifyEndDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlignHorizontalJustifyEnd: ImageVector
    @Composable get() = AlignHorizontalJustifyEndDefinition.asImageVector()
