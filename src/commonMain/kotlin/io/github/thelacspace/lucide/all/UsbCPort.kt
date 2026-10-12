package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UsbCPort") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,12.0f)
                lineTo(18.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,8.0f)
                lineTo(18.0f,8.0f)
                lineTo(22.0f,8.0f)
                lineTo(22.0f,16.0f)
                lineTo(18.0f,16.0f)
                lineTo(6.0f,16.0f)
                lineTo(2.0f,16.0f)
                lineTo(2.0f,8.0f)
                lineTo(6.0f,8.0f)
                close()
            }
}

public val LucideIcons.All.UsbCPortDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UsbCPort: ImageVector
    @Composable get() = UsbCPortDefinition.asImageVector()
