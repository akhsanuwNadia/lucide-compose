package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MonitorPc") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,15.0f)
                lineTo(4.0f,15.0f)
                curveTo(2.8954306f,15.0f,2.0f,14.104569f,2.0f,13.0f)
                lineTo(2.0f,7.0f)
                curveTo(2.0f,5.8954306f,2.8954306f,5.0f,4.0f,5.0f)
                lineTo(10.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,19.0f)
                lineTo(5.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,11.0f)
                lineTo(22.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,7.0f)
                lineTo(22.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,17.0f)
                lineTo(18.01f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,19.0f)
                lineTo(9.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,3.0f)
                lineTo(21.0f,3.0f)
                lineTo(22.0f,3.0f)
                lineTo(22.0f,21.0f)
                lineTo(21.0f,21.0f)
                lineTo(15.0f,21.0f)
                lineTo(14.0f,21.0f)
                lineTo(14.0f,3.0f)
                lineTo(15.0f,3.0f)
                close()
            }
}

public val LucideIcons.All.MonitorPcDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MonitorPc: ImageVector
    @Composable get() = MonitorPcDefinition.asImageVector()
