package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DoorOpen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 21f)
                horizontalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 3f)
                horizontalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, vf)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 12f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 21f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -1.974f, lf)
                arcToRelative(-6.163f, -1.013f, Af, true, true, 0f, 0010f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 21f)
                horizontalLineToRelative(-3f)
            }
}

public val LucideIcons.All.DoorOpenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DoorOpen: ImageVector
    @Composable get() = DoorOpenDefinition.asImageVector()
