package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Eject") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,13.0)
                curveTo(3.5984458923339844,13.000397682189941,3.235600233078003,12.760560989379883,3.0786054134368896,12.390968322753906)
                curveTo(2.9216103553771973,12.021376609802246,3.000919818878174,11.593721389770508,3.2799999713897705,11.305000305175781)
                lineTo(10.536999702453613,3.63700008392334)
                curveTo(10.91529655456543,3.231151819229126,11.445182800292969,3.000683069229126,12.0,3.000683069229126)
                curveTo(12.554816246032715,3.000683069229126,13.084702491760254,3.231151819229126,13.46299934387207,3.63700008392334)
                lineTo(20.7189998626709,11.305000305175781)
                curveTo(20.997953414916992,11.59359073638916,21.077327728271484,12.021004676818848,20.920589447021484,12.390507698059082)
                curveTo(20.763851165771484,12.760010719299316,20.4013729095459,12.999996185302734,20.0,13.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,17.0)
                lineTo(20.0,17.0)
                lineTo(21.0,17.0)
                lineTo(21.0,21.0)
                lineTo(20.0,21.0)
                lineTo(4.0,21.0)
                lineTo(3.0,21.0)
                lineTo(3.0,17.0)
                lineTo(4.0,17.0)
                close()
            }
}

public val LucideIcons.All.EjectDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Eject: ImageVector
    @Composable get() = EjectDefinition.asImageVector()
