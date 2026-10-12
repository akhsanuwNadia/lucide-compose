package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Summary") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,4.0)
                lineTo(7.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,16.0)
                lineTo(21.0,19.0)
                lineTo(18.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,4.0)
                lineTo(3.0,17.0)
                curveTo(3.0,18.104570388793945,3.895430564880371,19.0,5.0,19.0)
                lineTo(21.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,14.0)
                lineTo(14.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,9.0)
                lineTo(19.0,9.0)
            }
}

public val LucideIcons.All.SummaryDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Summary: ImageVector
    @Composable get() = SummaryDefinition.asImageVector()
