package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Engine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 3f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(13f, 3f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 10f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 13f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 16f)
                arcToRelative(2f, 2f, 0f, false, false, hf, 1f)
                arcToRelative(2f, 2f, 0f, false, false, lf, .3f)
                arcToRelative(.4f, af, 2f, false, false, 001.6f, .8f)
                horizontalLineToRelative(2.264f)
                arcToRelative(2f, 2f, 0f, true, false, lf, 1.67f)
                arcToRelative(-3.341f, af, 1f, true, false, 01.895f, -.553f)
                horizontalLineTo(21f)
                arcToRelative(1f, 1f, 0f, true, false, vf, -4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, hf)
                arcToRelative(-3.5f, af, 1f, true, false, 01f, -.8f)
            }
}

public val LucideIcons.All.EngineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Engine: ImageVector
    @Composable get() = EngineDefinition.asImageVector()
