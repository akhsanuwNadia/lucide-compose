package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderOpen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,14.0f)
                lineTo(7.5f,11.1f)
                curveTo(7.832288f,10.440079f,8.50134f,10.017115f,9.24f,10.0f)
                lineTo(20.0f,10.0f)
                curveTo(20.619192f,9.998914f,21.203968f,10.284684f,21.583574f,10.773867f)
                curveTo(21.963179f,11.263048f,22.094799f,11.90047f,21.94f,12.5f)
                lineTo(20.400002f,18.5f)
                curveTo(20.170761f,19.387928f,19.367022f,20.00619f,18.45f,20.0f)
                lineTo(4.0f,20.0f)
                curveTo(2.8954306f,20.0f,2.0f,19.10457f,2.0f,18.0f)
                lineTo(2.0f,5.0f)
                curveTo(2.0f,3.8954306f,2.8954306f,3.0f,4.0f,3.0f)
                lineTo(7.9f,3.0f)
                curveTo(8.579667f,2.9933364f,9.216198f,3.332317f,9.59f,3.9f)
                lineTo(10.400001f,5.1000004f)
                curveTo(10.769923f,5.6617208f,11.397414f,5.99989f,12.070001f,6.0000005f)
                lineTo(18.0f,6.0000005f)
                curveTo(19.104568f,6.0000005f,20.0f,6.8954306f,20.0f,8.0f)
                lineTo(20.0f,10.0f)
            }
}

public val LucideIcons.All.FolderOpenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderOpen: ImageVector
    @Composable get() = FolderOpenDefinition.asImageVector()
