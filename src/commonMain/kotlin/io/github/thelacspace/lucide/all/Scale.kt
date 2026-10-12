package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Scale") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,3.0)
                lineTo(12.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,8.0)
                lineTo(22.0,16.0)
                curveTo(20.22222137451172,17.33333396911621,17.77777862548828,17.33333396911621,16.0,16.0)
                close()
                lineTo(19.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,7.0)
                lineTo(4.0,7.0)
                curveTo(6.790394306182861,7.0,9.537887573242188,6.313126564025879,12.0,5.0)
                curveTo(14.462112426757812,6.313126564025879,17.209606170654297,7.0,20.0,7.0)
                lineTo(21.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,8.0)
                lineTo(8.0,16.0)
                curveTo(6.222222328186035,17.33333396911621,3.777777671813965,17.33333396911621,2.0,16.0)
                close()
                lineTo(5.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,21.0)
                lineTo(17.0,21.0)
            }
}

public val LucideIcons.All.ScaleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Scale: ImageVector
    @Composable get() = ScaleDefinition.asImageVector()
