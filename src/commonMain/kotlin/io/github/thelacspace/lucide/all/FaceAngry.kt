package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FaceAngry") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,12.0f)
                lineTo(15.0f,10.416f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,10.0f)
                curveTo(15.918149f,10.0f,14.86548f,10.350889f,14.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,10.0f)
                curveTo(8.081851f,10.0f,9.13452f,10.350889f,10.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,12.0f)
                lineTo(9.0f,10.416f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,17.0f)
                curveTo(10.777982f,15.666167f,13.223018f,15.666167f,15.000999f,17.0f)
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

public val LucideIcons.All.FaceAngryDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FaceAngry: ImageVector
    @Composable get() = FaceAngryDefinition.asImageVector()
