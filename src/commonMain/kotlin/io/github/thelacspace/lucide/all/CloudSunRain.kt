package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudSunRain") { strokeWidth ->
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
                moveTo(3.0,20.0)
                curveTo(1.7696703672409058,18.357961654663086,1.6674097776412964,16.130937576293945,2.7420811653137207,14.383057594299316)
                curveTo(3.8167524337768555,12.635177612304688,5.850191116333008,11.721272468566895,7.870766639709473,12.078030586242676)
                curveTo(9.891342163085938,12.43478775024414,11.488865852355957,13.98978328704834,11.899999618530273,16.0)
                lineTo(13.0,16.0)
                curveTo(14.245733261108398,15.998169898986816,15.3629789352417,16.766389846801758,15.8071928024292,17.93023109436035)
                curveTo(16.251407623291016,19.094072341918945,15.93014907836914,20.411340713500977,15.0,21.239999771118164)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,20.0)
                lineTo(11.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,19.0)
                lineTo(7.0,21.0)
            }
}

public val LucideIcons.All.CloudSunRainDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudSunRain: ImageVector
    @Composable get() = CloudSunRainDefinition.asImageVector()
