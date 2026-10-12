package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WrenchOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.747f, 5.093f)
                arcToRelative(6f, 6f, 0f, false, true, 6.841f, -2.882f)
                curveToRelative(.438f, .12f, .54f, .662f, .219f, .984f)
                lineTo(14.7f, 6.3f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.4f)
                lineToRelative(1.6f, 1.6f)
                arcToRelative(1f, 1f, 0f, false, false, 1.4f, 0f)
                lineToRelative(3.106f, -3.105f)
                curveToRelative(.32f, -.322f, .863f, -.22f, .983f, .218f)
                arcToRelative(6f, 6f, 0f, false, true, -2.882f, 6.842f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(13.5f, 13.5f)
                lineToRelative(-7.88f, 7.88f)
                arcToRelative(1f, 1f, 0f, false, true, -2.999f, -3f)
                lineToRelative(7.88f, -7.88f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
}

public val LucideIcons.All.WrenchOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WrenchOff: ImageVector
    @Composable get() = WrenchOffDefinition.asImageVector()
