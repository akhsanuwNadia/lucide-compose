package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Toolbox") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 12f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 6f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, hf)
                arcToRelative(-4f, af, 2f, false, false, 00f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 6f)
                arcToRelative(2f, 2f, 0f, false, false, lf, 3f)
                arcToRelative(3f, Af, 2f, false, false, 0122f, 11f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, true, false, 2f, Hf)
                arcToRelative(4f, af, 2f, false, false, 01f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 14f)
                horizontalLineToRelative(20f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 12f)
                verticalLineToRelative(4f)
            }
}

public val LucideIcons.All.ToolboxDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Toolbox: ImageVector
    @Composable get() = ToolboxDefinition.asImageVector()
