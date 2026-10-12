package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Asterisk") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 5f)
                verticalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(18.065f, 8.496f)
                lineToRelative(-12.125f, 7f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(5.94f, 8.504f)
                lineToRelative(12.125f, 7f)
            }
}

public val LucideIcons.All.AsteriskDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Asterisk: ImageVector
    @Composable get() = AsteriskDefinition.asImageVector()
