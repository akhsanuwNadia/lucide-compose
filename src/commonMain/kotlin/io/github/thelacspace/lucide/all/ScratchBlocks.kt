package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ScratchBlocks") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19f, 5f)
                arcToRelative(2f, 2f, 0f, false, false, vf, 11f)
                arcToRelative(2f, 2f, 0f, true, false, 2f, hf)
                arcToRelative(-5.586f, af, 1f, true, false, 00f, -.707f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 12f)
                horizontalLineToRelative(-7.586f)
                arcToRelative(1f, 1f, 0f, false, false, .293f, lf)
                arcToRelative(-1.414f, 1.414f, af, true, true, 0f, 01f)
            }
}

public val LucideIcons.All.ScratchBlocksDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ScratchBlocks: ImageVector
    @Composable get() = ScratchBlocksDefinition.asImageVector()
