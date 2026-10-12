package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Phi") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(20f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f, 12.0f)
                arcToRelative(7.0f, 7.0f, 0f, true, false, 14.0f, 0f)
                arcToRelative(7.0f, 7.0f, 0f, true, false, -14.0f, 0f)
            }
}

public val LucideIcons.All.PhiDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Phi: ImageVector
    @Composable get() = PhiDefinition.asImageVector()
