package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CaseLower") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,9.0f)
                lineTo(10.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,6.0f)
                lineTo(14.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,12.5f)
                curveTo(13.994391f,13.754158f,14.660258f,14.915456f,15.745466f,15.54416f)
                curveTo(16.830673f,16.172863f,18.169327f,16.172863f,19.254534f,15.54416f)
                curveTo(20.339743f,14.915456f,21.00561f,13.754158f,21.0f,12.5f)
                curveTo(21.00561f,11.245842f,20.339743f,10.084544f,19.254534f,9.45584f)
                curveTo(18.169327f,8.827137f,16.830673f,8.827137f,15.745466f,9.45584f)
                curveTo(14.660258f,10.084544f,13.994391f,11.245842f,14.0f,12.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,12.5f)
                curveTo(2.9943912f,13.754158f,3.660258f,14.915456f,4.7454658f,15.54416f)
                curveTo(5.8306737f,16.172863f,7.1693263f,16.172863f,8.254534f,15.54416f)
                curveTo(9.339742f,14.915456f,10.005609f,13.754158f,10.0f,12.5f)
                curveTo(10.005609f,11.245842f,9.339742f,10.084544f,8.254534f,9.45584f)
                curveTo(7.1693263f,8.827137f,5.8306737f,8.827137f,4.7454658f,9.45584f)
                curveTo(3.660258f,10.084544f,2.9943912f,11.245842f,3.0f,12.5f)
            }
}

public val LucideIcons.All.CaseLowerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CaseLower: ImageVector
    @Composable get() = CaseLowerDefinition.asImageVector()
