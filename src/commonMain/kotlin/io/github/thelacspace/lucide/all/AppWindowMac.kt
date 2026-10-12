package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AppWindowMac") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,4.0f)
                lineTo(20.0f,4.0f)
                lineTo(22.0f,4.0f)
                lineTo(22.0f,20.0f)
                lineTo(20.0f,20.0f)
                lineTo(4.0f,20.0f)
                lineTo(2.0f,20.0f)
                lineTo(2.0f,4.0f)
                lineTo(4.0f,4.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,8.0f)
                lineTo(6.01f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,8.0f)
                lineTo(10.01f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,8.0f)
                lineTo(14.01f,8.0f)
            }
}

public val LucideIcons.All.AppWindowMacDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AppWindowMac: ImageVector
    @Composable get() = AppWindowMacDefinition.asImageVector()
