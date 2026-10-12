package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HdmiPort") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22f, 9f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, Hf)
                arcToRelative(3f, af, 1f, true, false, 00f, -1f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 12f)
                horizontalLineToRelative(8f)
            }
}

public val LucideIcons.All.HdmiPortDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HdmiPort: ImageVector
    @Composable get() = HdmiPortDefinition.asImageVector()
