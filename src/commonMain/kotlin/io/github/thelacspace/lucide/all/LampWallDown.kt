package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LampWallDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.929f,18.629f)
                curveTo(20.052105f,18.937134f,20.014347f,19.286264f,19.828215f,19.560955f)
                curveTo(19.64208f,19.835648f,19.331814f,20.000122f,19.0f,20.0f)
                lineTo(9.0f,20.0f)
                curveTo(8.668363f,19.99979f,8.358402f,19.835178f,8.172506f,19.560541f)
                curveTo(7.98661f,19.285904f,7.9489627f,18.93697f,8.0720005f,18.629f)
                lineTo(10.0720005f,13.629f)
                curveTo(10.223676f,13.24935f,10.591173f,13.000259f,11.0f,13.0f)
                lineTo(17.0f,13.0f)
                curveTo(17.408827f,13.000259f,17.776325f,13.24935f,17.928f,13.629f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,3.0f)
                curveTo(7.1045694f,3.0f,8.0f,3.8954306f,8.0f,5.0f)
                lineTo(8.0f,7.0f)
                curveTo(8.0f,8.104569f,7.1045694f,9.0f,6.0f,9.0f)
                lineTo(5.0f,9.0f)
                curveTo(4.4477153f,9.0f,4.0f,8.552285f,4.0f,8.0f)
                lineTo(4.0f,4.0f)
                curveTo(4.0f,3.4477153f,4.4477153f,3.0f,5.0f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,6.0f)
                lineTo(12.0f,6.0f)
                curveTo(13.104569f,6.0f,14.0f,6.8954306f,14.0f,8.0f)
                lineTo(14.0f,13.0f)
            }
}

public val LucideIcons.All.LampWallDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LampWallDown: ImageVector
    @Composable get() = LampWallDownDefinition.asImageVector()
