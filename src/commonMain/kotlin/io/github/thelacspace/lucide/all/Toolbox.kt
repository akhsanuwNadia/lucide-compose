package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Toolbox") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,12.0f)
                lineTo(16.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,6.0f)
                lineTo(16.0f,4.0f)
                curveTo(16.0f,2.8954306f,15.104569f,2.0f,14.0f,2.0f)
                lineTo(10.0f,2.0f)
                curveTo(8.895431f,2.0f,8.0f,2.8954306f,8.0f,4.0f)
                lineTo(8.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,6.0f)
                curveTo(17.53039f,6.0001135f,18.039015f,6.2109013f,18.414f,6.586f)
                lineTo(21.414f,9.586f)
                curveTo(21.789099f,9.960986f,21.999886f,10.46961f,22.0f,11.0f)
                lineTo(22.0f,19.0f)
                curveTo(22.0f,20.10457f,21.10457f,21.0f,20.0f,21.0f)
                lineTo(4.0f,21.0f)
                curveTo(2.8954306f,21.0f,2.0f,20.10457f,2.0f,19.0f)
                lineTo(2.0f,11.0f)
                curveTo(2.0001135f,10.46961f,2.2109013f,9.960986f,2.586f,9.586f)
                lineTo(5.586f,6.5860004f)
                curveTo(5.960985f,6.2109017f,6.46961f,6.0001135f,7.0f,6.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,14.0f)
                lineTo(22.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,12.0f)
                lineTo(8.0f,16.0f)
            }
}

public val LucideIcons.All.ToolboxDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Toolbox: ImageVector
    @Composable get() = ToolboxDefinition.asImageVector()
