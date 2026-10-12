package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClipboardPaste") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,14.0f)
                lineTo(21.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,4.0f)
                lineTo(18.0f,4.0f)
                curveTo(19.10457f,4.0f,20.0f,4.8954306f,20.0f,6.0f)
                lineTo(20.0f,7.344f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,18.0f)
                lineTo(21.0f,14.0f)
                lineTo(17.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,4.0f)
                lineTo(6.0f,4.0f)
                curveTo(4.8954306f,4.0f,4.0f,4.8954306f,4.0f,6.0f)
                lineTo(4.0f,20.0f)
                curveTo(4.0f,21.10457f,4.8954306f,22.0f,6.0f,22.0f)
                lineTo(18.0f,22.0f)
                curveTo(18.760696f,22.000172f,19.455631f,21.568792f,19.793f,20.887f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,2.0f)
                lineTo(15.0f,2.0f)
                lineTo(16.0f,2.0f)
                lineTo(16.0f,6.0f)
                lineTo(15.0f,6.0f)
                lineTo(9.0f,6.0f)
                lineTo(8.0f,6.0f)
                lineTo(8.0f,2.0f)
                lineTo(9.0f,2.0f)
                close()
            }
}

public val LucideIcons.All.ClipboardPasteDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClipboardPaste: ImageVector
    @Composable get() = ClipboardPasteDefinition.asImageVector()
