package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PlayOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(10.215f, 4.56f)
                lineToRelative(9.79f, 5.71f)
                arcToRelative(2f, 2f, 0f, false, true, .003f, 3.458f)
                lineToRelative(-.393f, .23f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16.042f, 16.042f)
                lineToRelative(-8.034f, 4.686f)
                arcTo(2f, 2f, 0f, false, true, 5f, 19f)
                verticalLineTo(5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
}

public val LucideIcons.All.PlayOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PlayOff: ImageVector
    @Composable get() = PlayOffDefinition.asImageVector()
