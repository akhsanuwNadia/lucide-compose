package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClefAlto") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 4f)
                verticalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 4.764f)
                arcToRelative(3f, 3f, 0f, true, true, -.152f, 4.327f)
                arcTo(4f, 4f, 0f, false, true, 10f, 12f)
                arcToRelative(4f, 4f, 0f, false, true, 3.848f, 2.909f)
                arcTo(3f, 3f, 0f, true, true, 14f, 19.236f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 4f)
                verticalLineToRelative(16f)
            }
}

public val LucideIcons.All.ClefAltoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClefAlto: ImageVector
    @Composable get() = ClefAltoDefinition.asImageVector()
