package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareCenterlineDashedVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0,8.0)
                lineTo(21.0,5.0)
                curveTo(21.0,3.895430564880371,20.104570388793945,3.0,19.0,3.0)
                lineTo(5.0,3.0)
                curveTo(3.895430564880371,3.0,3.0,3.895430564880371,3.0,5.0)
                lineTo(3.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,16.0)
                lineTo(21.0,19.0)
                curveTo(21.0,20.104570388793945,20.104570388793945,21.0,19.0,21.0)
                lineTo(5.0,21.0)
                curveTo(3.895430564880371,21.0,3.0,20.104570388793945,3.0,19.0)
                lineTo(3.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,12.0)
                lineTo(2.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,12.0)
                lineTo(8.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,12.0)
                lineTo(14.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,12.0)
                lineTo(20.0,12.0)
            }
}

public val LucideIcons.All.SquareCenterlineDashedVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareCenterlineDashedVertical: ImageVector
    @Composable get() = SquareCenterlineDashedVerticalDefinition.asImageVector()
