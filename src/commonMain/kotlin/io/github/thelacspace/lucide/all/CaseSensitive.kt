package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CaseSensitive") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,16.0f)
                lineTo(6.039f,6.3100004f)
                curveTo(6.116658f,6.1237264f,6.298686f,6.0024004f,6.5004997f,6.0024004f)
                curveTo(6.702314f,6.0024004f,6.8843417f,6.1237264f,6.962f,6.3100004f)
                lineTo(11.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,9.0f)
                lineTo(22.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.304f,13.0f)
                lineTo(9.696f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,12.5f)
                curveTo(14.994391f,13.754158f,15.660258f,14.915456f,16.745466f,15.54416f)
                curveTo(17.830673f,16.172863f,19.169327f,16.172863f,20.254534f,15.54416f)
                curveTo(21.339743f,14.915456f,22.00561f,13.754158f,22.0f,12.5f)
                curveTo(22.00561f,11.245842f,21.339743f,10.084544f,20.254534f,9.45584f)
                curveTo(19.169327f,8.827137f,17.830673f,8.827137f,16.745466f,9.45584f)
                curveTo(15.660258f,10.084544f,14.994391f,11.245842f,15.0f,12.5f)
            }
}

public val LucideIcons.All.CaseSensitiveDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CaseSensitive: ImageVector
    @Composable get() = CaseSensitiveDefinition.asImageVector()
