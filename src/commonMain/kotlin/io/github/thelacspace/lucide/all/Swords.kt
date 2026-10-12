package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Swords") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(13f, 19f)
                lineToRelative(6f, -6f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.5f, 17.5f)
                lineTo(3.586f, 6.586f)
                arcTo(2f, 2f, 0f, false, false, Vf, 3f)
                horizontalLineToRelative(2.172f)
                arcToRelative(2f, 2f, 0f, false, false, Lf, 17.5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(14.828f, 6.172f)
                lineToRelative(2.586f, -2.586f)
                arcTo(2f, 2f, 0f, false, false, Hf, 21f)
                verticalLineToRelative(2.172f)
                arcToRelative(2f, 2f, 0f, true, false, 1.414f, lf)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16f, 16f)
                lineToRelative(4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(19f, 21f)
                lineToRelative(2f, -2f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(5f, 14f)
                lineToRelative(4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(5f, 21f)
                lineToRelative(-2f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.5f, 16.5f)
                lineTo(4f, 20f)
            }
}

public val LucideIcons.All.SwordsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Swords: ImageVector
    @Composable get() = SwordsDefinition.asImageVector()
