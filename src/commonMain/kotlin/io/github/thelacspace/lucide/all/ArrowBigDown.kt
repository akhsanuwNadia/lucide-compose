package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ArrowBigDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0f,5.0f)
                curveTo(9.0f,4.4477153f,9.447715f,4.0f,10.0f,4.0f)
                lineTo(14.0f,4.0f)
                curveTo(14.552285f,4.0f,15.0f,4.4477153f,15.0f,5.0f)
                lineTo(15.0f,11.0f)
                curveTo(15.0f,11.552285f,15.447715f,12.0f,16.0f,12.0f)
                lineTo(19.293f,12.0f)
                curveTo(19.579f,11.999939f,19.836868f,12.1721945f,19.946325f,12.436422f)
                curveTo(20.05578f,12.70065f,19.995264f,13.004797f,19.793f,13.207f)
                lineTo(12.706999f,20.293f)
                curveTo(12.316499f,20.68338f,11.683499f,20.68338f,11.292999f,20.293f)
                lineTo(4.2069993f,13.206999f)
                curveTo(4.004735f,13.004796f,3.9442177f,12.700649f,4.053674f,12.436421f)
                curveTo(4.1631308f,12.172194f,4.4209976f,11.999938f,4.7069993f,11.999999f)
                lineTo(8.0f,11.999999f)
                curveTo(8.552285f,11.999999f,9.0f,11.552284f,9.0f,10.999999f)
                close()
            }
}

public val LucideIcons.All.ArrowBigDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ArrowBigDown: ImageVector
    @Composable get() = ArrowBigDownDefinition.asImageVector()
