package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderRoot") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,20.0f)
                lineTo(20.0f,20.0f)
                curveTo(21.10457f,20.0f,22.0f,19.10457f,22.0f,18.0f)
                lineTo(22.0f,8.0f)
                curveTo(22.0f,6.8954306f,21.10457f,6.0f,20.0f,6.0f)
                lineTo(12.07f,6.0f)
                curveTo(11.400962f,5.9965386f,10.7779665f,5.65877f,10.41f,5.1f)
                lineTo(9.59f,3.8999999f)
                curveTo(9.2220335f,3.3412294f,8.599038f,3.0034611f,7.93f,3.0f)
                lineTo(4.0f,3.0f)
                curveTo(2.8954306f,3.0f,2.0f,3.8954306f,2.0f,5.0f)
                lineTo(2.0f,18.0f)
                curveTo(2.0f,19.1f,2.9f,20.0f,4.0f,20.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,13.0f)
                curveTo(9.996795f,13.716661f,10.377291f,14.38026f,10.997409f,14.73952f)
                curveTo(11.617528f,15.098779f,12.382472f,15.098779f,13.002591f,14.73952f)
                curveTo(13.622709f,14.38026f,14.003205f,13.716661f,14.0f,13.0f)
                curveTo(14.003205f,12.283339f,13.622709f,11.61974f,13.002591f,11.26048f)
                curveTo(12.382472f,10.901221f,11.617528f,10.901221f,10.997409f,11.26048f)
                curveTo(10.377291f,11.61974f,9.996795f,12.283339f,10.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,15.0f)
                lineTo(12.0f,20.0f)
            }
}

public val LucideIcons.All.FolderRootDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderRoot: ImageVector
    @Composable get() = FolderRootDefinition.asImageVector()
