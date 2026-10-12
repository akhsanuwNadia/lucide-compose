package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("View") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0f,17.0f)
                lineTo(21.0f,19.0f)
                curveTo(21.0f,20.10457f,20.10457f,21.0f,19.0f,21.0f)
                lineTo(5.0f,21.0f)
                curveTo(3.8954306f,21.0f,3.0f,20.10457f,3.0f,19.0f)
                lineTo(3.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,7.0f)
                lineTo(21.0f,5.0f)
                curveTo(21.0f,3.8954306f,20.10457f,3.0f,19.0f,3.0f)
                lineTo(5.0f,3.0f)
                curveTo(3.8954306f,3.0f,3.0f,3.8954306f,3.0f,5.0f)
                lineTo(3.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,12.0f)
                curveTo(10.998398f,12.358331f,11.188645f,12.69013f,11.498705f,12.86976f)
                curveTo(11.8087635f,13.04939f,12.1912365f,13.04939f,12.501295f,12.86976f)
                curveTo(12.811355f,12.69013f,13.001602f,12.358331f,13.0f,12.0f)
                curveTo(13.001602f,11.641669f,12.811355f,11.30987f,12.501295f,11.13024f)
                curveTo(12.1912365f,10.95061f,11.8087635f,10.95061f,11.498705f,11.13024f)
                curveTo(11.188645f,11.30987f,10.998398f,11.641669f,11.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.944f,12.33f)
                curveTo(19.018692f,12.11634f,19.018692f,11.88366f,18.944f,11.67f)
                curveTo(17.792412f,8.848201f,15.047739f,7.0038786f,12.0f,7.0038786f)
                curveTo(8.952262f,7.0038786f,6.20759f,8.848201f,5.0560007f,11.67f)
                curveTo(4.9813085f,11.88366f,4.9813085f,12.11634f,5.0560007f,12.33f)
                curveTo(6.20759f,15.151799f,8.952262f,16.996122f,12.0f,16.996122f)
                curveTo(15.047739f,16.996122f,17.792412f,15.151799f,18.944f,12.33f)
            }
}

public val LucideIcons.All.ViewDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.View: ImageVector
    @Composable get() = ViewDefinition.asImageVector()
