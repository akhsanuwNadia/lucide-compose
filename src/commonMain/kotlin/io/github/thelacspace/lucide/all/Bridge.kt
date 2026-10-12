package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bridge") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 9.728f)
                verticalLineTo(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 9.728f)
                verticalLineTo(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 20f)
                verticalLineTo(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 11f)
                lineToRelative(-4f, -4f)
                arcTo(7.5f, 7.5f, 0f, false, true, 6f, 7f)
                lineToRelative(-4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 16f)
                horizontalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 20f)
                verticalLineTo(4f)
            }
}

public val LucideIcons.All.BridgeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bridge: ImageVector
    @Composable get() = BridgeDefinition.asImageVector()
