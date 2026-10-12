package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArmenianDram") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 10f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(11f, 14f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 20f)
                verticalLineTo(10f)
                arcToRelative(6f, 6f, 0f, false, false, -12f, 0f)
            }
}

public val LucideIcons.All.ArmenianDramDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArmenianDram: ImageVector
    @Composable get() = ArmenianDramDefinition.asImageVector()
