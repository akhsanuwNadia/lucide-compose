package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Redo") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0,7.0)
                lineTo(21.0,13.0)
                lineTo(15.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,17.0)
                curveTo(3.0,12.029437065124512,7.029437065124512,8.0,12.0,8.0)
                curveTo(14.21487808227539,8.0022554397583,16.351146697998047,8.821158409118652,18.0,10.300000190734863)
                lineTo(21.0,13.0)
            }
}

public val LucideIcons.All.RedoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Redo: ImageVector
    @Composable get() = RedoDefinition.asImageVector()
