package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListTodo") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0f,5.0f)
                lineTo(21.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,12.0f)
                lineTo(21.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,19.0f)
                lineTo(21.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,17.0f)
                lineTo(5.0f,19.0f)
                lineTo(9.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,4.0f)
                lineTo(8.0f,4.0f)
                lineTo(9.0f,4.0f)
                lineTo(9.0f,10.0f)
                lineTo(8.0f,10.0f)
                lineTo(4.0f,10.0f)
                lineTo(3.0f,10.0f)
                lineTo(3.0f,4.0f)
                lineTo(4.0f,4.0f)
                close()
            }
}

public val LucideIcons.All.ListTodoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListTodo: ImageVector
    @Composable get() = ListTodoDefinition.asImageVector()
