package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TimerOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,2.0f)
                lineTo(14.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.6f,11.0f)
                curveTo(3.3613052f,13.977566f,4.031568f,17.407736f,6.3f,19.7f)
                curveTo(8.592265f,21.968433f,12.022434f,22.638697f,15.0f,21.400002f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.4f,7.4f)
                curveTo(10.615701f,5.16888f,14.973537f,5.591971f,17.7f,8.4f)
                curveTo(20.42161f,11.137565f,20.800192f,15.428157f,18.6f,18.599998f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,12.0f)
                lineTo(12.0f,10.0f)
            }
}

public val LucideIcons.All.TimerOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TimerOff: ImageVector
    @Composable get() = TimerOffDefinition.asImageVector()
