package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShoppingCartPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 5f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 2f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2.05f, 2.05f)
                lineToRelative(1.099f, -.028f)
                arcToRelative(1f, 1f, 0f, false, false, lf, 2.69f)
                arcToRelative(14.347f, Af, 1f, true, false, 007.83f, 18f)
                horizontalLineTo(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.564f, 5f)
                horizontalLineTo(12f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.25f, 14f)
                horizontalLineToRelative(12.712f)
                arcToRelative(2f, 2f, 0f, true, false, lf, .172f)
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

public val LucideIcons.All.ShoppingCartPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShoppingCartPlus: ImageVector
    @Composable get() = ShoppingCartPlusDefinition.asImageVector()
