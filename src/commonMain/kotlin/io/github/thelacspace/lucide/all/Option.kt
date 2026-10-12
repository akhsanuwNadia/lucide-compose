package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Option") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 3f)
                horizontalLineToRelative(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 3f)
                horizontalLineToRelative(5.28f)
                arcToRelative(1f, 1f, 0f, false, true, .948f, .684f)
                lineToRelative(5.544f, 16.632f)
                arcToRelative(1f, 1f, 0f, false, false, .949f, .684f)
                horizontalLineTo(21f)
            }
}

public val LucideIcons.All.OptionDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Option: ImageVector
    @Composable get() = OptionDefinition.asImageVector()
