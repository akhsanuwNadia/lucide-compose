package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Eject") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,13.0f)
                curveTo(3.598446f,13.000398f,3.2356002f,12.760561f,3.0786054f,12.390968f)
                curveTo(2.9216104f,12.021377f,3.0009198f,11.593721f,3.28f,11.305f)
                lineTo(10.537f,3.637f)
                curveTo(10.915297f,3.2311518f,11.445183f,3.000683f,12.0f,3.000683f)
                curveTo(12.554816f,3.000683f,13.0847025f,3.2311518f,13.462999f,3.637f)
                lineTo(20.719f,11.305f)
                curveTo(20.997953f,11.593591f,21.077328f,12.021005f,20.92059f,12.390508f)
                curveTo(20.763851f,12.760011f,20.401373f,12.999996f,20.0f,13.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,17.0f)
                lineTo(20.0f,17.0f)
                lineTo(21.0f,17.0f)
                lineTo(21.0f,21.0f)
                lineTo(20.0f,21.0f)
                lineTo(4.0f,21.0f)
                lineTo(3.0f,21.0f)
                lineTo(3.0f,17.0f)
                lineTo(4.0f,17.0f)
                close()
            }
}

public val LucideIcons.All.EjectDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Eject: ImageVector
    @Composable get() = EjectDefinition.asImageVector()
