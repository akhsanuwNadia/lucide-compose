package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LampWallUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.929f,9.629f)
                curveTo(20.052105f,9.937134f,20.014347f,10.286263f,19.828215f,10.560955f)
                curveTo(19.64208f,10.835647f,19.331814f,11.000122f,19.0f,11.0f)
                lineTo(9.0f,11.0f)
                curveTo(8.668363f,10.99979f,8.358402f,10.835178f,8.172506f,10.560541f)
                curveTo(7.98661f,10.285903f,7.9489627f,9.936969f,8.0720005f,9.629f)
                lineTo(10.0720005f,4.6289997f)
                curveTo(10.223676f,4.2493496f,10.591173f,4.000259f,11.0f,4.0f)
                lineTo(17.0f,4.0f)
                curveTo(17.408827f,4.000259f,17.776325f,4.2493496f,17.928f,4.629f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,15.0f)
                curveTo(7.1045694f,15.0f,8.0f,15.895431f,8.0f,17.0f)
                lineTo(8.0f,19.0f)
                curveTo(8.0f,20.10457f,7.1045694f,21.0f,6.0f,21.0f)
                lineTo(5.0f,21.0f)
                curveTo(4.4477153f,21.0f,4.0f,20.552284f,4.0f,20.0f)
                lineTo(4.0f,16.0f)
                curveTo(4.0f,15.447715f,4.4477153f,15.0f,5.0f,15.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,18.0f)
                lineTo(12.0f,18.0f)
                curveTo(13.104569f,18.0f,14.0f,17.10457f,14.0f,16.0f)
                lineTo(14.0f,11.0f)
            }
}

public val LucideIcons.All.LampWallUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LampWallUp: ImageVector
    @Composable get() = LampWallUpDefinition.asImageVector()
