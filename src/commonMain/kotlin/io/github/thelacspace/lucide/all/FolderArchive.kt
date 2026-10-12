package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderArchive") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0f,19.0f)
                curveTo(12.996795f,19.716661f,13.377291f,20.38026f,13.997409f,20.73952f)
                curveTo(14.617528f,21.09878f,15.382472f,21.09878f,16.00259f,20.73952f)
                curveTo(16.62271f,20.38026f,17.003204f,19.716661f,17.0f,19.0f)
                curveTo(17.003204f,18.283339f,16.62271f,17.61974f,16.00259f,17.26048f)
                curveTo(15.382472f,16.90122f,14.617528f,16.90122f,13.997409f,17.26048f)
                curveTo(13.377291f,17.61974f,12.996795f,18.283339f,13.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.9f,19.8f)
                curveTo(21.579006f,19.457869f,22.005291f,18.760313f,22.0f,18.0f)
                lineTo(22.0f,8.0f)
                curveTo(22.0f,6.8954306f,21.10457f,6.0f,20.0f,6.0f)
                lineTo(12.1f,6.0f)
                curveTo(11.420333f,6.006664f,10.783802f,5.667683f,10.41f,5.1f)
                lineTo(9.6f,3.9f)
                curveTo(9.230078f,3.3382795f,8.602587f,3.0001106f,7.93f,3.0f)
                lineTo(4.0f,3.0f)
                curveTo(2.8954306f,3.0f,2.0f,3.8954306f,2.0f,5.0f)
                lineTo(2.0f,18.0f)
                curveTo(2.0f,19.10457f,2.8954306f,20.0f,4.0f,20.0f)
                lineTo(9.1f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,11.0f)
                lineTo(15.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,17.0f)
                lineTo(15.0f,15.0f)
            }
}

public val LucideIcons.All.FolderArchiveDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderArchive: ImageVector
    @Composable get() = FolderArchiveDefinition.asImageVector()
