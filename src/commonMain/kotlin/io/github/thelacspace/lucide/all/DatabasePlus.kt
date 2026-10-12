package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DatabasePlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19f, 16f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 12.536f)
                verticalLineTo(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 19f)
                horizontalLineToRelative(-6f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 12f)
                arcTo(9f, 3f, 0f, false, false, 15.1824f, 14.8061f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 5f)
                verticalLineTo(19f)
                arcTo(9f, 3f, 0f, false, false, 13.318f, 21.968f)
            }
}

public val LucideIcons.All.DatabasePlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DatabasePlus: ImageVector
    @Composable get() = DatabasePlusDefinition.asImageVector()
