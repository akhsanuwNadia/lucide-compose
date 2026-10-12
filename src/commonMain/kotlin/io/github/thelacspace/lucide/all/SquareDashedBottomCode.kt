package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareDashedBottomCode") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,9.5)
                lineTo(8.0,12.0)
                lineTo(10.0,14.5)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,21.0)
                lineTo(15.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,9.5)
                lineTo(16.0,12.0)
                lineTo(14.0,14.5)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,21.0)
                curveTo(3.895430564880371,21.0,3.0,20.104570388793945,3.0,19.0)
                lineTo(3.0,5.0)
                curveTo(3.0,3.895430564880371,3.895430564880371,3.0,5.0,3.0)
                lineTo(19.0,3.0)
                curveTo(20.104570388793945,3.0,21.0,3.895430564880371,21.0,5.0)
                lineTo(21.0,19.0)
                curveTo(21.0,20.104570388793945,20.104570388793945,21.0,19.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,21.0)
                lineTo(10.0,21.0)
            }
}

public val LucideIcons.All.SquareDashedBottomCodeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareDashedBottomCode: ImageVector
    @Composable get() = SquareDashedBottomCodeDefinition.asImageVector()
