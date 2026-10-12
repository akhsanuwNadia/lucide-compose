package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Combine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,3.0)
                curveTo(14.552285194396973,3.0,15.0,3.4477152824401855,15.0,4.0)
                lineTo(15.0,9.0)
                curveTo(15.0,9.552285194396973,14.552285194396973,10.0,14.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,3.0)
                curveTo(19.552284240722656,3.0,20.0,3.4477152824401855,20.0,4.0)
                lineTo(20.0,9.0)
                curveTo(20.0,9.552285194396973,19.552284240722656,10.0,19.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,15.0)
                lineTo(10.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,21.0)
                lineTo(10.0,18.0)
                lineTo(5.0,18.0)
                curveTo(3.895430564880371,18.0,3.0,17.104570388793945,3.0,16.0)
                lineTo(3.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,14.0)
                lineTo(20.0,14.0)
                lineTo(21.0,14.0)
                lineTo(21.0,21.0)
                lineTo(20.0,21.0)
                lineTo(15.0,21.0)
                lineTo(14.0,21.0)
                lineTo(14.0,14.0)
                lineTo(15.0,14.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,3.0)
                lineTo(9.0,3.0)
                lineTo(10.0,3.0)
                lineTo(10.0,10.0)
                lineTo(9.0,10.0)
                lineTo(4.0,10.0)
                lineTo(3.0,10.0)
                lineTo(3.0,3.0)
                lineTo(4.0,3.0)
                close()
            }
}

public val LucideIcons.All.CombineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Combine: ImageVector
    @Composable get() = CombineDefinition.asImageVector()
