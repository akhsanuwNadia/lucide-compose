package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShoppingBasket") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,11.0f)
                lineTo(14.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,11.0f)
                lineTo(15.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,11.0f)
                lineTo(22.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.5f,11.0f)
                lineTo(5.1f,18.4f)
                curveTo(5.292947f,19.346247f,6.134478f,20.019472f,7.1f,20.0f)
                lineTo(16.9f,20.0f)
                curveTo(17.86552f,20.019472f,18.707052f,19.346247f,18.9f,18.4f)
                lineTo(20.6f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.5f,15.5f)
                lineTo(19.5f,15.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,11.0f)
                lineTo(9.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,11.0f)
                lineTo(10.0f,20.0f)
            }
}

public val LucideIcons.All.ShoppingBasketDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShoppingBasket: ImageVector
    @Composable get() = ShoppingBasketDefinition.asImageVector()
