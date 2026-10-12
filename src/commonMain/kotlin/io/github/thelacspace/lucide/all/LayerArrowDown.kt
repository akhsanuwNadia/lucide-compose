package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LayerArrowDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,10.0)
                lineTo(12.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,10.0)
                curveTo(22.003131866455078,10.396520614624023,21.771677017211914,10.757433891296387,21.40999984741211,10.920000076293945)
                lineTo(16.33300018310547,13.22800064086914)
            }
            lucidePath(strokeWidth) {
                moveTo(22.017000198364258,10.005000114440918)
                curveTo(22.017316818237305,9.6082763671875,21.7830810546875,9.248879432678223,21.420000076293945,9.08899974822998)
                lineTo(12.829999923706055,5.178999900817871)
                curveTo(12.30264949798584,4.938841342926025,11.697060585021973,4.939206123352051,11.170000076293945,5.179999828338623)
                lineTo(2.5999999046325684,9.079999923706055)
                curveTo(2.235029458999634,9.235594749450684,1.9965623617172241,9.592241287231445,1.9922288656234741,9.988970756530762)
                curveTo(1.9878953695297241,10.385700225830078,2.218515157699585,10.74747085571289,2.5799999237060547,10.91100025177002)
                lineTo(7.672999858856201,13.22700023651123)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,17.0)
                lineTo(12.0,20.0)
                lineTo(15.0,17.0)
            }
}

public val LucideIcons.All.LayerArrowDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LayerArrowDown: ImageVector
    @Composable get() = LayerArrowDownDefinition.asImageVector()
