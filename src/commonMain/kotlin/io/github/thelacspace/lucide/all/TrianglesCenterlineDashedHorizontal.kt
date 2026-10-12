package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TrianglesCenterlineDashedHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 12f)
                horizontalLineTo(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 12f)
                horizontalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 12f)
                horizontalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 12f)
                horizontalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.298f, 20.288f)
                arcTo(1f, 1f, 0f, false, false, hf, 8f)
                arcToRelative(1f, 1f, 0f, false, false, lf, -3.991f)
                arcToRelative(-3.99f, af, 1f, true, false, 00f, -1.424f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.298f, 3.712f)
                arcTo(1f, 1f, 0f, false, false, hf, 8f)
                arcToRelative(1f, 1f, 0f, true, true, lf, -3.991f)
                arcToRelative(3.99f, af, 1f, true, false, 01f, -1.424f)
            }
}

public val LucideIcons.All.TrianglesCenterlineDashedHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TrianglesCenterlineDashedHorizontal: ImageVector
    @Composable get() = TrianglesCenterlineDashedHorizontalDefinition.asImageVector()
