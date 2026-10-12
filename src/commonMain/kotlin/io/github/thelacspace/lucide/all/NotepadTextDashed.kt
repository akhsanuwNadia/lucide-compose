package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("NotepadTextDashed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0,2.0)
                lineTo(8.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,2.0)
                lineTo(16.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,4.0)
                lineTo(18.0,4.0)
                curveTo(19.104570388793945,4.0,20.0,4.895430564880371,20.0,6.0)
                lineTo(20.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,12.0)
                lineTo(20.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,18.0)
                lineTo(20.0,20.0)
                curveTo(20.0,21.104570388793945,19.104570388793945,22.0,18.0,22.0)
                lineTo(17.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,22.0)
                lineTo(11.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,22.0)
                lineTo(6.0,22.0)
                curveTo(4.895430564880371,22.0,4.0,21.104570388793945,4.0,20.0)
                lineTo(4.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,14.0)
                lineTo(4.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,8.0)
                lineTo(4.0,6.0)
                curveTo(4.0,4.895430564880371,4.895430564880371,4.0,6.0,4.0)
                lineTo(8.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,10.0)
                lineTo(14.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,14.0)
                lineTo(16.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,18.0)
                lineTo(13.0,18.0)
            }
}

public val LucideIcons.All.NotepadTextDashedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.NotepadTextDashed: ImageVector
    @Composable get() = NotepadTextDashedDefinition.asImageVector()
