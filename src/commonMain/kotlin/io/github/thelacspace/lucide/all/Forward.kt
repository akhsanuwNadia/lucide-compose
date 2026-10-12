package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Forward") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,17.0f)
                lineTo(20.0f,12.0f)
                lineTo(15.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,18.0f)
                lineTo(4.0f,16.0f)
                curveTo(4.0f,13.790861f,5.790861f,12.0f,8.0f,12.0f)
                lineTo(20.0f,12.0f)
            }
}

public val LucideIcons.All.ForwardDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Forward: ImageVector
    @Composable get() = ForwardDefinition.asImageVector()
