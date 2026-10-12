package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CornerDownRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,10.0)
                lineTo(20.0,15.0)
                lineTo(15.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,4.0)
                lineTo(4.0,11.0)
                curveTo(4.0,13.209138870239258,5.790861129760742,15.0,8.0,15.0)
                lineTo(20.0,15.0)
            }
}

public val LucideIcons.All.CornerDownRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CornerDownRight: ImageVector
    @Composable get() = CornerDownRightDefinition.asImageVector()
