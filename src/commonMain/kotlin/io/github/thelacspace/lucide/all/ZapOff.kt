package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZapOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.768f, 5.111f)
                lineTo(13.44f, 2.44f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, lf, -1.633f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(18.889f, 13.232f)
                lineToRelative(.672f, -.672f)
                arcTo(1.5f, 1.5f, 0f, false, false, hf, -2.844f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7.94f, 7.94f)
                lineToRelative(-3.5f, 3.499f)
                arcTo(1.5f, 1.5f, 0f, false, false, hf, 4.002f)
                arcToRelative(.5f, .5f, 0f, true, false, Lf, 8.086f)
                arcToRelative(20f, af, 1.5f, true, false, 002.475f, 1.56f)
                lineToRelative(5.5f, -5.5f)
            }
}

public val LucideIcons.All.ZapOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZapOff: ImageVector
    @Composable get() = ZapOffDefinition.asImageVector()
