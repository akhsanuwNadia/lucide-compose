package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Theater") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,10.0f)
                curveTo(2.0f,10.0f,5.0f,7.0f,5.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,10.0f)
                curveTo(22.0f,10.0f,19.0f,7.0f,19.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,2.0f)
                curveTo(10.0f,6.4f,6.4f,10.0f,2.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,2.0f)
                curveTo(14.0f,6.4f,17.6f,10.0f,22.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,10.0f)
                curveTo(2.0f,10.0f,4.0f,12.0f,4.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,10.0f)
                curveTo(22.0f,10.0f,20.0f,12.0f,20.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,15.0f)
                lineTo(16.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,22.0f)
                lineTo(2.0f,21.0f)
                curveTo(2.0f,19.89543f,2.8954306f,19.0f,4.0f,19.0f)
                lineTo(8.0f,19.0f)
                curveTo(9.104569f,19.0f,10.0f,19.89543f,10.0f,21.0f)
                lineTo(10.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,22.0f)
                lineTo(14.0f,21.0f)
                curveTo(14.0f,19.89543f,14.895431f,19.0f,16.0f,19.0f)
                lineTo(20.0f,19.0f)
                curveTo(21.10457f,19.0f,22.0f,19.89543f,22.0f,21.0f)
                lineTo(22.0f,22.0f)
            }
}

public val LucideIcons.All.TheaterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Theater: ImageVector
    @Composable get() = TheaterDefinition.asImageVector()
