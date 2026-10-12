package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Brush") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,10.0f)
                lineTo(14.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.5f,21.0f)
                curveTo(8.432997f,21.0f,10.0f,19.432997f,10.0f,17.5f)
                curveTo(10.0f,15.567003f,8.432997f,14.0f,6.5f,14.0f)
                curveTo(4.5670033f,14.0f,3.0f,15.567003f,3.0f,17.5f)
                curveTo(3.0001848f,18.165579f,2.7470508f,18.80628f,2.292f,19.292f)
                curveTo(2.0052462f,19.578028f,1.9193395f,20.00878f,2.0744312f,20.382927f)
                curveTo(2.229523f,20.757074f,2.5949821f,21.000725f,3.0f,21.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.969f,17.031f)
                lineTo(21.378f,5.624f)
                curveTo(22.200665f,4.7939453f,22.19767f,3.4550648f,21.371302f,2.6286974f)
                curveTo(20.544935f,1.8023299f,19.206055f,1.7993362f,18.376f,2.622f)
                lineTo(6.967f,14.031f)
            }
}

public val LucideIcons.All.BrushDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Brush: ImageVector
    @Composable get() = BrushDefinition.asImageVector()
