package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EqualApproximatelyNot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5f, 15f)
                arcToRelative(6.5f, 6.5f, 0f, false, true, 7f, 0f)
                arcToRelative(6.5f, 6.5f, 0f, false, false, 7f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 9f)
                arcToRelative(6.5f, 6.5f, 0f, false, true, 7f, 0f)
                arcToRelative(6.5f, 6.5f, 0f, false, false, 7f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 5f)
                lineTo(5f, 19f)
            }
}

public val LucideIcons.All.EqualApproximatelyNotDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EqualApproximatelyNot: ImageVector
    @Composable get() = EqualApproximatelyNotDefinition.asImageVector()
