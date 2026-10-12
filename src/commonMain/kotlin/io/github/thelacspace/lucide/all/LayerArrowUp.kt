package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LayerArrowUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 14f)
                verticalLineTo(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.674f, 10.774f)
                lineTo(2.58f, 13.09f)
                arcToRelative(1f, 1f, 0f, false, true, lf, 8.6f)
                arcToRelative(3.91f, af, 2f, false, false, 001.65f, 0f)
                lineToRelative(8.58f, -3.9f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 7f)
                lineToRelative(3f, -3f)
                lineToRelative(3f, 3f)
            }
}

public val LucideIcons.All.LayerArrowUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LayerArrowUp: ImageVector
    @Composable get() = LayerArrowUpDefinition.asImageVector()
