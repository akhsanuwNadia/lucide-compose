package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileBox") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 2f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, true, true, hf, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.692f, 22f)
                horizontalLineTo(18f)
                arcToRelative(2f, 2f, 0f, false, false, Vf, 8f)
                arcToRelative(2.4f, 2.4f, 0f, false, false, -1.706f, lf)
                arcToRelative(-3.588f, -3.588f, Af, false, false, 0f, 0014f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.264f, 13.752f)
                lineTo(7f, 16.5f)
                lineToRelative(4.737f, -2.748f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.995f, 13.014f)
                arcTo(2f, 2f, 0f, false, false, vf, 3.516f)
                arcToRelative(2f, 2f, 0f, false, true, lf, 3f)
                arcToRelative(1.74f, af, 2f, false, false, 002.008f, 0f)
                lineToRelative(3f, -1.74f)
                arcTo(2f, 2f, 0f, false, false, vf, -3.517f)
                arcToRelative(2f, 2f, 0f, false, false, -1.73f, lf)
                arcToRelative(-3f, -1.742f, af, false, false, 0f, 00f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 16.5f)
                verticalLineTo(22f)
            }
}

public val LucideIcons.All.FileBoxDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileBox: ImageVector
    @Composable get() = FileBoxDefinition.asImageVector()
