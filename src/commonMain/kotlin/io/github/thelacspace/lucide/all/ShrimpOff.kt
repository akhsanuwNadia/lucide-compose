package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShrimpOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,2.0f)
                curveTo(10.603823f,3.2056756f,11.884009f,3.9189627f,13.227f,3.7979999f)
                lineTo(19.397f,3.237f)
                curveTo(20.25019f,3.1943045f,21.061012f,3.611379f,21.522442f,4.3302956f)
                curveTo(21.983871f,5.049212f,22.02537f,5.960069f,21.631224f,6.7179656f)
                curveTo(21.237078f,7.475862f,20.467539f,7.964937f,19.614f,8.0f)
                lineTo(13.5f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,20.0f)
                curveTo(10.5f,20.5f,9.88f,21.0f,8.5f,21.0f)
                curveTo(7.1236525f,20.993845f,6.0111556f,19.876362f,6.0111556f,18.5f)
                curveTo(6.0111556f,17.123638f,7.1236525f,16.006155f,8.5f,16.0f)
                lineTo(12.0f,16.0f)
                curveTo(13.144672f,16.000189f,14.271927f,15.719663f,15.283f,15.183f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0f,22.0f)
                curveTo(10.5f,21.5f,9.88f,21.0f,8.5f,21.0f)
                curveTo(6.1774755f,21.000298f,4.0312624f,19.761366f,2.87f,17.75f)
                curveTo(1.7040954f,15.804503f,1.647555f,13.389135f,2.72115f,11.391215f)
                curveTo(3.7947447f,9.393295f,5.8401666f,8.1074295f,8.106f,8.006f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.04f,12.54f)
                curveTo(18.668957f,11.466302f,19.000332f,10.244352f,19.0f,9.0f)
                lineTo(19.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,16.0f)
                curveTo(6.0f,16.0f,3.5f,12.0f,4.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.43f,9.33f)
                curveTo(8.699633f,11.537702f,8.90563f,13.9482355f,10.0f,16.0f)
            }
}

public val LucideIcons.All.ShrimpOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShrimpOff: ImageVector
    @Composable get() = ShrimpOffDefinition.asImageVector()
