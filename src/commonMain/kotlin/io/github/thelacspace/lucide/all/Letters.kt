package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Letters") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15f, 8f)
                horizontalLineTo(9f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 15.354f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 18f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, false, false, Hf, 3.5f)
                arcToRelative(.5f, .5f, 0f, true, false, -.5f, vf)
                arcToRelative(-7f, af, .5f, false, false, 01.5f, -.5f)
                horizontalLineTo(6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8f, 10f)
                lineToRelative(3.453f, -7.648f)
                arcToRelative(.6f, .6f, 0f, false, false, Lf, 16f)
            }
}

public val LucideIcons.All.LettersDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Letters: ImageVector
    @Composable get() = LettersDefinition.asImageVector()
