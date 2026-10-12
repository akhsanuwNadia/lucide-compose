package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CalendarOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 2f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 9f)
                horizontalLineToRelative(-5.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 9f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.586f, 3.586f)
                arcTo(2f, 2f, 0f, false, false, vf, 14f)
                arcToRelative(2f, 2f, 0f, false, false, hf, 14f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.656f, 3f)
                horizontalLineTo(19f)
                arcToRelative(2f, 2f, 0f, false, false, vf, 10.344f)
            }
}

public val LucideIcons.All.CalendarOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CalendarOff: ImageVector
    @Composable get() = CalendarOffDefinition.asImageVector()
