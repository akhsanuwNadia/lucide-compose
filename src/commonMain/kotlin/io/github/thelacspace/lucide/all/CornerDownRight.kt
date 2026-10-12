package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CornerDownRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,10.0f)
                lineTo(20.0f,15.0f)
                lineTo(15.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,4.0f)
                lineTo(4.0f,11.0f)
                curveTo(4.0f,13.209139f,5.790861f,15.0f,8.0f,15.0f)
                lineTo(20.0f,15.0f)
            }
}

public val LucideIcons.All.CornerDownRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CornerDownRight: ImageVector
    @Composable get() = CornerDownRightDefinition.asImageVector()
