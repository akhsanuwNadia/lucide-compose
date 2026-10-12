package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Printer3d") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 11f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 8f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 20f)
                verticalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, Hf)
                arcToRelative(9f, af, 1f, true, false, 00f, -1f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 20f)
                horizontalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 22f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, hf, 12f)
                arcToRelative(2f, 2f, 0f, false, false, vf, 18f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 8f)
                horizontalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.635f, 10.093f)
                arcTo(2f, 2f, 0f, false, false, Vf, 7f)
                arcToRelative(1f, 1f, 0f, false, false, hf, 2f)
                arcToRelative(1f, 1f, 0f, false, true, vf, 2f)
                arcToRelative(1f, 1f, 0f, true, false, .707f, lf)
                arcToRelative(-1f, 1f, af, true, true, 0f, 01f)
            }
}

public val LucideIcons.All.Printer3dDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Printer3d: ImageVector
    @Composable get() = Printer3dDefinition.asImageVector()
