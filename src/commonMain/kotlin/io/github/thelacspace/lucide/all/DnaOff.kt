package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DnaOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,2.0)
                curveTo(13.649999618530273,3.5,12.907999992370605,5.0,12.5,6.5)
                lineTo(14.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,6.0)
                lineTo(14.109000205993652,3.1089999675750732)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,15.0)
                curveTo(5.333000183105469,12.0,8.666999816894531,12.0,12.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,9.0)
                lineTo(20.891000747680664,9.890999794006348)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,9.0)
                curveTo(20.5,10.350000381469727,19.0,11.092000007629395,17.5,11.5)
                lineTo(16.5,10.5)
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
                curveTo(10.350000381469727,20.5,11.092000007629395,19.0,11.5,17.5)
                lineTo(10.0,16.0)
            }
}

public val LucideIcons.All.DnaOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DnaOff: ImageVector
    @Composable get() = DnaOffDefinition.asImageVector()
