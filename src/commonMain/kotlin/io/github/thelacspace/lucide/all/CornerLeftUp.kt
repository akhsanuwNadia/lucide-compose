package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CornerLeftUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,9.0f)
                lineTo(9.0f,4.0f)
                lineTo(4.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,20.0f)
                lineTo(13.0f,20.0f)
                curveTo(10.790861f,20.0f,9.0f,18.209139f,9.0f,16.0f)
                lineTo(9.0f,4.0f)
            }
}

public val LucideIcons.All.CornerLeftUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CornerLeftUp: ImageVector
    @Composable get() = CornerLeftUpDefinition.asImageVector()
