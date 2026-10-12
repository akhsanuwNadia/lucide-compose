package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Eclipse") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,12.0f)
                curveTo(1.9839749f,15.583309f,3.8864517f,18.901302f,6.987046f,20.6976f)
                curveTo(10.08764f,22.493896f,13.91236f,22.493896f,17.012955f,20.6976f)
                curveTo(20.113548f,18.901302f,22.016026f,15.583309f,22.0f,12.0f)
                curveTo(22.016026f,8.416691f,20.113548f,5.0986977f,17.012955f,3.302401f)
                curveTo(13.91236f,1.5061044f,10.08764f,1.5061044f,6.987046f,3.302401f)
                curveTo(3.8864517f,5.0986977f,1.9839749f,8.416691f,2.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                curveTo(10.200333f,3.7836423f,9.492575f,6.393877f,10.144723f,8.842322f)
                curveTo(10.796872f,11.290768f,12.709232f,13.203128f,15.157678f,13.855277f)
                curveTo(17.606123f,14.507425f,20.216358f,13.799667f,22.0f,12.0f)
            }
}

public val LucideIcons.All.EclipseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Eclipse: ImageVector
    @Composable get() = EclipseDefinition.asImageVector()
