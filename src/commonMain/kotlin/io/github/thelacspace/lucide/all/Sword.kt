package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Sword") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,19.0)
                lineTo(5.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,21.0)
                lineTo(3.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,16.0)
                lineTo(4.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.5,17.5)
                lineTo(20.413999557495117,6.585999965667725)
                curveTo(20.789098739624023,6.211014747619629,20.999887466430664,5.702389717102051,21.0,5.171999931335449)
                lineTo(21.0,3.0)
                lineTo(18.827999114990234,3.0)
                curveTo(18.297609329223633,3.0001134872436523,17.788984298706055,3.2109012603759766,17.413999557495117,3.5859999656677246)
                lineTo(6.5,14.5)
            }
}

public val LucideIcons.All.SwordDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Sword: ImageVector
    @Composable get() = SwordDefinition.asImageVector()
