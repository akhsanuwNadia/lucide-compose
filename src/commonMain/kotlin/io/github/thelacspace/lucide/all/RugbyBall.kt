package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RugbyBall") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(10f, 10f)
                lineToRelative(4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(13f, 7f)
                lineToRelative(4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.34f, 2.138f)
                arcTo(15f, 15f, 0f, false, false, cf, -.357f)
                arcTo(2.94f, .004f, 4.919f, false, false, .798f, .8f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 7f)
                lineTo(7f, 17f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7f, 13f)
                lineToRelative(4f, 4f)
            }
}

public val LucideIcons.All.RugbyBallDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RugbyBall: ImageVector
    @Composable get() = RugbyBallDefinition.asImageVector()
