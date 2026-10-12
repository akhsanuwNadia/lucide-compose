package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileBox") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0f,2.0f)
                lineTo(14.0f,7.0f)
                curveTo(14.0f,7.5522847f,14.447715f,8.0f,15.0f,8.0f)
                lineTo(20.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.692f,22.0f)
                lineTo(18.0f,22.0f)
                curveTo(19.10457f,22.0f,20.0f,21.10457f,20.0f,20.0f)
                lineTo(20.0f,8.0f)
                curveTo(20.00157f,7.3599424f,19.747406f,6.745774f,19.294f,6.294f)
                lineTo(15.706f,2.706f)
                curveTo(15.254227f,2.2525938f,14.640058f,1.9984303f,14.0f,2.0f)
                lineTo(6.0f,2.0f)
                curveTo(4.8954306f,2.0f,4.0f,2.8954306f,4.0f,4.0f)
                lineTo(4.0f,7.804f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.264f,13.752f)
                lineTo(7.0f,16.5f)
                lineTo(11.7369995f,13.752f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.995f,13.014f)
                curveTo(2.3787558f,13.372167f,1.9996985f,14.031231f,2.0f,14.744f)
                lineTo(2.0f,18.26f)
                curveTo(1.9999058f,18.972975f,2.3793714f,19.632086f,2.996f,19.99f)
                lineTo(5.9960003f,21.73f)
                curveTo(6.6168323f,22.090353f,7.3831677f,22.090353f,8.004f,21.73f)
                lineTo(11.004f,19.99f)
                curveTo(11.620628f,19.632086f,12.000094f,18.972975f,12.0f,18.26f)
                lineTo(12.0f,14.743f)
                curveTo(12.000301f,14.030231f,11.621244f,13.371167f,11.005f,13.0130005f)
                lineTo(8.005f,11.271001f)
                curveTo(7.4249973f,10.933645f,6.714474f,10.909611f,6.113f,11.207001f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,16.5f)
                lineTo(7.0f,22.0f)
            }
}

public val LucideIcons.All.FileBoxDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileBox: ImageVector
    @Composable get() = FileBoxDefinition.asImageVector()
