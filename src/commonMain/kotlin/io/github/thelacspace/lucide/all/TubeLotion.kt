package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TubeLotion") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15f, 18f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-3f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 1.6f, 3.2f)
                arcTo(8f, 8f, 0f, false, false, 17f, 10f)
                verticalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(9f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-6f)
                arcToRelative(8f, 8f, 0f, false, false, -1.6f, -4.8f)
                arcTo(2f, 2f, 0f, false, true, 7f, 2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 10f)
                arcToRelative(6.47f, 6.47f, 0f, false, true, 5f, 0f)
                arcToRelative(6.47f, 6.47f, 0f, false, false, 5f, 0f)
            }
}

public val LucideIcons.All.TubeLotionDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TubeLotion: ImageVector
    @Composable get() = TubeLotionDefinition.asImageVector()
