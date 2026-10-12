package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Milk") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0f,2.0f)
                lineTo(16.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,2.0f)
                lineTo(9.0f,4.789f)
                curveTo(8.99998f,5.5787888f,8.766155f,6.3508964f,8.328f,7.0080004f)
                lineTo(7.672f,7.9920006f)
                curveTo(7.2336555f,8.649388f,6.999823f,9.421871f,7.0f,10.212f)
                lineTo(7.0f,20.0f)
                curveTo(7.0f,21.10457f,7.8954306f,22.0f,9.0f,22.0f)
                lineTo(15.0f,22.0f)
                curveTo(16.10457f,22.0f,17.0f,21.10457f,17.0f,20.0f)
                lineTo(17.0f,10.211f)
                curveTo(16.999979f,9.421212f,16.766155f,8.649104f,16.328f,7.9920006f)
                lineTo(15.671999f,7.0080004f)
                curveTo(15.233655f,6.3506126f,14.999823f,5.5781293f,15.0f,4.788f)
                lineTo(15.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,15.0f)
                curveTo(8.599373f,14.330207f,10.400627f,14.330207f,12.0f,15.0f)
                curveTo(13.599328f,15.670017f,15.400672f,15.670017f,17.0f,15.0f)
            }
}

public val LucideIcons.All.MilkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Milk: ImageVector
    @Composable get() = MilkDefinition.asImageVector()
