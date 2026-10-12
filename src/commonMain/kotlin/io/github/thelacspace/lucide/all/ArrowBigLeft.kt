package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowBigLeft") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.793f,19.793f)
                curveTo(10.995203f,19.995264f,11.29935f,20.05578f,11.563578f,19.946325f)
                curveTo(11.8278055f,19.836868f,12.000061f,19.579f,12.0f,19.293f)
                lineTo(12.0f,16.0f)
                curveTo(12.0f,15.447715f,12.447715f,15.0f,13.0f,15.0f)
                lineTo(19.0f,15.0f)
                curveTo(19.552284f,15.0f,20.0f,14.552285f,20.0f,14.0f)
                lineTo(20.0f,10.0f)
                curveTo(20.0f,9.447715f,19.552284f,9.0f,19.0f,9.0f)
                lineTo(13.0f,9.0f)
                curveTo(12.447715f,9.0f,12.0f,8.552285f,12.0f,8.0f)
                lineTo(12.0f,4.707f)
                curveTo(12.000061f,4.420998f,11.8278055f,4.163131f,11.563578f,4.0536747f)
                curveTo(11.29935f,3.9442182f,10.995203f,4.0047355f,10.793f,4.207f)
                lineTo(3.8530002f,11.146999f)
                curveTo(3.6266303f,11.373358f,3.4994562f,11.680372f,3.4994562f,12.0005f)
                curveTo(3.4994562f,12.320626f,3.6266303f,12.627641f,3.8530002f,12.853999f)
                close()
            }
}

public val LucideIcons.All.ArrowBigLeftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowBigLeft: ImageVector
    @Composable get() = ArrowBigLeftDefinition.asImageVector()
