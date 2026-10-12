package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EyeDashed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.054f, 18.946f)
                arcToRelative(11f, 11f, 0f, false, true, -2.11f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.054f, 5.054f)
                arcToRelative(11f, 11f, 0f, false, false, -2.11f, -.001f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.072f, 6.274f)
                arcToRelative(11f, 11f, 0f, false, true, 1.753f, 1.173f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.825f, 16.552f)
                arcToRelative(11f, 11f, 0f, false, true, -1.753f, 1.174f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.514f, 13.303f)
                arcToRelative(11f, 11f, 0f, false, true, -.452f, -.954f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -.697f)
                arcToRelative(11f, 11f, 0f, false, true, .45f, -.955f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.485f, 10.697f)
                arcToRelative(11f, 11f, 0f, false, true, .453f, .955f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, .697f)
                arcToRelative(11f, 11f, 0f, false, true, -.453f, .954f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.173f, 7.448f)
                arcToRelative(11f, 11f, 0f, false, true, 1.753f, -1.174f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.926f, 17.726f)
                arcToRelative(11f, 11f, 0f, false, true, -1.753f, -1.174f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.EyeDashedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EyeDashed: ImageVector
    @Composable get() = EyeDashedDefinition.asImageVector()
