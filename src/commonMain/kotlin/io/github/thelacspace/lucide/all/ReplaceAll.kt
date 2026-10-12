package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ReplaceAll") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,14.0)
                curveTo(14.552285194396973,14.0,15.0,14.447714805603027,15.0,15.0)
                lineTo(15.0,20.0)
                curveTo(15.0,20.552284240722656,14.552285194396973,21.0,14.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,4.0)
                curveTo(14.0,3.4477152824401855,14.447714805603027,3.0,15.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,10.0)
                curveTo(14.447714805603027,10.0,14.0,9.552285194396973,14.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,14.0)
                curveTo(19.552284240722656,14.0,20.0,14.447714805603027,20.0,15.0)
                lineTo(20.0,20.0)
                curveTo(20.0,20.552284240722656,19.552284240722656,21.0,19.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,4.0)
                curveTo(21.0,3.4477152824401855,20.552284240722656,3.0,20.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,9.0)
                curveTo(21.0,9.552285194396973,20.552284240722656,10.0,20.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,7.0)
                lineTo(6.0,10.0)
                lineTo(9.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,10.0)
                lineTo(6.0,5.0)
                curveTo(6.0,3.895430564880371,6.895430564880371,3.0,8.0,3.0)
                lineTo(10.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,14.0)
                lineTo(9.0,14.0)
                lineTo(10.0,14.0)
                lineTo(10.0,21.0)
                lineTo(9.0,21.0)
                lineTo(4.0,21.0)
                lineTo(3.0,21.0)
                lineTo(3.0,14.0)
                lineTo(4.0,14.0)
                close()
            }
}

public val LucideIcons.All.ReplaceAllDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ReplaceAll: ImageVector
    @Composable get() = ReplaceAllDefinition.asImageVector()
