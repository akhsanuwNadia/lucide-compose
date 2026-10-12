package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Volleyball") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,7.0f)
                curveTo(15.0824585f,6.99996f,19.01052f,8.560452f,21.98f,11.3619995f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,12.0f)
                curveTo(9.895445f,14.7546425f,6.7778563f,16.554636f,3.3400002f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.83f,13.634f)
                curveTo(14.788957f,17.169428f,11.473733f,19.790985f,7.5629997f,20.962f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.66f,17.0f)
                curveTo(18.555445f,14.2453575f,15.437857f,12.445364f,12.0f,12.0f)
                curveTo(10.666667f,8.8f,10.666667f,5.2f,12.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.17f,15.366f)
                curveTo(6.1285205f,11.830577f,5.5156984f,7.648507f,6.457f,3.6760006f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                curveTo(1.9839749f,15.583309f,3.8864517f,18.901302f,6.987046f,20.6976f)
                curveTo(10.08764f,22.493896f,13.91236f,22.493896f,17.012955f,20.6976f)
                curveTo(20.113548f,18.901302f,22.016026f,15.583309f,22.0f,12.0f)
                curveTo(22.016026f,8.416691f,20.113548f,5.0986977f,17.012955f,3.302401f)
                curveTo(13.91236f,1.5061044f,10.08764f,1.5061044f,6.987046f,3.302401f)
                curveTo(3.8864517f,5.0986977f,1.9839749f,8.416691f,2.0f,12.0f)
            }
}

public val LucideIcons.All.VolleyballDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Volleyball: ImageVector
    @Composable get() = VolleyballDefinition.asImageVector()
