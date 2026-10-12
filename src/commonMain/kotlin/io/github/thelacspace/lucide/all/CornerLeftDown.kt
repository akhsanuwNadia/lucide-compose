package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CornerLeftDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,15.0f)
                lineTo(9.0f,20.0f)
                lineTo(4.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,4.0f)
                lineTo(13.0f,4.0f)
                curveTo(10.790861f,4.0f,9.0f,5.790861f,9.0f,8.0f)
                lineTo(9.0f,20.0f)
            }
}

public val LucideIcons.All.CornerLeftDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CornerLeftDown: ImageVector
    @Composable get() = CornerLeftDownDefinition.asImageVector()
