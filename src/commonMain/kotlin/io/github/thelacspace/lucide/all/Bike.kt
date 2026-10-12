package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bike") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,17.5f)
                curveTo(14.994391f,18.754158f,15.660258f,19.915455f,16.745466f,20.544159f)
                curveTo(17.830673f,21.172863f,19.169327f,21.172863f,20.254534f,20.544159f)
                curveTo(21.339743f,19.915455f,22.00561f,18.754158f,22.0f,17.5f)
                curveTo(22.00561f,16.245842f,21.339743f,15.084544f,20.254534f,14.45584f)
                curveTo(19.169327f,13.827137f,17.830673f,13.827137f,16.745466f,14.45584f)
                curveTo(15.660258f,15.084544f,14.994391f,16.245842f,15.0f,17.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,17.5f)
                curveTo(1.9943912f,18.754158f,2.660258f,19.915455f,3.745466f,20.544159f)
                curveTo(4.8306737f,21.172863f,6.1693263f,21.172863f,7.2545342f,20.544159f)
                curveTo(8.339742f,19.915455f,9.005609f,18.754158f,9.0f,17.5f)
                curveTo(9.005609f,16.245842f,8.339742f,15.084544f,7.2545342f,14.45584f)
                curveTo(6.1693263f,13.827137f,4.8306737f,13.827137f,3.745466f,14.45584f)
                curveTo(2.660258f,15.084544f,1.9943912f,16.245842f,2.0f,17.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,5.0f)
                curveTo(13.998398f,5.3583307f,14.188645f,5.69013f,14.498705f,5.86976f)
                curveTo(14.8087635f,6.0493894f,15.1912365f,6.0493894f,15.501295f,5.86976f)
                curveTo(15.811355f,5.69013f,16.001602f,5.3583307f,16.0f,5.0f)
                curveTo(16.001602f,4.6416693f,15.811355f,4.30987f,15.501295f,4.13024f)
                curveTo(15.1912365f,3.9506104f,14.8087635f,3.9506104f,14.498705f,4.13024f)
                curveTo(14.188645f,4.30987f,13.998398f,4.6416693f,14.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,17.5f)
                lineTo(12.0f,14.0f)
                lineTo(9.0f,11.0f)
                lineTo(13.0f,8.0f)
                lineTo(15.0f,11.0f)
                lineTo(17.0f,11.0f)
            }
}

public val LucideIcons.All.BikeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bike: ImageVector
    @Composable get() = BikeDefinition.asImageVector()
