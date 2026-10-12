package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LineDotTopVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 9f)
                verticalLineToRelative(12f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.LineDotTopVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LineDotTopVertical: ImageVector
    @Composable get() = LineDotTopVerticalDefinition.asImageVector()
