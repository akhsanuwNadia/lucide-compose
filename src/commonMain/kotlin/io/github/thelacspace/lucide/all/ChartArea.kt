package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChartArea") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,3.0)
                lineTo(3.0,19.0)
                curveTo(3.0,20.104570388793945,3.895430564880371,21.0,5.0,21.0)
                lineTo(21.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,11.206999778747559)
                curveTo(7.000028133392334,11.074647903442383,7.0525312423706055,10.947705268859863,7.145999908447266,10.854000091552734)
                lineTo(9.145999908447266,8.854000091552734)
                curveTo(9.2398042678833,8.759958267211914,9.367172241210938,8.707106590270996,9.5,8.707106590270996)
                curveTo(9.632827758789062,8.707106590270996,9.7601957321167,8.759958267211914,9.854000091552734,8.854000091552734)
                lineTo(13.145999908447266,12.145999908447266)
                curveTo(13.2398042678833,12.240041732788086,13.367172241210938,12.292893409729004,13.5,12.292893409729004)
                curveTo(13.632827758789062,12.292893409729004,13.7601957321167,12.240041732788086,13.854000091552734,12.145999908447266)
                lineTo(18.145999908447266,7.854000091552734)
                curveTo(18.28888511657715,7.710752487182617,18.504016876220703,7.667736053466797,18.69099998474121,7.745025157928467)
                curveTo(18.87798309326172,7.822314262390137,18.999956130981445,8.00467300415039,19.0,8.206999778747559)
                lineTo(19.0,16.0)
                curveTo(19.0,16.552284240722656,18.552284240722656,17.0,18.0,17.0)
                lineTo(8.0,17.0)
                curveTo(7.4477152824401855,17.0,7.0,16.552284240722656,7.0,16.0)
                close()
            }
}

public val LucideIcons.All.ChartAreaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChartArea: ImageVector
    @Composable get() = ChartAreaDefinition.asImageVector()
