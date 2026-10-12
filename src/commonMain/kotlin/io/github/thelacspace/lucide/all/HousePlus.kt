package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HousePlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.350000381469727,21.0)
                lineTo(5.0,21.0)
                curveTo(3.895430564880371,21.0,3.0,20.104570388793945,3.0,19.0)
                lineTo(3.0,10.0)
                curveTo(2.9995181560516357,9.41026496887207,3.2593345642089844,8.85037899017334,3.7100000381469727,8.470000267028809)
                lineTo(10.710000038146973,2.4700002670288086)
                curveTo(11.45504379272461,1.841153860092163,12.54495620727539,1.841153860092163,13.289999961853027,2.4700002670288086)
                lineTo(20.290000915527344,8.470000267028809)
                curveTo(20.740665435791016,8.85037899017334,21.0004825592041,9.41026496887207,21.0,10.0)
                lineTo(21.0,12.350000381469727)
            }
            lucidePath(strokeWidth) {
                moveTo(14.800000190734863,12.399999618530273)
                curveTo(14.611145973205566,12.148194313049316,14.314757347106934,12.0,14.0,12.0)
                lineTo(10.0,12.0)
                curveTo(9.447714805603027,12.0,9.0,12.447714805603027,9.0,13.0)
                lineTo(9.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,18.0)
                lineTo(21.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,15.0)
                lineTo(18.0,21.0)
            }
}

public val LucideIcons.All.HousePlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HousePlus: ImageVector
    @Composable get() = HousePlusDefinition.asImageVector()
