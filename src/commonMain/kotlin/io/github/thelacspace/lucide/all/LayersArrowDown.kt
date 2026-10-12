package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LayersArrowDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,7.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                curveTo(1.9990335702896118,12.390570640563965,2.225545883178711,12.74596118927002,2.5799999237060547,12.90999984741211)
                lineTo(7.672999858856201,15.22599983215332)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,12.0)
                curveTo(22.003131866455078,12.396520614624023,21.771677017211914,12.757433891296387,21.40999984741211,12.920000076293945)
                lineTo(16.33300018310547,15.22800064086914)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,10.369999885559082)
                lineTo(2.5999999046325684,7.909999847412109)
                curveTo(2.2368175983428955,7.750398635864258,2.0023181438446045,7.391203880310059,2.0023181438446045,6.994500160217285)
                curveTo(2.0023181438446045,6.5977959632873535,2.2368175983428955,6.238601207733154,2.5999999046325684,6.078999996185303)
                lineTo(11.170000076293945,2.178999900817871)
                curveTo(11.69735050201416,1.9388412237167358,12.302939414978027,1.9392060041427612,12.829999923706055,2.179999828338623)
                lineTo(21.420000076293945,6.090000152587891)
                curveTo(21.78318214416504,6.249601364135742,22.017681121826172,6.608796119689941,22.017681121826172,7.005499839782715)
                curveTo(22.017681121826172,7.4022040367126465,21.78318214416504,7.761398792266846,21.420000076293945,7.921000003814697)
                lineTo(16.027999877929688,10.371000289916992)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,19.0)
                lineTo(12.0,22.0)
                lineTo(15.0,19.0)
            }
}

public val LucideIcons.All.LayersArrowDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LayersArrowDown: ImageVector
    @Composable get() = LayersArrowDownDefinition.asImageVector()
