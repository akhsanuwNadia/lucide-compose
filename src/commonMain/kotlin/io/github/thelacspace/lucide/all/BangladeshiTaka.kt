package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BangladeshiTaka") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6f, 5f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
                verticalLineToRelative(12f)
                arcToRelative(4f, 4f, 0f, false, false, 8f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -4f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 9f)
                horizontalLineToRelative(12f)
            }
}

public val LucideIcons.All.BangladeshiTakaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BangladeshiTaka: ImageVector
    @Composable get() = BangladeshiTakaDefinition.asImageVector()
