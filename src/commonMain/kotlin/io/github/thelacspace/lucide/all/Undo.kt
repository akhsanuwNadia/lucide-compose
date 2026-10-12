package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Undo") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,7.0)
                lineTo(3.0,13.0)
                lineTo(9.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,17.0)
                curveTo(21.0,12.029437065124512,16.970561981201172,8.0,12.0,8.0)
                curveTo(9.78512191772461,8.0022554397583,7.648853302001953,8.821158409118652,6.0,10.300000190734863)
                lineTo(3.0,13.0)
            }
}

public val LucideIcons.All.UndoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Undo: ImageVector
    @Composable get() = UndoDefinition.asImageVector()
