package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Lasso") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.704f,14.467f)
                curveTo(0.8533788f,11.0799675f,1.6486747f,6.5190454f,5.5491285f,3.8854191f)
                curveTo(9.449583f,1.2517929f,15.203319f,1.3907423f,18.8981f,4.207789f)
                curveTo(22.59288f,7.024836f,23.042843f,11.61583f,19.942036f,14.859139f)
                curveTo(16.841228f,18.102448f,11.184876f,18.95711f,6.8190002f,16.842f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,22.0f)
                curveTo(5.7426586f,21.056995f,5.001887f,19.577675f,5.0f,18.006f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,16.0f)
                curveTo(2.996795f,16.716661f,3.3772902f,17.38026f,3.997409f,17.73952f)
                curveTo(4.617528f,18.09878f,5.382472f,18.09878f,6.0025907f,17.73952f)
                curveTo(6.6227098f,17.38026f,7.003205f,16.716661f,7.0f,16.0f)
                curveTo(7.003205f,15.283339f,6.6227098f,14.61974f,6.0025907f,14.26048f)
                curveTo(5.382472f,13.901221f,4.617528f,13.901221f,3.997409f,14.26048f)
                curveTo(3.3772902f,14.61974f,2.996795f,15.283339f,3.0f,16.0f)
            }
}

public val LucideIcons.All.LassoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Lasso: ImageVector
    @Composable get() = LassoDefinition.asImageVector()
