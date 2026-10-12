package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RotateCwFadingClock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 3f)
                arcToRelative(9.75f, 9.75f, 0f, false, true, 6.74f, 2.74f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.74f, 5.74f)
                lineTo(21f, 8f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 8f)
                verticalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.5f, 19.794f)
                curveToRelative(-6f, -3.464f, -6f, -12.124f, 0f, -15.588f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.5f, 4.206f)
                arcTo(9f, 9f, 0f, false, true, 12f, 3f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 7f)
                verticalLineToRelative(5f)
                lineToRelative(4f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 20.775f)
                arcTo(9f, 9f, 0f, false, true, 12f, 21f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 17.656f)
                arcToRelative(9f, 9f, 0f, false, true, -1.5f, 1.456f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, false, true, -.228f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 8f)
                horizontalLineToRelative(-5f)
            }
}

public val LucideIcons.All.RotateCwFadingClockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RotateCwFadingClock: ImageVector
    @Composable get() = RotateCwFadingClockDefinition.asImageVector()
