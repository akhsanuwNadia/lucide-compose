package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Angle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 3f)
                verticalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 11f)
                arcToRelative(10f, 10f, 0f, false, true, 10f, 10f)
            }
}

public val LucideIcons.All.AngleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Angle: ImageVector
    @Composable get() = AngleDefinition.asImageVector()
