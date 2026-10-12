package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GapHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,8.0)
                lineTo(12.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,14.0)
                lineTo(12.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,20.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,3.0)
                lineTo(18.0,3.0)
                curveTo(16.895429611206055,3.0,16.0,3.895430564880371,16.0,5.0)
                lineTo(16.0,19.0)
                curveTo(16.0,20.104570388793945,16.895429611206055,21.0,18.0,21.0)
                lineTo(21.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,3.0)
                lineTo(6.0,3.0)
                curveTo(7.104569435119629,3.0,8.0,3.895430564880371,8.0,5.0)
                lineTo(8.0,19.0)
                curveTo(8.0,20.104570388793945,7.104569435119629,21.0,6.0,21.0)
                lineTo(3.0,21.0)
            }
}

public val LucideIcons.All.GapHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GapHorizontal: ImageVector
    @Composable get() = GapHorizontalDefinition.asImageVector()
