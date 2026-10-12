package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderKey") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0f,20.0f)
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
                lineTo(22.0f,9.36f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,12.0f)
                lineTo(19.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,14.0f)
                lineTo(21.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,20.0f)
                curveTo(16.996796f,20.716661f,17.37729f,21.38026f,17.99741f,21.73952f)
                curveTo(18.617527f,22.09878f,19.382473f,22.09878f,20.00259f,21.73952f)
                curveTo(20.62271f,21.38026f,21.003204f,20.716661f,21.0f,20.0f)
                curveTo(21.003204f,19.283339f,20.62271f,18.61974f,20.00259f,18.26048f)
                curveTo(19.382473f,17.90122f,18.617527f,17.90122f,17.99741f,18.26048f)
                curveTo(17.37729f,18.61974f,16.996796f,19.283339f,17.0f,20.0f)
            }
}

public val LucideIcons.All.FolderKeyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderKey: ImageVector
    @Composable get() = FolderKeyDefinition.asImageVector()
