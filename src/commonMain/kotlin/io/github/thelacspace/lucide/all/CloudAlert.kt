package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudAlert") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,12.0)
                lineTo(12.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,20.0)
                lineTo(12.010000228881836,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.128000259399414,16.948999404907227)
                curveTo(4.662940979003906,16.51246452331543,2.049774169921875,13.588644981384277,2.0035717487335205,10.096501350402832)
                curveTo(1.957369327545166,6.604358196258545,4.492268085479736,3.612428665161133,7.944565773010254,3.084373712539673)
                curveTo(11.39686393737793,2.556318759918213,14.710212707519531,4.653714656829834,15.710000038146973,8.0)
                lineTo(17.5,8.0)
                curveTo(19.977426528930664,8.011079788208008,21.97991943359375,10.022549629211426,21.97991943359375,12.5)
                curveTo(21.97991943359375,14.977450370788574,19.977426528930664,16.988920211791992,17.5,17.0)
                lineTo(15.857999801635742,17.0)
            }
}

public val LucideIcons.All.CloudAlertDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudAlert: ImageVector
    @Composable get() = CloudAlertDefinition.asImageVector()
