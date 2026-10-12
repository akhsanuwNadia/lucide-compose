package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BroomSparkles") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 3f)
                horizontalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.5f, 10.5f)
                lineTo(22f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.734f, 13.841f)
                arcToRelative(2f, 2f, 0f, false, false, -2.42f, Lf)
                arcToRelative(12.58f, 9.58f, af, false, false, 0f, 00f)
                arcToRelative(-2.421f, -.314f, lf, false, false, Af, 1f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 15f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 17f)
                horizontalLineToRelative(-4f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 4f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(5f, 18f)
                lineToRelative(2f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 6f)
                horizontalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(7.699f, 10.7f)
                lineToRelative(5.602f, 5.601f)
            }
}

public val LucideIcons.All.BroomSparklesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BroomSparkles: ImageVector
    @Composable get() = BroomSparklesDefinition.asImageVector()
