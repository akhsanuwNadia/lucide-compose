package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BangladeshiTaka") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,5.0)
                curveTo(6.004924297332764,3.8989217281341553,6.898910999298096,3.0089242458343506,8.0,3.0089242458343506)
                curveTo(9.101089477539062,3.0089242458343506,9.995076179504395,3.8989217281341553,10.0,5.0)
                lineTo(10.0,17.0)
                curveTo(10.009848594665527,19.20215606689453,11.797821998596191,20.98215103149414,14.0,20.98215103149414)
                curveTo(16.202178955078125,20.98215103149414,17.99015235900879,19.20215606689453,18.0,17.0)
                curveTo(17.995075225830078,15.898921966552734,17.101089477539062,15.00892448425293,16.0,15.00892448425293)
                curveTo(14.898910522460938,15.00892448425293,14.004923820495605,15.898921966552734,14.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,9.0)
                lineTo(18.0,9.0)
            }
}

public val LucideIcons.All.BangladeshiTakaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BangladeshiTaka: ImageVector
    @Composable get() = BangladeshiTakaDefinition.asImageVector()
