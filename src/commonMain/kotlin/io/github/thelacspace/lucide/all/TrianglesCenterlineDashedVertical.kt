package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TrianglesCenterlineDashedVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 14f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 20f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 8f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.288f, 16.703f)
                arcTo(1f, 1f, 0f, false, false, Vf, 8f)
                arcToRelative(1f, 1f, 0f, false, false, -.703f, lf)
                arcToRelative(-3.99f, 3.991f, af, true, true, 0f, 00f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.712f, 16.703f)
                arcTo(1f, 1f, 0f, false, false, Vf, 8f)
                arcToRelative(1f, 1f, 0f, false, false, lf, 3.99f)
                arcToRelative(3.991f, af, 1f, true, false, 01.001f, 1.424f)
                close()
            }
}

public val LucideIcons.All.TrianglesCenterlineDashedVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TrianglesCenterlineDashedVertical: ImageVector
    @Composable get() = TrianglesCenterlineDashedVerticalDefinition.asImageVector()
