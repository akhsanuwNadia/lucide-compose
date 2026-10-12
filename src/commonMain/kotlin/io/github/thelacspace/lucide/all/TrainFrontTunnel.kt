package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TrainFrontTunnel") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,22.0f)
                lineTo(2.0f,12.0f)
                curveTo(1.9839749f,8.416691f,3.8864517f,5.0986977f,6.987046f,3.302401f)
                curveTo(10.08764f,1.5061044f,13.91236f,1.5061044f,17.012955f,3.302401f)
                curveTo(20.113548f,5.0986977f,22.016026f,8.416691f,22.0f,12.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,6.8f)
                lineTo(15.0f,8.2f)
                curveTo(15.004807f,9.203326f,14.434065f,10.132364f,13.503886f,10.635327f)
                curveTo(12.573709f,11.13829f,11.426291f,11.13829f,10.496114f,10.635327f)
                curveTo(9.565935f,10.132364f,8.995193f,9.203326f,9.0f,8.2f)
                lineTo(9.0f,6.8f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,15.0f)
                lineTo(10.01f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,15.0f)
                lineTo(14.01f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,19.0f)
                curveTo(7.790861f,19.0f,6.0f,17.209139f,6.0f,15.0f)
                lineTo(6.0f,12.0f)
                curveTo(5.990385f,9.850015f,7.131871f,7.8592186f,8.992228f,6.7814407f)
                curveTo(10.852584f,5.7036624f,13.147416f,5.7036624f,15.007772f,6.7814407f)
                curveTo(16.86813f,7.8592186f,18.009615f,9.850015f,18.0f,12.0f)
                lineTo(18.0f,15.0f)
                curveTo(18.0f,17.209139f,16.209139f,19.0f,14.0f,19.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,19.0f)
                lineTo(7.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,19.0f)
                lineTo(17.0f,22.0f)
            }
}

public val LucideIcons.All.TrainFrontTunnelDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TrainFrontTunnel: ImageVector
    @Composable get() = TrainFrontTunnelDefinition.asImageVector()
