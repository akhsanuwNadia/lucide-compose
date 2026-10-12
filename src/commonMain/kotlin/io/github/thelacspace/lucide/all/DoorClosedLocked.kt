package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DoorClosedLocked") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19f, 8f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, Hf)
                arcToRelative(7f, af, 2f, false, false, 00f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 21f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 16f)
                verticalLineToRelative(-2f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, vf)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 12f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 16.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, -1.0f, -0.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 0.0f, 0f, false, true, 1.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.DoorClosedLockedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DoorClosedLocked: ImageVector
    @Composable get() = DoorClosedLockedDefinition.asImageVector()
