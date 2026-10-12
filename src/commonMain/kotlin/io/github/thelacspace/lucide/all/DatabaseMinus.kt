package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DatabaseMinus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 15f)
                verticalLineTo(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 19f)
                horizontalLineToRelative(-6f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 12f)
                arcTo(9f, 3f, 0f, false, false, 21f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 5f)
                verticalLineTo(19f)
                arcTo(9f, 3f, 0f, false, false, 13.318f, 21.968f)
            }
}

public val LucideIcons.All.DatabaseMinusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DatabaseMinus: ImageVector
    @Composable get() = DatabaseMinusDefinition.asImageVector()
