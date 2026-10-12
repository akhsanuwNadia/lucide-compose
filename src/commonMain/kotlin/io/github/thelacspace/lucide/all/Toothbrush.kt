package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Toothbrush") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15f, 11f)
                curveToRelative(-2f, 2f, -4f, 2f, -6f, 4f)
                lineToRelative(-7f, 7f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 4f)
                lineToRelative(-7.414f, 7.414f)
                lineToRelative(-2f, -2f)
                arcTo(2f, 2f, 0f, false, false, cf, 0f)
                arcTo(-.512f, .196f, -1.024f, false, false, Af, 2f)
            }
}

public val LucideIcons.All.ToothbrushDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Toothbrush: ImageVector
    @Composable get() = ToothbrushDefinition.asImageVector()
