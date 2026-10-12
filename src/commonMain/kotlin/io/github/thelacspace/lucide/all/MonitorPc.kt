package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MonitorPc") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,15.0)
                lineTo(4.0,15.0)
                curveTo(2.895430564880371,15.0,2.0,14.104569435119629,2.0,13.0)
                lineTo(2.0,7.0)
                curveTo(2.0,5.895430564880371,2.895430564880371,5.0,4.0,5.0)
                lineTo(10.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,19.0)
                lineTo(5.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,11.0)
                lineTo(22.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,7.0)
                lineTo(22.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,17.0)
                lineTo(18.010000228881836,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,19.0)
                lineTo(9.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,3.0)
                lineTo(21.0,3.0)
                lineTo(22.0,3.0)
                lineTo(22.0,21.0)
                lineTo(21.0,21.0)
                lineTo(15.0,21.0)
                lineTo(14.0,21.0)
                lineTo(14.0,3.0)
                lineTo(15.0,3.0)
                close()
            }
}

public val LucideIcons.All.MonitorPcDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MonitorPc: ImageVector
    @Composable get() = MonitorPcDefinition.asImageVector()
