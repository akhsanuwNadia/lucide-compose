package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Dna") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,16.0)
                lineTo(11.5,17.5)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,8.0)
                lineTo(12.5,6.5)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,2.0)
                curveTo(13.20199966430664,3.998000144958496,12.482000350952148,5.994999885559082,12.192999839782715,7.993000030517578)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5,10.5)
                lineTo(17.5,11.5)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,6.0)
                lineTo(14.109000205993652,3.1089999675750732)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,15.0)
                curveTo(8.666999816894531,9.0,15.333000183105469,15.0,22.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,9.0)
                lineTo(20.891000747680664,9.890999794006348)
            }
            lucidePath(strokeWidth) {
                moveTo(3.1089999675750732,14.109000205993652)
                lineTo(4.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.5,12.5)
                lineTo(7.5,13.5)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,18.0)
                lineTo(9.890999794006348,20.891000747680664)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,22.0)
                curveTo(10.79800033569336,20.00200080871582,11.517999649047852,18.005001068115234,11.807000160217285,16.006999969482422)
            }
}

public val LucideIcons.All.DnaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Dna: ImageVector
    @Composable get() = DnaDefinition.asImageVector()
