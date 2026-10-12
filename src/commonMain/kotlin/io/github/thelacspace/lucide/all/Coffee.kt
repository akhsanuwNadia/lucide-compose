package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Coffee") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,2.0f)
                lineTo(10.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,2.0f)
                lineTo(14.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,8.0f)
                curveTo(16.552284f,8.0f,17.0f,8.447715f,17.0f,9.0f)
                lineTo(17.0f,17.0f)
                curveTo(17.0f,19.209139f,15.209139f,21.0f,13.0f,21.0f)
                lineTo(7.0f,21.0f)
                curveTo(4.790861f,21.0f,3.0f,19.209139f,3.0f,17.0f)
                lineTo(3.0f,9.0f)
                curveTo(3.0f,8.447715f,3.4477153f,8.0f,4.0f,8.0f)
                lineTo(18.0f,8.0f)
                curveTo(19.433323f,7.99359f,20.76052f,8.7545805f,21.47904f,9.994819f)
                curveTo(22.197557f,11.235056f,22.197557f,12.764944f,21.47904f,14.005181f)
                curveTo(20.76052f,15.2454195f,19.433323f,16.00641f,18.0f,16.0f)
                lineTo(17.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,2.0f)
                lineTo(6.0f,4.0f)
            }
}

public val LucideIcons.All.CoffeeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Coffee: ImageVector
    @Composable get() = CoffeeDefinition.asImageVector()
