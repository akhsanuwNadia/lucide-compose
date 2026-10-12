package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RotateCwClock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,7.0f)
                lineTo(12.0f,12.0f)
                lineTo(16.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,8.0f)
                lineTo(21.0f,8.0f)
                lineTo(21.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,8.0f)
                lineTo(18.7f,5.7f)
                curveTo(16.89757f,3.9709718f,14.497655f,3.0038416f,12.0f,3.0f)
                curveTo(7.029437f,3.0f,3.0f,7.029437f,3.0f,12.0f)
                curveTo(3.0f,16.970562f,7.029437f,21.0f,12.0f,21.0f)
                curveTo(16.970562f,21.0f,21.0f,16.970562f,21.0f,12.0f)
            }
}

public val LucideIcons.All.RotateCwClockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RotateCwClock: ImageVector
    @Composable get() = RotateCwClockDefinition.asImageVector()
