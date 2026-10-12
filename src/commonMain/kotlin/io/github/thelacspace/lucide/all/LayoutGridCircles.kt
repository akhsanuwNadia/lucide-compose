package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LayoutGridCircles") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,17.5f)
                curveTo(13.994391f,18.754158f,14.660258f,19.915455f,15.745466f,20.544159f)
                curveTo(16.830673f,21.172863f,18.169327f,21.172863f,19.254534f,20.544159f)
                curveTo(20.339743f,19.915455f,21.00561f,18.754158f,21.0f,17.5f)
                curveTo(21.00561f,16.245842f,20.339743f,15.084544f,19.254534f,14.45584f)
                curveTo(18.169327f,13.827137f,16.830673f,13.827137f,15.745466f,14.45584f)
                curveTo(14.660258f,15.084544f,13.994391f,16.245842f,14.0f,17.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,6.5f)
                curveTo(13.994391f,7.7541585f,14.660258f,8.915456f,15.745466f,9.54416f)
                curveTo(16.830673f,10.172863f,18.169327f,10.172863f,19.254534f,9.54416f)
                curveTo(20.339743f,8.915456f,21.00561f,7.7541585f,21.0f,6.5f)
                curveTo(21.00561f,5.2458415f,20.339743f,4.084544f,19.254534f,3.4558403f)
                curveTo(18.169327f,2.8271365f,16.830673f,2.8271365f,15.745466f,3.4558403f)
                curveTo(14.660258f,4.084544f,13.994391f,5.2458415f,14.0f,6.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,17.5f)
                curveTo(2.9943912f,18.754158f,3.660258f,19.915455f,4.7454658f,20.544159f)
                curveTo(5.8306737f,21.172863f,7.1693263f,21.172863f,8.254534f,20.544159f)
                curveTo(9.339742f,19.915455f,10.005609f,18.754158f,10.0f,17.5f)
                curveTo(10.005609f,16.245842f,9.339742f,15.084544f,8.254534f,14.45584f)
                curveTo(7.1693263f,13.827137f,5.8306737f,13.827137f,4.7454658f,14.45584f)
                curveTo(3.660258f,15.084544f,2.9943912f,16.245842f,3.0f,17.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,6.5f)
                curveTo(2.9943912f,7.7541585f,3.660258f,8.915456f,4.7454658f,9.54416f)
                curveTo(5.8306737f,10.172863f,7.1693263f,10.172863f,8.254534f,9.54416f)
                curveTo(9.339742f,8.915456f,10.005609f,7.7541585f,10.0f,6.5f)
                curveTo(10.005609f,5.2458415f,9.339742f,4.084544f,8.254534f,3.4558403f)
                curveTo(7.1693263f,2.8271365f,5.8306737f,2.8271365f,4.7454658f,3.4558403f)
                curveTo(3.660258f,4.084544f,2.9943912f,5.2458415f,3.0f,6.5f)
            }
}

public val LucideIcons.All.LayoutGridCirclesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LayoutGridCircles: ImageVector
    @Composable get() = LayoutGridCirclesDefinition.asImageVector()
