package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MonitorStop") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,17.0f)
                lineTo(12.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,21.0f)
                lineTo(16.0f,21.0f)
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
                moveTo(10.0f,7.0f)
                lineTo(14.0f,7.0f)
                lineTo(15.0f,7.0f)
                lineTo(15.0f,13.0f)
                lineTo(14.0f,13.0f)
                lineTo(10.0f,13.0f)
                lineTo(9.0f,13.0f)
                lineTo(9.0f,7.0f)
                lineTo(10.0f,7.0f)
                close()
            }
}

public val LucideIcons.All.MonitorStopDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MonitorStop: ImageVector
    @Composable get() = MonitorStopDefinition.asImageVector()
