package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ToothbrushSparkles") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 3f)
                horizontalLineTo(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.586f, 11.414f)
                lineTo(22f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 11f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 22f)
                lineToRelative(7f, -7f)
                curveToRelative(1.857f, -1.857f, 3.714f, -1.99f, 5.571f, -3.6f)
                lineToRelative(-1.985f, -1.986f)
                arcTo(2f, 2f, 0f, false, false, af, 2f)
                arcTo(2f, 0f, 012f, false, false, 2f, 0f)
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

public val LucideIcons.All.ToothbrushSparklesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ToothbrushSparkles: ImageVector
    @Composable get() = ToothbrushSparklesDefinition.asImageVector()
