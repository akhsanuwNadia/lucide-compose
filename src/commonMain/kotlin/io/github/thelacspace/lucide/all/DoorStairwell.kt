package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DoorStairwell") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 17f)
                verticalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, false, false, hf, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 17f)
                horizontalLineToRelative(-9f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, vf)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 21f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, Hf)
                arcToRelative(7f, af, 2f, false, false, 00f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 9f)
                horizontalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, vf)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 21f)
                horizontalLineTo(2f)
            }
}

public val LucideIcons.All.DoorStairwellDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DoorStairwell: ImageVector
    @Composable get() = DoorStairwellDefinition.asImageVector()
