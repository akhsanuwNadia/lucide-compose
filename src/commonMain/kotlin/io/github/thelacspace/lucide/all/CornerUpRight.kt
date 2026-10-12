package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CornerUpRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,14.0f)
                lineTo(20.0f,9.0f)
                lineTo(15.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,20.0f)
                lineTo(4.0f,13.0f)
                curveTo(4.0f,10.790861f,5.790861f,9.0f,8.0f,9.0f)
                lineTo(20.0f,9.0f)
            }
}

public val LucideIcons.All.CornerUpRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CornerUpRight: ImageVector
    @Composable get() = CornerUpRightDefinition.asImageVector()
