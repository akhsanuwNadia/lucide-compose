package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SavePen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.33f, 13f)
                horizontalLineTo(8f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, vf)
            }
            lucidePath(strokeWidth) {
                moveTo(14.363f, 17.634f)
                arcToRelative(2f, 2f, 0f, false, false, .854f, lf)
                arcToRelative(-.837f, 2.87f, af, false, false, 0f, 00.62f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 3f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, true, true, hf, 7f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 21f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, true, false, -2f, Vf)
                arcToRelative(5f, af, 2f, false, false, 012f, -2f)
                horizontalLineToRelative(10.2f)
                arcToRelative(2f, 2f, 0f, false, false, lf, 3.8f)
                arcToRelative(3.8f, af, 2f, false, false, 01.6f, 1.4f)
                verticalLineToRelative(.3f)
            }
}

public val LucideIcons.All.SavePenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SavePen: ImageVector
    @Composable get() = SavePenDefinition.asImageVector()
