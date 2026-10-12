package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Images") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0f,11.0f)
                lineTo(20.704f,9.704f)
                curveTo(20.25336f,9.24965f,19.63993f,8.994085f,19.0f,8.994085f)
                curveTo(18.360071f,8.994085f,17.746641f,9.24965f,17.296001f,9.704f)
                lineTo(11.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,8.0f)
                curveTo(2.8954306f,8.0f,2.0f,8.895431f,2.0f,10.0f)
                lineTo(2.0f,20.0f)
                curveTo(2.0f,21.10457f,2.8954306f,22.0f,4.0f,22.0f)
                lineTo(14.0f,22.0f)
                curveTo(15.104569f,22.0f,16.0f,21.10457f,16.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,7.0f)
                curveTo(11.998398f,7.3583307f,12.188645f,7.69013f,12.498705f,7.86976f)
                curveTo(12.8087635f,8.04939f,13.1912365f,8.04939f,13.501295f,7.86976f)
                curveTo(13.811355f,7.69013f,14.001602f,7.3583307f,14.0f,7.0f)
                curveTo(14.001602f,6.6416693f,13.811355f,6.30987f,13.501295f,6.13024f)
                curveTo(13.1912365f,5.9506106f,12.8087635f,5.9506106f,12.498705f,6.13024f)
                curveTo(12.188645f,6.30987f,11.998398f,6.6416693f,12.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,2.0f)
                lineTo(20.0f,2.0f)
                lineTo(22.0f,2.0f)
                lineTo(22.0f,16.0f)
                lineTo(20.0f,16.0f)
                lineTo(10.0f,16.0f)
                lineTo(8.0f,16.0f)
                lineTo(8.0f,2.0f)
                lineTo(10.0f,2.0f)
                close()
            }
}

public val LucideIcons.All.ImagesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Images: ImageVector
    @Composable get() = ImagesDefinition.asImageVector()
