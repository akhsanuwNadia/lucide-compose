package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShoppingCart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(2.05f, 2.05f)
                lineToRelative(1.099f, -.028f)
                arcToRelative(1f, 1f, 0f, false, true, 1.008f, .815f)
                lineToRelative(2.69f, 14.347f)
                arcTo(1f, 1f, 0f, false, false, 7.83f, 18f)
                horizontalLineTo(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.563f, 5f)
                horizontalLineToRelative(16.435f)
                arcToRelative(1f, 1f, 0f, false, true, .981f, 1.204f)
                lineToRelative(-1.026f, 6.226f)
                arcTo(2f, 2f, 0f, false, true, 18.962f, 14f)
                horizontalLineTo(6.25f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.ShoppingCartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShoppingCart: ImageVector
    @Composable get() = ShoppingCartDefinition.asImageVector()
