package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Repeat1") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0,2.0)
                lineTo(21.0,6.0)
                lineTo(17.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,11.0)
                lineTo(3.0,10.0)
                curveTo(3.0,7.790861129760742,4.790861129760742,6.0,7.0,6.0)
                lineTo(21.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,22.0)
                lineTo(3.0,18.0)
                lineTo(7.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,13.0)
                lineTo(21.0,14.0)
                curveTo(21.0,16.209138870239258,19.209138870239258,18.0,17.0,18.0)
                lineTo(3.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,10.0)
                lineTo(12.0,10.0)
                lineTo(12.0,14.0)
            }
}

public val LucideIcons.All.Repeat1Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Repeat1: ImageVector
    @Composable get() = Repeat1Definition.asImageVector()
