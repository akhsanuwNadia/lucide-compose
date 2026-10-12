package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MopSparkles") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 22f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 22f)
                curveToRelative(2.761f, 0f, 5f, -1.79f, 5f, -4f)
                curveToRelative(-4.42f, 0f, -4.08f, -5f, -8.5f, -5f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 3f)
                horizontalLineTo(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.5f, 11.5f)
                lineTo(22f, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 13f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 15f)
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
                moveToRelative(6.98f, 13.02f)
                lineToRelative(2.665f, -2.664f)
                arcToRelative(1.21f, 1.21f, 0f, false, false, lf, 2.29f)
                arcToRelative(2.288f, af, 1.21f, true, false, 010f, 1.712f)
                lineToRelative(-2.088f, 2.087f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 2f)
                verticalLineToRelative(2f)
            }
}

public val LucideIcons.All.MopSparklesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MopSparkles: ImageVector
    @Composable get() = MopSparklesDefinition.asImageVector()
