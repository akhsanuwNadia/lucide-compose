package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MailX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22f, 12.532f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8.792f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 7f)
                lineToRelative(-8.991f, 5.727f)
                arcToRelative(2f, 2f, 0f, false, true, -2.009f, 0f)
                lineTo(2f, 7f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.5f, 16.5f)
                lineToRelative(5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21.5f, 16.5f)
                lineToRelative(-5f, 5f)
            }
}

public val LucideIcons.All.MailXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MailX: ImageVector
    @Composable get() = MailXDefinition.asImageVector()
