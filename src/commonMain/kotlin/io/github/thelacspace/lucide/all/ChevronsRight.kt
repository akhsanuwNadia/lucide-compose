package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChevronsRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,17.0)
                lineTo(11.0,12.0)
                lineTo(6.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,17.0)
                lineTo(18.0,12.0)
                lineTo(13.0,7.0)
            }
}

public val LucideIcons.All.ChevronsRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChevronsRight: ImageVector
    @Composable get() = ChevronsRightDefinition.asImageVector()
