package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CornerUpLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0,20.0)
                lineTo(20.0,13.0)
                curveTo(20.0,10.790861129760742,18.209138870239258,9.0,16.0,9.0)
                lineTo(4.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,14.0)
                lineTo(4.0,9.0)
                lineTo(9.0,4.0)
            }
}

public val LucideIcons.All.CornerUpLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CornerUpLeft: ImageVector
    @Composable get() = CornerUpLeftDefinition.asImageVector()
