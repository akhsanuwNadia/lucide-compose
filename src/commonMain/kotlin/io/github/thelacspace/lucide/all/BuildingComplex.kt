package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BuildingComplex") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,12.0)
                lineTo(14.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,8.0)
                lineTo(14.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,21.0)
                lineTo(14.0,18.0)
                curveTo(13.995076179504395,16.898921966552734,13.101089477539062,16.00892448425293,12.0,16.00892448425293)
                curveTo(10.898910522460938,16.00892448425293,10.004923820495605,16.898921966552734,10.0,18.0)
                lineTo(10.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,10.0)
                lineTo(4.0,10.0)
                curveTo(2.895430564880371,10.0,2.0,10.895430564880371,2.0,12.0)
                lineTo(2.0,19.0)
                curveTo(2.0,20.104570388793945,2.895430564880371,21.0,4.0,21.0)
                lineTo(20.0,21.0)
                curveTo(21.104570388793945,21.0,22.0,20.104570388793945,22.0,19.0)
                lineTo(22.0,9.0)
                curveTo(22.0,7.895430564880371,21.104570388793945,7.0,20.0,7.0)
                lineTo(18.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,21.0)
                lineTo(6.0,5.0)
                curveTo(6.0,3.895430564880371,6.895430564880371,3.0,8.0,3.0)
                lineTo(16.0,3.0)
                curveTo(17.104570388793945,3.0,18.0,3.895430564880371,18.0,5.0)
                lineTo(18.0,21.0)
            }
}

public val LucideIcons.All.BuildingComplexDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BuildingComplex: ImageVector
    @Composable get() = BuildingComplexDefinition.asImageVector()
