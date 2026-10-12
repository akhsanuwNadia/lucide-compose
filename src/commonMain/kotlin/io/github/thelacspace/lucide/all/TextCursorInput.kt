package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TextCursorInput") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,20.0f)
                lineTo(11.0f,20.0f)
                curveTo(9.895431f,20.0f,9.0f,19.10457f,9.0f,18.0f)
                curveTo(9.0f,19.10457f,8.104569f,20.0f,7.0f,20.0f)
                lineTo(6.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,8.0f)
                lineTo(20.0f,8.0f)
                curveTo(21.10457f,8.0f,22.0f,8.895431f,22.0f,10.0f)
                lineTo(22.0f,14.0f)
                curveTo(22.0f,15.104569f,21.10457f,16.0f,20.0f,16.0f)
                lineTo(13.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,16.0f)
                lineTo(4.0f,16.0f)
                curveTo(2.8954306f,16.0f,2.0f,15.104569f,2.0f,14.0f)
                lineTo(2.0f,10.0f)
                curveTo(2.0f,8.895431f,2.8954306f,8.0f,4.0f,8.0f)
                lineTo(5.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,4.0f)
                lineTo(7.0f,4.0f)
                curveTo(8.104569f,4.0f,9.0f,4.8954306f,9.0f,6.0f)
                curveTo(9.0f,4.8954306f,9.895431f,4.0f,11.0f,4.0f)
                lineTo(12.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,6.0f)
                lineTo(9.0f,18.0f)
            }
}

public val LucideIcons.All.TextCursorInputDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TextCursorInput: ImageVector
    @Composable get() = TextCursorInputDefinition.asImageVector()
