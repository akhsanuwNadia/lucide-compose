package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareSparkles") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 15f)
                horizontalLineTo(7f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.41f, 2.49f)
                arcToRelative(.6f, .6f, 0f, false, false, lf, .63f)
                arcToRelative(3.334f, af, 1.2f, true, false, 00.956f, .955f)
                lineToRelative(3.334f, .631f)
                arcToRelative(.6f, .6f, 0f, false, true, lf, -3.334f)
                arcToRelative(.63f, af, 1.2f, true, false, 00f, -.955f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 13f)
                verticalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, true, false, 2f, Hf)
                arcToRelative(5f, af, 2f, false, false, 01f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 13f)
                verticalLineToRelative(4f)
            }
}

public val LucideIcons.All.SquareSparklesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareSparkles: ImageVector
    @Composable get() = SquareSparklesDefinition.asImageVector()
