package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GlobeCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(15f, 6f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                horizontalLineToRelative(20f)
                arcTo(10f, 10f, 0f, true, true, 12f, 2f)
                arcToRelative(14.5f, 14.5f, 0f, false, false, 0f, 20f)
                arcToRelative(14.5f, 14.5f, 0f, false, false, 4f, -10f)
            }
}

public val LucideIcons.All.GlobeCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GlobeCheck: ImageVector
    @Composable get() = GlobeCheckDefinition.asImageVector()
