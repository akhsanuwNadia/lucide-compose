package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LampFloor") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,10.0f)
                lineTo(12.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.929f,7.629f)
                curveTo(18.052103f,7.937134f,18.014347f,8.286264f,17.828215f,8.560955f)
                curveTo(17.64208f,8.835647f,17.331814f,9.000122f,17.0f,9.0f)
                lineTo(7.0f,9.0f)
                curveTo(6.6683626f,8.99979f,6.3584023f,8.835179f,6.172506f,8.560541f)
                curveTo(5.9866095f,8.285903f,5.948962f,7.9369693f,6.072f,7.6289997f)
                lineTo(8.0720005f,2.6289997f)
                curveTo(8.223676f,2.2493496f,8.591173f,2.000259f,9.0f,2.0f)
                lineTo(15.0f,2.0f)
                curveTo(15.408827f,2.000259f,15.776324f,2.2493496f,15.9279995f,2.629f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,22.0f)
                lineTo(15.0f,22.0f)
            }
}

public val LucideIcons.All.LampFloorDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LampFloor: ImageVector
    @Composable get() = LampFloorDefinition.asImageVector()
