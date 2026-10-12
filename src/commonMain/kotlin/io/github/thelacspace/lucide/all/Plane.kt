package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Plane") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.799999237060547,19.200000762939453)
                lineTo(16.0,11.0)
                lineTo(19.5,7.5)
                curveTo(21.0,6.0,21.5,4.0,21.0,3.0)
                curveTo(20.0,2.5,18.0,3.0,16.5,4.5)
                lineTo(13.0,8.0)
                lineTo(4.800000190734863,6.199999809265137)
                curveTo(4.300000190734863,6.099999904632568,3.9000000953674316,6.299999713897705,3.700000286102295,6.699999809265137)
                lineTo(3.4000003337860107,7.199999809265137)
                curveTo(3.200000286102295,7.699999809265137,3.3000004291534424,8.199999809265137,3.700000286102295,8.5)
                lineTo(9.0,12.0)
                lineTo(7.0,15.0)
                lineTo(4.0,15.0)
                lineTo(3.0,16.0)
                lineTo(6.0,18.0)
                lineTo(8.0,21.0)
                lineTo(9.0,20.0)
                lineTo(9.0,17.0)
                lineTo(12.0,15.0)
                lineTo(15.5,20.299999237060547)
                curveTo(15.800000190734863,20.69999885559082,16.299999237060547,20.799999237060547,16.799999237060547,20.599998474121094)
                lineTo(17.299999237060547,20.39999771118164)
                curveTo(17.69999885559082,20.099998474121094,17.899999618530273,19.699996948242188,17.799999237060547,19.199996948242188)
                close()
            }
}

public val LucideIcons.All.PlaneDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Plane: ImageVector
    @Composable get() = PlaneDefinition.asImageVector()
