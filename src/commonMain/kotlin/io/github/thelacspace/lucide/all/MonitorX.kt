package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MonitorX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.5f,12.5f)
                lineTo(9.5f,7.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.5f,12.5f)
                lineTo(14.5f,7.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,3.0f)
                lineTo(20.0f,3.0f)
                lineTo(22.0f,3.0f)
                lineTo(22.0f,17.0f)
                lineTo(20.0f,17.0f)
                lineTo(4.0f,17.0f)
                lineTo(2.0f,17.0f)
                lineTo(2.0f,3.0f)
                lineTo(4.0f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,17.0f)
                lineTo(12.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,21.0f)
                lineTo(16.0f,21.0f)
            }
}

public val LucideIcons.All.MonitorXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MonitorX: ImageVector
    @Composable get() = MonitorXDefinition.asImageVector()
