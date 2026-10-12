package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Dome") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 21f)
                verticalLineToRelative(-3f)
                arcToRelative(2f, 2f, 0f, false, false, vf, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 12f)
                verticalLineToRelative(9f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 19f)
                arcToRelative(2f, 2f, 0f, true, false, 2f, Hf)
                arcToRelative(4f, af, 2f, false, false, 01f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 12f)
                verticalLineToRelative(9f)
            }
}

public val LucideIcons.All.DomeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Dome: ImageVector
    @Composable get() = DomeDefinition.asImageVector()
