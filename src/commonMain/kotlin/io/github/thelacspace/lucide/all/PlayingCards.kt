package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PlayingCards") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.832f, 8.445f)
                arcToRelative(1f, 1f, 0f, false, false, -.098f, lf)
                arcToRelative(-2.075f, 3.098f, af, true, true, 0f, 000f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7.18f, 20.827f)
                lineToRelative(-5f, -11f)
                arcToRelative(2f, 2f, 0f, true, false, Lf, 7f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-20.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.PlayingCardsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PlayingCards: ImageVector
    @Composable get() = PlayingCardsDefinition.asImageVector()
