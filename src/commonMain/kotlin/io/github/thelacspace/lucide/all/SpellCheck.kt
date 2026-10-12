package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SpellCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0,15.0)
                lineTo(14.5,20.5)
                lineTo(12.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,16.0)
                lineTo(10.0,4.0)
                lineTo(15.114999771118164,14.229999542236328)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,12.0)
                lineTo(14.0,12.0)
            }
}

public val LucideIcons.All.SpellCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SpellCheck: ImageVector
    @Composable get() = SpellCheckDefinition.asImageVector()
