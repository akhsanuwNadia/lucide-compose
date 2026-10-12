package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileMusic") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.65f,22.0f)
                lineTo(18.0f,22.0f)
                curveTo(19.10457f,22.0f,20.0f,21.10457f,20.0f,20.0f)
                lineTo(20.0f,8.0f)
                curveTo(20.00157f,7.3599424f,19.747406f,6.745774f,19.294f,6.294f)
                lineTo(15.706f,2.706f)
                curveTo(15.254227f,2.2525938f,14.640058f,1.9984303f,14.0f,2.0f)
                lineTo(6.0f,2.0f)
                curveTo(4.8954306f,2.0f,4.0f,2.8954306f,4.0f,4.0f)
                lineTo(4.0f,14.35f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,2.0f)
                lineTo(14.0f,7.0f)
                curveTo(14.0f,7.5522847f,14.447715f,8.0f,15.0f,8.0f)
                lineTo(20.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,20.0f)
                lineTo(8.0f,13.0f)
                lineTo(11.0f,14.474f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,20.0f)
                curveTo(3.996795f,20.716661f,4.3772902f,21.38026f,4.9974093f,21.73952f)
                curveTo(5.617528f,22.09878f,6.382472f,22.09878f,7.0025907f,21.73952f)
                curveTo(7.6227098f,21.38026f,8.003205f,20.716661f,8.0f,20.0f)
                curveTo(8.003205f,19.283339f,7.6227098f,18.61974f,7.0025907f,18.26048f)
                curveTo(6.382472f,17.90122f,5.617528f,17.90122f,4.9974093f,18.26048f)
                curveTo(4.3772902f,18.61974f,3.996795f,19.283339f,4.0f,20.0f)
            }
}

public val LucideIcons.All.FileMusicDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileMusic: ImageVector
    @Composable get() = FileMusicDefinition.asImageVector()
