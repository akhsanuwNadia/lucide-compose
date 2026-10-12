package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Form") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,14.0)
                lineTo(10.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,2.0)
                lineTo(14.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,18.0)
                lineTo(19.0,18.0)
                lineTo(20.0,18.0)
                lineTo(20.0,22.0)
                lineTo(19.0,22.0)
                lineTo(5.0,22.0)
                lineTo(4.0,22.0)
                lineTo(4.0,18.0)
                lineTo(5.0,18.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,6.0)
                lineTo(19.0,6.0)
                lineTo(20.0,6.0)
                lineTo(20.0,10.0)
                lineTo(19.0,10.0)
                lineTo(5.0,10.0)
                lineTo(4.0,10.0)
                lineTo(4.0,6.0)
                lineTo(5.0,6.0)
                close()
            }
}

public val LucideIcons.All.FormDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Form: ImageVector
    @Composable get() = FormDefinition.asImageVector()
