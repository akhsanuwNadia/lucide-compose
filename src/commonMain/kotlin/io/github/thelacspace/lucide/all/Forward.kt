package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Forward") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,17.0)
                lineTo(20.0,12.0)
                lineTo(15.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,18.0)
                lineTo(4.0,16.0)
                curveTo(4.0,13.790861129760742,5.790861129760742,12.0,8.0,12.0)
                lineTo(20.0,12.0)
            }
}

public val LucideIcons.All.ForwardDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Forward: ImageVector
    @Composable get() = ForwardDefinition.asImageVector()
