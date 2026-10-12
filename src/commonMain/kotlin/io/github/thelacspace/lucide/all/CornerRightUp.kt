package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CornerRightUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,9.0)
                lineTo(15.0,4.0)
                lineTo(20.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,20.0)
                lineTo(11.0,20.0)
                curveTo(13.209138870239258,20.0,15.0,18.209138870239258,15.0,16.0)
                lineTo(15.0,4.0)
            }
}

public val LucideIcons.All.CornerRightUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CornerRightUp: ImageVector
    @Composable get() = CornerRightUpDefinition.asImageVector()
