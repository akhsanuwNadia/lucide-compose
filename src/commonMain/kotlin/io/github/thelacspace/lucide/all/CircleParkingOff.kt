package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleParkingOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.656000137329102,7.0)
                lineTo(13.0,7.0)
                curveTo(13.849029541015625,7.000071048736572,14.658270835876465,7.359893798828125,15.227051734924316,7.990242004394531)
                curveTo(15.795832633972168,8.620590209960938,16.070884704589844,9.462428092956543,15.984000205993652,10.307000160217285)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,13.0)
                lineTo(9.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.070999145507812,19.070999145507812)
                curveTo(15.161004066467285,22.946176528930664,8.854174613952637,22.93207550048828,4.961549282073975,19.03944969177246)
                curveTo(1.068924069404602,15.14682388305664,1.0548216104507446,8.839994430541992,4.929999828338623,4.929999828338623)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.357000350952148,2.687000036239624)
                curveTo(12.05666446685791,1.239622712135315,16.262239456176758,2.119502067565918,19.071369171142578,4.92863130569458)
                curveTo(21.8804988861084,7.737760543823242,22.760377883911133,11.943336486816406,21.312999725341797,15.643000602722168)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,17.0)
                lineTo(9.0,9.0)
            }
}

public val LucideIcons.All.CircleParkingOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleParkingOff: ImageVector
    @Composable get() = CircleParkingOffDefinition.asImageVector()
