package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("IvBag") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,18.0f)
                lineTo(12.0f,20.0f)
                curveTo(12.0f,21.10457f,12.895431f,22.0f,14.0f,22.0f)
                lineTo(20.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,11.0f)
                curveTo(6.7200003f,11.5f,7.44f,12.0f,9.0f,12.0f)
                curveTo(12.0f,12.0f,12.0f,10.0f,15.0f,10.0f)
                curveTo(16.56f,10.0f,17.28f,10.5f,18.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.293f,3.0f)
                curveTo(9.746f,3.0f,10.18f,2.82f,10.5f,2.5f)
                curveTo(10.82f,2.18f,11.254f,2.0f,11.707f,2.0f)
                lineTo(12.293f,2.0f)
                curveTo(12.746f,2.0f,13.18f,2.18f,13.5f,2.5f)
                curveTo(13.82f,2.82f,14.254f,3.0f,14.707f,3.0f)
                lineTo(16.0f,3.0f)
                curveTo(17.10457f,3.0f,18.0f,3.8954306f,18.0f,5.0f)
                lineTo(18.0f,16.0f)
                curveTo(18.0f,17.10457f,17.10457f,18.0f,16.0f,18.0f)
                lineTo(8.0f,18.0f)
                curveTo(6.8954306f,18.0f,6.0f,17.10457f,6.0f,16.0f)
                lineTo(6.0f,5.0f)
                curveTo(6.0f,3.8954306f,6.8954306f,3.0f,8.0f,3.0f)
                close()
            }
}

public val LucideIcons.All.IvBagDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.IvBag: ImageVector
    @Composable get() = IvBagDefinition.asImageVector()
