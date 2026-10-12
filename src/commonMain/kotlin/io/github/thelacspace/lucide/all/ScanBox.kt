package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ScanBox") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 12f)
                verticalLineToRelative(5.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 3f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, false, vf, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 17f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, true, false, 2f, hf)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 7f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, hf, 2f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 21f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, true, false, -2f, vf)
            }
            lucidePath(strokeWidth) {
                moveTo(7.264f, 9.252f)
                lineTo(12f, 12f)
                lineToRelative(4.737f, -2.748f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.995f, 8.514f)
                arcTo(2f, 2f, 0f, false, false, vf, 3.516f)
                arcToRelative(2f, 2f, 0f, false, true, lf, 3f)
                arcToRelative(1.74f, af, 2f, false, false, 002.008f, 0f)
                lineToRelative(3f, -1.74f)
                arcTo(2f, 2f, 0f, false, false, vf, -3.517f)
                arcToRelative(2f, 2f, 0f, false, false, -1.73f, lf)
                arcToRelative(-3f, -1.742f, af, false, false, 0f, 00f)
            }
}

public val LucideIcons.All.ScanBoxDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ScanBox: ImageVector
    @Composable get() = ScanBoxDefinition.asImageVector()
