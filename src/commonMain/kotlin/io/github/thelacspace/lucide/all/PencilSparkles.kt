package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PencilSparkles") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 3f)
                horizontalLineTo(8f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15.007f, 5.008f)
                lineToRelative(3.987f, 3.986f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 15f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.174f, 6.813f)
                arcToRelative(2.82f, 2.82f, 0f, false, false, -3.986f, -3.987f)
                lineTo(3.842f, 16.175f)
                arcToRelative(2f, 2f, 0f, false, false, -.5f, .83f)
                lineToRelative(-1.321f, 4.352f)
                arcToRelative(.5f, .5f, 0f, false, false, .623f, .622f)
                lineToRelative(4.353f, -1.32f)
                arcToRelative(2f, 2f, 0f, false, false, .83f, -.497f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 17f)
                horizontalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 5f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 7f)
                horizontalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 2f)
                verticalLineToRelative(2f)
            }
}

public val LucideIcons.All.PencilSparklesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PencilSparkles: ImageVector
    @Composable get() = PencilSparklesDefinition.asImageVector()
