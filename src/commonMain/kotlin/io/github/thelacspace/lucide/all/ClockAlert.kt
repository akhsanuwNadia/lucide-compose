package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClockAlert") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,6.0)
                lineTo(12.0,12.0)
                lineTo(16.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,12.0)
                lineTo(20.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,21.0)
                lineTo(20.010000228881836,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.25,8.199999809265137)
                curveTo(19.707096099853516,4.4391937255859375,16.041160583496094,1.9866021871566772,11.97617244720459,1.9956058263778687)
                curveTo(7.9111833572387695,2.0046095848083496,4.256147861480713,4.473416328430176,2.72991943359375,8.241020202636719)
                curveTo(1.2036908864974976,12.008624076843262,2.110016345977783,16.325204849243164,5.022677898406982,19.160802841186523)
                curveTo(7.935339450836182,21.996400833129883,12.274664878845215,22.78668212890625,16.0,21.15999984741211)
            }
}

public val LucideIcons.All.ClockAlertDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClockAlert: ImageVector
    @Composable get() = ClockAlertDefinition.asImageVector()
