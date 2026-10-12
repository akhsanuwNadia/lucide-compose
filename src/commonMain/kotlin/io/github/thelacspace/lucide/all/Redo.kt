package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Redo") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0f,7.0f)
                lineTo(21.0f,13.0f)
                lineTo(15.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,17.0f)
                curveTo(3.0f,12.029437f,7.029437f,8.0f,12.0f,8.0f)
                curveTo(14.214878f,8.002255f,16.351147f,8.821158f,18.0f,10.3f)
                lineTo(21.0f,13.0f)
            }
}

public val LucideIcons.All.RedoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Redo: ImageVector
    @Composable get() = RedoDefinition.asImageVector()
