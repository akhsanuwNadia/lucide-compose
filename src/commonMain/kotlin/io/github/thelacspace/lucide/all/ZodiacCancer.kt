package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacCancer") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0f,14.5f)
                curveTo(21.002378f,17.15536f,18.768148f,19.544775f,15.356804f,20.535166f)
                curveTo(11.945458f,21.525557f,8.042996f,20.91776f,5.5f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,9.5f)
                curveTo(2.9976218f,6.844641f,5.2318516f,4.455225f,8.643196f,3.4648342f)
                curveTo(12.054542f,2.4744437f,15.957004f,3.0822399f,18.5f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,14.5f)
                curveTo(13.994391f,15.754158f,14.660258f,16.915455f,15.745466f,17.544159f)
                curveTo(16.830673f,18.172863f,18.169327f,18.172863f,19.254534f,17.544159f)
                curveTo(20.339743f,16.915455f,21.00561f,15.754158f,21.0f,14.5f)
                curveTo(21.00561f,13.245842f,20.339743f,12.084544f,19.254534f,11.45584f)
                curveTo(18.169327f,10.827137f,16.830673f,10.827137f,15.745466f,11.45584f)
                curveTo(14.660258f,12.084544f,13.994391f,13.245842f,14.0f,14.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,9.5f)
                curveTo(2.9943912f,10.754158f,3.660258f,11.915456f,4.7454658f,12.54416f)
                curveTo(5.8306737f,13.172863f,7.1693263f,13.172863f,8.254534f,12.54416f)
                curveTo(9.339742f,11.915456f,10.005609f,10.754158f,10.0f,9.5f)
                curveTo(10.005609f,8.245842f,9.339742f,7.084544f,8.254534f,6.4558406f)
                curveTo(7.1693263f,5.8271365f,5.8306737f,5.8271365f,4.7454658f,6.4558406f)
                curveTo(3.660258f,7.084544f,2.9943912f,8.245842f,3.0f,9.5f)
            }
}

public val LucideIcons.All.ZodiacCancerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacCancer: ImageVector
    @Composable get() = ZodiacCancerDefinition.asImageVector()
