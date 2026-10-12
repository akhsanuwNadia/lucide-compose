package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BuildingComplexPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,12.0)
                lineTo(14.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,21.0)
                lineTo(10.0,18.0)
                curveTo(10.00007438659668,17.27509307861328,10.392394065856934,16.60697364807129,11.025409698486328,16.25372886657715)
                curveTo(11.658426284790039,15.90048599243164,12.433030128479004,15.917424201965332,13.050000190734863,16.29800033569336)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,8.0)
                lineTo(14.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,19.0)
                lineTo(22.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,7.0)
                lineTo(20.0,7.0)
                curveTo(21.104570388793945,7.0,22.0,7.895430564880371,22.0,9.0)
                lineTo(22.0,13.354999542236328)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,16.0)
                lineTo(19.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,10.0)
                lineTo(4.0,10.0)
                curveTo(2.895430564880371,10.0,2.0,10.895430564880371,2.0,12.0)
                lineTo(2.0,19.0)
                curveTo(2.0,20.104570388793945,2.895430564880371,21.0,4.0,21.0)
                lineTo(12.53499984741211,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,21.0)
                lineTo(6.0,5.0)
                curveTo(6.0,3.895430564880371,6.895430564880371,3.0,8.0,3.0)
                lineTo(16.0,3.0)
                curveTo(17.104570388793945,3.0,18.0,3.895430564880371,18.0,5.0)
                lineTo(18.0,12.125999450683594)
            }
}

public val LucideIcons.All.BuildingComplexPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BuildingComplexPlus: ImageVector
    @Composable get() = BuildingComplexPlusDefinition.asImageVector()
