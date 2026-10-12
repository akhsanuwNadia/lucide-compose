package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Park") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 18f)
                horizontalLineToRelative(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.248f, 9.998f)
                arcTo(4.5f, 4.5f, 0f, false, false, 11.75f, 8.6f)
                verticalLineTo(8f)
                arcToRelative(1f, 1f, 0f, false, false, -7.5f, 0f)
                arcToRelative(4.9f, 4.9f, 0f, false, false, 2.25f, 9f)
                horizontalLineTo(8f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(15f, 14f)
                lineToRelative(-2f, 6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19f, 14f)
                lineToRelative(2f, 6f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 14f)
                horizontalLineToRelative(-8f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 20f)
                verticalLineToRelative(-5.922f)
                arcToRelative(2f, 2f, 0f, false, false, -.586f, -1.414f)
                lineTo(6.5f, 11.75f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.205f, 12.795f)
                lineTo(8f, 14f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.ParkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Park: ImageVector
    @Composable get() = ParkDefinition.asImageVector()
