package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CalendarHeart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.127f, 21f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, true, false, -2f, Vf)
                arcToRelative(5f, af, 2f, false, false, 012f, -2f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, false, vf, 5.125f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.62f, 17.8f)
                arcTo(2.25f, 2.25f, 0f, false, false, af, 2.25f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 2f)
                verticalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 9f)
                horizontalLineToRelative(18f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 2f)
                verticalLineToRelative(3f)
            }
}

public val LucideIcons.All.CalendarHeartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CalendarHeart: ImageVector
    @Composable get() = CalendarHeartDefinition.asImageVector()
