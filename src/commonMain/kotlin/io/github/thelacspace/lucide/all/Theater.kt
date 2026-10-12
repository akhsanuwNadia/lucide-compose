package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Theater") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,10.0)
                curveTo(2.0,10.0,5.0,7.0,5.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,10.0)
                curveTo(22.0,10.0,19.0,7.0,19.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,2.0)
                curveTo(10.0,6.400000095367432,6.400000095367432,10.0,2.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,2.0)
                curveTo(14.0,6.400000095367432,17.600000381469727,10.0,22.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,10.0)
                curveTo(2.0,10.0,4.0,12.0,4.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,10.0)
                curveTo(22.0,10.0,20.0,12.0,20.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,15.0)
                lineTo(16.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,22.0)
                lineTo(2.0,21.0)
                curveTo(2.0,19.895429611206055,2.895430564880371,19.0,4.0,19.0)
                lineTo(8.0,19.0)
                curveTo(9.104569435119629,19.0,10.0,19.895429611206055,10.0,21.0)
                lineTo(10.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,22.0)
                lineTo(14.0,21.0)
                curveTo(14.0,19.895429611206055,14.895430564880371,19.0,16.0,19.0)
                lineTo(20.0,19.0)
                curveTo(21.104570388793945,19.0,22.0,19.895429611206055,22.0,21.0)
                lineTo(22.0,22.0)
            }
}

public val LucideIcons.All.TheaterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Theater: ImageVector
    @Composable get() = TheaterDefinition.asImageVector()
