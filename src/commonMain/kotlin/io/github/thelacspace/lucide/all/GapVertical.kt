package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GapVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                lineTo(4.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,12.0)
                lineTo(10.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,12.0)
                lineTo(16.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,12.0)
                lineTo(22.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,21.0)
                lineTo(3.0,18.0)
                curveTo(3.0,16.895429611206055,3.895430564880371,16.0,5.0,16.0)
                lineTo(19.0,16.0)
                curveTo(20.104570388793945,16.0,21.0,16.895429611206055,21.0,18.0)
                lineTo(21.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,3.0)
                lineTo(3.0,6.0)
                curveTo(3.0,7.104569435119629,3.895430564880371,8.0,5.0,8.0)
                lineTo(19.0,8.0)
                curveTo(20.104570388793945,8.0,21.0,7.104569435119629,21.0,6.0)
                lineTo(21.0,3.0)
            }
}

public val LucideIcons.All.GapVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GapVertical: ImageVector
    @Composable get() = GapVerticalDefinition.asImageVector()
