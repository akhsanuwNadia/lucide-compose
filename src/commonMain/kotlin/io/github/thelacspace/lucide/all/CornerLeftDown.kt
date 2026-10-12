package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CornerLeftDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,15.0)
                lineTo(9.0,20.0)
                lineTo(4.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,4.0)
                lineTo(13.0,4.0)
                curveTo(10.790861129760742,4.0,9.0,5.790861129760742,9.0,8.0)
                lineTo(9.0,20.0)
            }
}

public val LucideIcons.All.CornerLeftDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CornerLeftDown: ImageVector
    @Composable get() = CornerLeftDownDefinition.asImageVector()
