package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowBigUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f,19.0f)
                curveTo(9.0f,19.552284f,9.447715f,20.0f,10.0f,20.0f)
                lineTo(14.0f,20.0f)
                curveTo(14.552285f,20.0f,15.0f,19.552284f,15.0f,19.0f)
                lineTo(15.0f,13.0f)
                curveTo(15.0f,12.447715f,15.447715f,12.0f,16.0f,12.0f)
                lineTo(19.293f,12.0f)
                curveTo(19.579f,12.000061f,19.836868f,11.8278055f,19.946325f,11.563578f)
                curveTo(20.05578f,11.29935f,19.995264f,10.995203f,19.793f,10.793f)
                lineTo(12.706999f,3.7070003f)
                curveTo(12.316499f,3.3166187f,11.683499f,3.3166187f,11.292999f,3.7070003f)
                lineTo(4.2069993f,10.793f)
                curveTo(4.004735f,10.995203f,3.9442177f,11.29935f,4.053674f,11.563578f)
                curveTo(4.1631308f,11.8278055f,4.4209976f,12.000061f,4.7069993f,12.0f)
                lineTo(8.0f,12.0f)
                curveTo(8.552285f,12.0f,9.0f,12.447715f,9.0f,13.0f)
                close()
            }
}

public val LucideIcons.All.ArrowBigUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowBigUp: ImageVector
    @Composable get() = ArrowBigUpDefinition.asImageVector()
