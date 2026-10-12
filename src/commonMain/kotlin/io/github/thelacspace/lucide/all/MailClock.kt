package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MailClock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 14f)
                verticalLineToRelative(2.2f)
                lineToRelative(1.6f, 1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 7f)
                lineToRelative(-.759f, .484f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.835f, 20f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, true, false, -2f, Vf)
                arcToRelative(6f, af, 2f, false, false, 012f, -2f)
                horizontalLineToRelative(16f)
                arcToRelative(2f, 2f, 0f, false, false, vf, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.605f, 10.567f)
                lineTo(2f, 7f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0f, true, false, 12.0f, 0f)
                arcToRelative(6.0f, 6.0f, 0f, true, false, -12.0f, 0f)
            }
}

public val LucideIcons.All.MailClockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MailClock: ImageVector
    @Composable get() = MailClockDefinition.asImageVector()
