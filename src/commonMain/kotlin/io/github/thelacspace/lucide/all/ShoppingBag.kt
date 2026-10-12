package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShoppingBag") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,10.0f)
                curveTo(15.990151f,12.202156f,14.202178f,13.982151f,12.0f,13.982151f)
                curveTo(9.797822f,13.982151f,8.009849f,12.202156f,8.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.103f,6.034f)
                lineTo(20.897001f,6.034f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.4f,5.467f)
                curveTo(3.1403558f,5.8131924f,3.0f,6.2342596f,3.0f,6.667f)
                lineTo(3.0f,20.0f)
                curveTo(3.0f,21.10457f,3.8954306f,22.0f,5.0f,22.0f)
                lineTo(19.0f,22.0f)
                curveTo(20.10457f,22.0f,21.0f,21.10457f,21.0f,20.0f)
                lineTo(21.0f,6.667f)
                curveTo(21.0f,6.2342596f,20.859644f,5.8131924f,20.6f,5.467f)
                lineTo(18.6f,2.8f)
                curveTo(18.222292f,2.2963881f,17.629515f,1.9999999f,17.0f,2.0f)
                lineTo(7.0f,2.0f)
                curveTo(6.3704853f,2.0f,5.777709f,2.2963884f,5.4f,2.8f)
                close()
            }
}

public val LucideIcons.All.ShoppingBagDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShoppingBag: ImageVector
    @Composable get() = ShoppingBagDefinition.asImageVector()
