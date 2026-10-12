package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Wallpaper") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,17.0f)
                lineTo(12.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,21.0f)
                lineTo(16.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,17.0f)
                lineTo(15.1f,10.9f)
                curveTo(15.881628f,10.133922f,17.133844f,10.138378f,17.91f,10.91f)
                lineTo(22.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,9.0f)
                curveTo(5.996795f,9.716661f,6.3772902f,10.38026f,6.9974093f,10.73952f)
                curveTo(7.617528f,11.098779f,8.382472f,11.098779f,9.002591f,10.73952f)
                curveTo(9.622709f,10.38026f,10.003205f,9.716661f,10.0f,9.0f)
                curveTo(10.003205f,8.283339f,9.622709f,7.6197395f,9.002591f,7.2604804f)
                curveTo(8.382472f,6.901221f,7.617528f,6.901221f,6.9974093f,7.2604804f)
                curveTo(6.3772902f,7.6197395f,5.996795f,8.283339f,6.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,3.0f)
                lineTo(20.0f,3.0f)
                lineTo(22.0f,3.0f)
                lineTo(22.0f,17.0f)
                lineTo(20.0f,17.0f)
                lineTo(4.0f,17.0f)
                lineTo(2.0f,17.0f)
                lineTo(2.0f,3.0f)
                lineTo(4.0f,3.0f)
                close()
            }
}

public val LucideIcons.All.WallpaperDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Wallpaper: ImageVector
    @Composable get() = WallpaperDefinition.asImageVector()
