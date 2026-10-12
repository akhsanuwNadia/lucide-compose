package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudSun") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.929999828338623,4.929999828338623)
                lineTo(6.339999675750732,6.339999675750732)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,12.0)
                lineTo(22.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.06999969482422,4.929999828338623)
                lineTo(17.65999984741211,6.339999675750732)
            }
            lucidePath(strokeWidth) {
                moveTo(15.946999549865723,12.649999618530273)
                curveTo(16.198184967041016,11.128459930419922,15.55233097076416,9.598036766052246,14.287012100219727,8.71647834777832)
                curveTo(13.021693229675293,7.834918975830078,11.362296104431152,7.759253025054932,10.02199935913086,8.52199935913086)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,22.0)
                lineTo(7.0,22.0)
                curveTo(4.368873596191406,21.99946403503418,2.188342571258545,19.95989227294922,2.012232780456543,17.334665298461914)
                curveTo(1.8361231088638306,14.709440231323242,3.724698305130005,12.39689826965332,6.332178115844727,12.044937133789062)
                curveTo(8.939658164978027,11.692975044250488,11.373774528503418,13.422033309936523,11.899999618530273,16.0)
                lineTo(13.0,16.0)
                curveTo(14.651617050170898,16.007387161254883,15.986613273620605,17.348365783691406,15.986613273620605,19.0)
                curveTo(15.986613273620605,20.651634216308594,14.651617050170898,21.992612838745117,13.0,22.0)
                close()
            }
}

public val LucideIcons.All.CloudSunDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudSun: ImageVector
    @Composable get() = CloudSunDefinition.asImageVector()
