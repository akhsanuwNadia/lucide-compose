package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Zap") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.914f, 4f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.561f, lf)
                arcToRelative(-9f, 9f, Af, true, true, 0f, 005.5f)
            }
}

public val LucideIcons.All.ZapDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Zap: ImageVector
    @Composable get() = ZapDefinition.asImageVector()
