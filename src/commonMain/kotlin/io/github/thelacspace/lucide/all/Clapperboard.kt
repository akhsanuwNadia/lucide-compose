package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Clapperboard") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.295999526977539,3.4639999866485596)
                lineTo(15.315999984741211,7.420000076293945)
            }
            lucidePath(strokeWidth) {
                moveTo(20.200000762939453,6.0)
                lineTo(3.0,11.0)
                lineTo(2.0999999046325684,8.600000381469727)
                curveTo(1.7999999523162842,7.500000476837158,2.3999998569488525,6.40000057220459,3.3999998569488525,6.100000381469727)
                lineTo(16.899999618530273,2.1000003814697266)
                curveTo(18.0,1.8000004291534424,19.100000381469727,2.4000003337860107,19.399999618530273,3.4000003337860107)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,11.0)
                lineTo(21.0,11.0)
                lineTo(21.0,19.0)
                curveTo(21.0,20.104570388793945,20.104570388793945,21.0,19.0,21.0)
                lineTo(5.0,21.0)
                curveTo(3.895430564880371,21.0,3.0,20.104570388793945,3.0,19.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.179999828338623,5.276000022888184)
                lineTo(9.279999732971191,9.175000190734863)
            }
}

public val LucideIcons.All.ClapperboardDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Clapperboard: ImageVector
    @Composable get() = ClapperboardDefinition.asImageVector()
