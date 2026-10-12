package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShoppingBasket") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,11.0)
                lineTo(14.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,11.0)
                lineTo(15.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,11.0)
                lineTo(22.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.5,11.0)
                lineTo(5.099999904632568,18.399999618530273)
                curveTo(5.292946815490723,19.34624671936035,6.1344780921936035,20.019472122192383,7.099999904632568,20.0)
                lineTo(16.899999618530273,20.0)
                curveTo(17.865520477294922,20.019472122192383,18.70705223083496,19.34624671936035,18.899999618530273,18.399999618530273)
                lineTo(20.600000381469727,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.5,15.5)
                lineTo(19.5,15.5)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,11.0)
                lineTo(9.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,11.0)
                lineTo(10.0,20.0)
            }
}

public val LucideIcons.All.ShoppingBasketDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShoppingBasket: ImageVector
    @Composable get() = ShoppingBasketDefinition.asImageVector()
