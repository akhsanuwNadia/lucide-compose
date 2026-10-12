package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MonitorPause") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,13.0)
                lineTo(10.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,13.0)
                lineTo(14.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,3.0)
                lineTo(20.0,3.0)
                lineTo(22.0,3.0)
                lineTo(22.0,17.0)
                lineTo(20.0,17.0)
                lineTo(4.0,17.0)
                lineTo(2.0,17.0)
                lineTo(2.0,3.0)
                lineTo(4.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,17.0)
                lineTo(12.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,21.0)
                lineTo(16.0,21.0)
            }
}

public val LucideIcons.All.MonitorPauseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MonitorPause: ImageVector
    @Composable get() = MonitorPauseDefinition.asImageVector()
