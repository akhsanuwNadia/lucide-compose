package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DatabaseX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(17f, 17f)
                lineToRelative(5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.323f, 13.744f)
                arcTo(9f, 3f, 0f, false, false, 21f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 13.127f)
                verticalLineTo(5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 17f)
                lineToRelative(-5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 12f)
                arcTo(9f, 3f, 0f, false, false, 13.563f, 14.954f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 5f)
                verticalLineTo(19f)
                arcTo(9f, 3f, 0f, false, false, 13f, 21.981f)
            }
}

public val LucideIcons.All.DatabaseXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DatabaseX: ImageVector
    @Composable get() = DatabaseXDefinition.asImageVector()
