package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Whistle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 6f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 6f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-5.675f)
                arcTo(7f, 7f, 0f, true, true, 9f, 6f)
                close()
            }
}

public val LucideIcons.All.WhistleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Whistle: ImageVector
    @Composable get() = WhistleDefinition.asImageVector()
