package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MonitorOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,17.0f)
                lineTo(12.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,17.0f)
                lineTo(4.0f,17.0f)
                curveTo(2.8954306f,17.0f,2.0f,16.10457f,2.0f,15.0f)
                lineTo(2.0f,5.0f)
                curveTo(1.9999858f,4.211087f,2.463737f,3.4958763f,3.184f,3.174f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,21.0f)
                lineTo(16.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.656f,3.0f)
                lineTo(20.0f,3.0f)
                curveTo(21.10457f,3.0f,22.0f,3.8954306f,22.0f,5.0f)
                lineTo(22.0f,15.0f)
                curveTo(21.999966f,15.367662f,21.898586f,15.7282f,21.707f,16.042f)
            }
}

public val LucideIcons.All.MonitorOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MonitorOff: ImageVector
    @Composable get() = MonitorOffDefinition.asImageVector()
