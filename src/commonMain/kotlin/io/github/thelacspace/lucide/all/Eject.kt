package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Eject") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4f, 13f)
                arcToRelative(1f, 1f, 0f, false, true, -.72f, -1.695f)
                lineToRelative(7.257f, -7.668f)
                arcToRelative(2f, 2f, 0f, false, true, 2.926f, 0f)
                lineToRelative(7.256f, 7.668f)
                arcTo(1f, 1f, 0f, false, true, 20f, 13f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f, 17.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-16.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.EjectDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Eject: ImageVector
    @Composable get() = EjectDefinition.asImageVector()
