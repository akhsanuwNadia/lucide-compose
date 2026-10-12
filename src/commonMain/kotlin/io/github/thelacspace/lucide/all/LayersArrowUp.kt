package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LayersArrowUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 12f)
                verticalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 17.002f)
                arcToRelative(1f, 1f, 0f, false, false, lf, 8.6f)
                arcToRelative(3.91f, af, 2f, false, false, 001.65f, 0f)
                lineToRelative(8.58f, -3.9f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.674f, 8.774f)
                lineTo(2.58f, 11.09f)
                arcToRelative(1f, 1f, 0f, false, true, lf, 8.6f)
                arcToRelative(3.91f, af, 2f, false, false, 001.65f, 0f)
                lineToRelative(8.58f, -3.9f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 5f)
                lineToRelative(3f, -3f)
                lineToRelative(3f, 3f)
            }
}

public val LucideIcons.All.LayersArrowUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LayersArrowUp: ImageVector
    @Composable get() = LayersArrowUpDefinition.asImageVector()
