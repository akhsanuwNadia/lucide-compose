package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MailWarning") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0f,10.5f)
                lineTo(22.0f,6.0f)
                curveTo(22.0f,4.8954306f,21.10457f,4.0f,20.0f,4.0f)
                lineTo(4.0f,4.0f)
                curveTo(2.8954306f,4.0f,2.0f,4.8954306f,2.0f,6.0f)
                lineTo(2.0f,18.0f)
                curveTo(2.0f,19.1f,2.9f,20.0f,4.0f,20.0f)
                lineTo(16.5f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,7.0f)
                lineTo(13.03f,12.7f)
                curveTo(12.400046f,13.094681f,11.599953f,13.094681f,10.969999f,12.7f)
                lineTo(2.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,14.0f)
                lineTo(20.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,22.0f)
                lineTo(20.0f,22.01f)
            }
}

public val LucideIcons.All.MailWarningDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MailWarning: ImageVector
    @Composable get() = MailWarningDefinition.asImageVector()
