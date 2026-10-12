package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PlayingCardsFan") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.65f, 7.65f)
                arcToRelative(2f, 2f, 0f, false, false, lf, 5.51f)
                arcToRelative(2.374f, af, 2f, false, false, 011.046f, 2.628f)
                lineToRelative(-3.957f, 9.184f)
                arcToRelative(2f, 2f, 0f, true, false, 1.046f, lf)
                arcToRelative(-5.51f, -2.374f, af, false, false, 0f, 01f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 7.777f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, hf)
                arcToRelative(-6f, af, 2f, false, false, 00f, -2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(8f, 4.389f)
                lineToRelative(-4.364f, .809f)
                arcToRelative(2f, 2f, 0f, false, false, 2.33f, lf)
                arcToRelative(1.822f, 9.833f, af, false, false, 0f, 002.331f)
            }
}

public val LucideIcons.All.PlayingCardsFanDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PlayingCardsFan: ImageVector
    @Composable get() = PlayingCardsFanDefinition.asImageVector()
