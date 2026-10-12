package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MailDot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.674f, 4f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-4.675f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 7f)
                lineToRelative(9f, 5.701f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 0f)
                lineToRelative(1.084f, -.686f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.MailDotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MailDot: ImageVector
    @Composable get() = MailDotDefinition.asImageVector()
