package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Router") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,14.0)
                lineTo(20.0,14.0)
                lineTo(22.0,14.0)
                lineTo(22.0,22.0)
                lineTo(20.0,22.0)
                lineTo(4.0,22.0)
                lineTo(2.0,22.0)
                lineTo(2.0,14.0)
                lineTo(4.0,14.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.010000228881836,18.0)
                lineTo(6.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.010000228881836,18.0)
                lineTo(10.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,10.0)
                lineTo(15.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.84000015258789,7.170000076293945)
                curveTo(17.0897274017334,6.418891906738281,16.071638107299805,5.996853351593018,15.010000228881836,5.996853351593018)
                curveTo(13.948363304138184,5.996853351593018,12.930273056030273,6.418891906738281,12.180000305175781,7.170000076293945)
            }
            lucidePath(strokeWidth) {
                moveTo(20.65999984741211,4.340000152587891)
                curveTo(17.536230087280273,1.218277096748352,12.473769187927246,1.218277096748352,9.34999942779541,4.340000152587891)
            }
}

public val LucideIcons.All.RouterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Router: ImageVector
    @Composable get() = RouterDefinition.asImageVector()
