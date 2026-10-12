package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CornerUpRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,14.0)
                lineTo(20.0,9.0)
                lineTo(15.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,20.0)
                lineTo(4.0,13.0)
                curveTo(4.0,10.790861129760742,5.790861129760742,9.0,8.0,9.0)
                lineTo(20.0,9.0)
            }
}

public val LucideIcons.All.CornerUpRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CornerUpRight: ImageVector
    @Composable get() = CornerUpRightDefinition.asImageVector()
