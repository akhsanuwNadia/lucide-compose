package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TagX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.5f,6.5f)
                lineTo(12.586f,2.586f)
                curveTo(12.211015f,2.210901f,11.70239f,2.0001132f,11.172f,2.0f)
                lineTo(4.0f,2.0f)
                curveTo(2.8954306f,2.0f,2.0f,2.8954306f,2.0f,4.0f)
                lineTo(2.0f,11.172f)
                curveTo(2.0001132f,11.70239f,2.210901f,12.211015f,2.586f,12.586f)
                lineTo(11.290001f,21.29f)
                curveTo(12.237052f,22.228003f,13.76295f,22.228003f,14.710001f,21.29f)
                lineTo(16.5f,19.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.5f,10.5f)
                lineTo(21.5f,15.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.5f,10.5f)
                lineTo(16.5f,15.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,7.5f)
                curveTo(6.999199f,7.6791654f,7.0943227f,7.845065f,7.2493525f,7.93488f)
                curveTo(7.4043818f,8.024694f,7.5956182f,8.024694f,7.7506475f,7.93488f)
                curveTo(7.9056773f,7.845065f,8.000801f,7.6791654f,8.0f,7.5f)
                curveTo(8.000801f,7.3208346f,7.9056773f,7.154935f,7.7506475f,7.06512f)
                curveTo(7.5956182f,6.975305f,7.4043818f,6.975305f,7.2493525f,7.06512f)
                curveTo(7.0943227f,7.154935f,6.999199f,7.3208346f,7.0f,7.5f)
            }
}

public val LucideIcons.All.TagXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TagX: ImageVector
    @Composable get() = TagXDefinition.asImageVector()
