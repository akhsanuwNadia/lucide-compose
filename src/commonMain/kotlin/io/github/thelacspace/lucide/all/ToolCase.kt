package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ToolCase") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 15f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14.5f, 4.058f)
                lineToRelative(.571f, -1.429f)
                arcToRelative(1f, 1f, 0f, false, false, lf, 5f)
                arcToRelative(2f, af, 1f, true, false, 01.549f, .534f)
                arcToRelative(.88f, .88f, 0f, true, false, lf, -2.332f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.634f, 11f)
                arcToRelative(2f, 2f, 0f, false, false, -.34f, lf)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 12.006f)
                arcTo(1f, 1f, 0f, false, false, Hf, 19f)
                arcToRelative(1f, 1f, 0f, false, true, vf, 7f)
                arcToRelative(2f, 2f, 0f, true, false, 2f, Hf)
                arcToRelative(6f, af, 2f, false, false, 01f, -2f)
            }
}

public val LucideIcons.All.ToolCaseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ToolCase: ImageVector
    @Composable get() = ToolCaseDefinition.asImageVector()
