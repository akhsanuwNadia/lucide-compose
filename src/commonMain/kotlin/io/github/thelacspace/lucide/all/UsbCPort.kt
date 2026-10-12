package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UsbCPort") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,12.0)
                lineTo(18.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,8.0)
                lineTo(18.0,8.0)
                lineTo(22.0,8.0)
                lineTo(22.0,16.0)
                lineTo(18.0,16.0)
                lineTo(6.0,16.0)
                lineTo(2.0,16.0)
                lineTo(2.0,8.0)
                lineTo(6.0,8.0)
                close()
            }
}

public val LucideIcons.All.UsbCPortDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UsbCPort: ImageVector
    @Composable get() = UsbCPortDefinition.asImageVector()
