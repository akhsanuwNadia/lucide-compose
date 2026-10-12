package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderGit2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0f,19.0f)
                curveTo(15.238576f,19.0f,13.0f,16.761423f,13.0f,14.0f)
                lineTo(13.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,20.0f)
                lineTo(4.0f,20.0f)
                curveTo(2.8954306f,20.0f,2.0f,19.10457f,2.0f,18.0f)
                lineTo(2.0f,5.0f)
                curveTo(2.0f,3.8954306f,2.8954306f,3.0f,4.0f,3.0f)
                lineTo(7.9f,3.0f)
                curveTo(8.579667f,2.9933364f,9.216198f,3.332317f,9.59f,3.9f)
                lineTo(10.400001f,5.1000004f)
                curveTo(10.769923f,5.6617208f,11.397414f,5.99989f,12.070001f,6.0000005f)
                lineTo(20.0f,6.0000005f)
                curveTo(21.104568f,6.0000005f,22.0f,6.8954306f,22.0f,8.0f)
                lineTo(22.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,12.0f)
                curveTo(10.996795f,12.716661f,11.377291f,13.38026f,11.997409f,13.73952f)
                curveTo(12.617528f,14.098779f,13.382472f,14.098779f,14.002591f,13.73952f)
                curveTo(14.622709f,13.38026f,15.003205f,12.716661f,15.0f,12.0f)
                curveTo(15.003205f,11.283339f,14.622709f,10.61974f,14.002591f,10.26048f)
                curveTo(13.382472f,9.901221f,12.617528f,9.901221f,11.997409f,10.26048f)
                curveTo(11.377291f,10.61974f,10.996795f,11.283339f,11.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,19.0f)
                curveTo(17.996796f,19.716661f,18.37729f,20.38026f,18.99741f,20.73952f)
                curveTo(19.617527f,21.09878f,20.382473f,21.09878f,21.00259f,20.73952f)
                curveTo(21.62271f,20.38026f,22.003204f,19.716661f,22.0f,19.0f)
                curveTo(22.003204f,18.283339f,21.62271f,17.61974f,21.00259f,17.26048f)
                curveTo(20.382473f,16.90122f,19.617527f,16.90122f,18.99741f,17.26048f)
                curveTo(18.37729f,17.61974f,17.996796f,18.283339f,18.0f,19.0f)
            }
}

public val LucideIcons.All.FolderGit2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderGit2: ImageVector
    @Composable get() = FolderGit2Definition.asImageVector()
