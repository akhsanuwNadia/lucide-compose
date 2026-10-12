package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListOrdered") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,5.0f)
                lineTo(21.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,12.0f)
                lineTo(21.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,19.0f)
                lineTo(21.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,4.0f)
                lineTo(5.0f,4.0f)
                lineTo(5.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,9.0f)
                lineTo(6.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.5f,20.0f)
                lineTo(3.4f,20.0f)
                curveTo(3.4f,19.0f,6.0f,18.075f,6.0f,16.5f)
                curveTo(6.0000806f,15.882933f,5.6222577f,15.328774f,5.047814f,15.1034155f)
                curveTo(4.47337f,14.878057f,3.8195252f,15.027483f,3.4f,15.48f)
            }
}

public val LucideIcons.All.ListOrderedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListOrdered: ImageVector
    @Composable get() = ListOrderedDefinition.asImageVector()
