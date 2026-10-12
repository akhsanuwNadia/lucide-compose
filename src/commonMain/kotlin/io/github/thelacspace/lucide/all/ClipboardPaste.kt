package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClipboardPaste") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,14.0)
                lineTo(21.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,4.0)
                lineTo(18.0,4.0)
                curveTo(19.104570388793945,4.0,20.0,4.895430564880371,20.0,6.0)
                lineTo(20.0,7.343999862670898)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,18.0)
                lineTo(21.0,14.0)
                lineTo(17.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,4.0)
                lineTo(6.0,4.0)
                curveTo(4.895430564880371,4.0,4.0,4.895430564880371,4.0,6.0)
                lineTo(4.0,20.0)
                curveTo(4.0,21.104570388793945,4.895430564880371,22.0,6.0,22.0)
                lineTo(18.0,22.0)
                curveTo(18.760696411132812,22.000171661376953,19.455631256103516,21.56879234313965,19.792999267578125,20.886999130249023)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,2.0)
                lineTo(15.0,2.0)
                lineTo(16.0,2.0)
                lineTo(16.0,6.0)
                lineTo(15.0,6.0)
                lineTo(9.0,6.0)
                lineTo(8.0,6.0)
                lineTo(8.0,2.0)
                lineTo(9.0,2.0)
                close()
            }
}

public val LucideIcons.All.ClipboardPasteDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClipboardPaste: ImageVector
    @Composable get() = ClipboardPasteDefinition.asImageVector()
