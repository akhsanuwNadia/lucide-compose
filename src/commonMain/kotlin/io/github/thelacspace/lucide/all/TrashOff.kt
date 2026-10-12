package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TrashOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 11f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 17f)
                verticalLineToRelative(-3f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 6f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, hf)
                arcToRelative(-4f, af, 2f, false, false, 00f, -1.576f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 6f)
                verticalLineToRelative(7.344f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 6f)
                horizontalLineToRelative(-9.344f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 6f)
                horizontalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 6f)
                verticalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, hf, 10f)
                arcToRelative(2f, 2f, 0f, false, false, vf, -1f)
            }
}

public val LucideIcons.All.TrashOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TrashOff: ImageVector
    @Composable get() = TrashOffDefinition.asImageVector()
