package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareParkingOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.6f,3.6f)
                curveTo(3.969261f,3.2231715f,4.472461f,3.007514f,5.0f,3.0f)
                lineTo(19.0f,3.0f)
                curveTo(20.10457f,3.0f,21.0f,3.8954306f,21.0f,5.0f)
                lineTo(21.0f,19.0f)
                curveTo(20.997766f,19.529577f,20.785587f,20.03665f,20.41f,20.41f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,8.7f)
                lineTo(3.0f,19.0f)
                curveTo(3.0f,20.10457f,3.8954306f,21.0f,5.0f,21.0f)
                lineTo(15.3f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0f,13.0f)
                curveTo(14.074993f,13.004807f,15.070391f,12.434065f,15.60928f,11.503886f)
                curveTo(16.148169f,10.573709f,16.148169f,9.426291f,15.60928f,8.496114f)
                curveTo(15.070391f,7.5659356f,14.074993f,6.9951925f,13.0f,7.0f)
                lineTo(9.0f,7.0f)
                lineTo(9.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,17.0f)
                lineTo(9.0f,14.7f)
            }
}

public val LucideIcons.All.SquareParkingOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareParkingOff: ImageVector
    @Composable get() = SquareParkingOffDefinition.asImageVector()
