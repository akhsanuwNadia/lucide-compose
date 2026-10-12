package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudDownload") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,13.0)
                lineTo(12.0,21.0)
                lineTo(8.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,21.0)
                lineTo(16.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.39300012588501,15.269000053405762)
                curveTo(2.153191328048706,13.309623718261719,1.3970555067062378,10.148289680480957,2.5078823566436768,7.387499809265137)
                curveTo(3.6187095642089844,4.626709461212158,6.3536458015441895,2.870037794113159,9.326334953308105,3.007952928543091)
                curveTo(12.299023628234863,3.1458680629730225,14.859562873840332,5.148218631744385,15.710000038146973,8.0)
                lineTo(17.5,8.0)
                curveTo(19.49653434753418,7.999748706817627,21.2545223236084,9.315040588378906,21.817777633666992,11.230477333068848)
                curveTo(22.381032943725586,13.145913124084473,21.614864349365234,15.203460693359375,19.93600082397461,16.284000396728516)
            }
}

public val LucideIcons.All.CloudDownloadDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudDownload: ImageVector
    @Composable get() = CloudDownloadDefinition.asImageVector()
