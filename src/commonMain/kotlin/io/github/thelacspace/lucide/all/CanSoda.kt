package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CanSoda") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(17f, 22f)
                lineToRelative(1.664f, -2.496f)
                arcToRelative(2f, 2f, 0f, false, false, Vf, 5.606f)
                arcToRelative(2f, 2f, 0f, false, false, -1.11f, Lf)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 22f)
                horizontalLineTo(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 2f)
                horizontalLineTo(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 17f)
                horizontalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 7f)
                horizontalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7f, 22f)
                lineToRelative(-1.664f, -2.496f)
                arcTo(2f, 2f, 0f, false, false, Vf, 5.606f)
                arcToRelative(2f, 2f, 0f, true, false, Lf, 7f)
            }
}

public val LucideIcons.All.CanSodaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CanSoda: ImageVector
    @Composable get() = CanSodaDefinition.asImageVector()
