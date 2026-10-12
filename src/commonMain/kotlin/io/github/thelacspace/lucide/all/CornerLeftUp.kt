package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CornerLeftUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,9.0)
                lineTo(9.0,4.0)
                lineTo(4.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,20.0)
                lineTo(13.0,20.0)
                curveTo(10.790861129760742,20.0,9.0,18.209138870239258,9.0,16.0)
                lineTo(9.0,4.0)
            }
}

public val LucideIcons.All.CornerLeftUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CornerLeftUp: ImageVector
    @Composable get() = CornerLeftUpDefinition.asImageVector()
