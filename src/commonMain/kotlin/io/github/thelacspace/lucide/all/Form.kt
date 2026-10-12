package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Form") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,14.0f)
                lineTo(10.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,2.0f)
                lineTo(14.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,18.0f)
                lineTo(19.0f,18.0f)
                lineTo(20.0f,18.0f)
                lineTo(20.0f,22.0f)
                lineTo(19.0f,22.0f)
                lineTo(5.0f,22.0f)
                lineTo(4.0f,22.0f)
                lineTo(4.0f,18.0f)
                lineTo(5.0f,18.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,6.0f)
                lineTo(19.0f,6.0f)
                lineTo(20.0f,6.0f)
                lineTo(20.0f,10.0f)
                lineTo(19.0f,10.0f)
                lineTo(5.0f,10.0f)
                lineTo(4.0f,10.0f)
                lineTo(4.0f,6.0f)
                lineTo(5.0f,6.0f)
                close()
            }
}

public val LucideIcons.All.FormDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Form: ImageVector
    @Composable get() = FormDefinition.asImageVector()
