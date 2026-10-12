package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Salad") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.496f, 12f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, Af, 2f)
                arcToRelative(2f, 0f, 0020.32f, false, false, 2f, 0f)
                arcToRelative(0019f, 3f, af, false, false, 0f, 00f)
                arcToRelative(-1.5f, .68f, 2f, false, false, 00f, -3.287f)
                arcToRelative(.424f, 2.5f, 2.5f, false, false, -3.189f, 2.06f)
                arcTo(3f, 3f, 0f, false, false, lf, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 12f)
                arcToRelative(1f, 1f, 0f, false, false, 1.133f, Af)
                arcToRelative(9f, 9f, 0f, false, false, af, 9f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 21f)
                horizontalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.85f, 6.907f)
            }
}

public val LucideIcons.All.SaladDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Salad: ImageVector
    @Composable get() = SaladDefinition.asImageVector()
