package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UsbCPort") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6f, 12f)
                horizontalLineToRelative(12f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f, 8.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(4.0f, 0.0f, 0f, false, true, 4.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(4.0f, 0.0f, 0f, false, true, -4.0f, 0.0f)
                horizontalLineToRelative(-12.0f)
                arcToRelative(4.0f, 0.0f, 0f, false, true, -4.0f, -0.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(4.0f, 0.0f, 0f, false, true, 4.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.UsbCPortDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UsbCPort: ImageVector
    @Composable get() = UsbCPortDefinition.asImageVector()
