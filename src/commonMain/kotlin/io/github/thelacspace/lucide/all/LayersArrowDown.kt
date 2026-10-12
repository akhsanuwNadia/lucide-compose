package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LayersArrowDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 7f)
                verticalLineToRelative(15f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                arcToRelative(1f, 1f, 0f, false, false, lf, 5.093f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 12f)
                arcToRelative(1f, 1f, 0f, true, false, .92f, lf)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 10.37f)
                lineTo(2.6f, 7.91f)
                arcToRelative(1f, 1f, 0f, false, false, lf, 8.57f)
                arcToRelative(-3.9f, af, 2f, false, false, 011.66f, .001f)
                lineToRelative(8.59f, 3.91f)
                arcToRelative(1f, 1f, 0f, false, true, lf, -5.392f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 19f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
            }
}

public val LucideIcons.All.LayersArrowDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LayersArrowDown: ImageVector
    @Composable get() = LayersArrowDownDefinition.asImageVector()
