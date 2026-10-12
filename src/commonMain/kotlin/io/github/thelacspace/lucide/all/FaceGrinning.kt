package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FaceGrinning") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,10.0f)
                lineTo(15.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.084f,14.302f)
                curveTo(7.719652f,16.488766f,9.723222f,17.992865f,12.0005f,17.992865f)
                curveTo(14.277778f,17.992865f,16.281347f,16.488766f,16.917f,14.302f)
                curveTo(16.93642f,14.229403f,16.920713f,14.151899f,16.874563f,14.09259f)
                curveTo(16.828411f,14.03328f,16.757143f,13.999013f,16.682f,14.0f)
                lineTo(7.32f,14.0f)
                curveTo(7.2448564f,13.999013f,7.1735888f,14.03328f,7.127437f,14.09259f)
                curveTo(7.081286f,14.151899f,7.06558f,14.229403f,7.085f,14.302f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,10.0f)
                lineTo(9.0f,9.0f)
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

public val LucideIcons.All.FaceGrinningDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FaceGrinning: ImageVector
    @Composable get() = FaceGrinningDefinition.asImageVector()
