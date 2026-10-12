package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Shapes") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.3f,10.0f)
                curveTo(8.03715f,10.014346f,7.7884746f,9.880013f,7.6563735f,9.652318f)
                curveTo(7.524272f,9.424623f,7.5310826f,9.142066f,7.6740003f,8.921f)
                lineTo(11.4f,3.0f)
                curveTo(11.519085f,2.7855573f,11.741728f,2.6490917f,11.98686f,2.6402931f)
                curveTo(12.231993f,2.6314945f,12.463846f,2.7516468f,12.598f,2.957f)
                lineTo(16.3f,8.9f)
                curveTo(16.44872f,9.113583f,16.466671f,9.392043f,16.346598f,9.6229515f)
                curveTo(16.226526f,9.85386f,15.988258f,9.999088f,15.727999f,10.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,14.0f)
                lineTo(9.0f,14.0f)
                lineTo(10.0f,14.0f)
                lineTo(10.0f,21.0f)
                lineTo(9.0f,21.0f)
                lineTo(4.0f,21.0f)
                lineTo(3.0f,21.0f)
                lineTo(3.0f,14.0f)
                lineTo(4.0f,14.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,17.5f)
                curveTo(13.994391f,18.754158f,14.660258f,19.915455f,15.745466f,20.544159f)
                curveTo(16.830673f,21.172863f,18.169327f,21.172863f,19.254534f,20.544159f)
                curveTo(20.339743f,19.915455f,21.00561f,18.754158f,21.0f,17.5f)
                curveTo(21.00561f,16.245842f,20.339743f,15.084544f,19.254534f,14.45584f)
                curveTo(18.169327f,13.827137f,16.830673f,13.827137f,15.745466f,14.45584f)
                curveTo(14.660258f,15.084544f,13.994391f,16.245842f,14.0f,17.5f)
            }
}

public val LucideIcons.All.ShapesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Shapes: ImageVector
    @Composable get() = ShapesDefinition.asImageVector()
