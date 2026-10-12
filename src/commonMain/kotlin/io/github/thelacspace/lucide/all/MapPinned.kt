package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MapPinned") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18f, 8f)
                curveToRelative(0f, 3.613f, -3.869f, 7.429f, -5.393f, 8.795f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, Cf)
                arcToRelative(9.87f, 15.429f, 6f, false, false, 8f, af)
            }
            lucidePath(strokeWidth) {
                moveTo(4.474f, 15f)
                horizontalLineToRelative(-.197f)
                arcToRelative(1f, 1f, 0f, false, false, .753f, lf)
                arcToRelative(-1.097f, 4.35f, af, true, true, 0f, 001.444f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f, 8.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.MapPinnedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MapPinned: ImageVector
    @Composable get() = MapPinnedDefinition.asImageVector()
