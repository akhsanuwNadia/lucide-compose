package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("VolumeOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,9.0)
                curveTo(16.504356384277344,9.672338485717773,16.831090927124023,10.460968971252441,16.950000762939453,11.293000221252441)
            }
            lucidePath(strokeWidth) {
                moveTo(19.36400032043457,5.636000156402588)
                curveTo(21.981416702270508,8.251928329467773,22.7308406829834,12.20337200164795,21.253000259399414,15.596000671386719)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,7.0)
                lineTo(6.413000106811523,7.586999893188477)
                curveTo(6.149210453033447,7.852367401123047,5.790170669555664,8.001096725463867,5.415999889373779,8.0)
                lineTo(3.0,8.0)
                curveTo(2.4477152824401855,8.0,2.0,8.447714805603027,2.0,9.0)
                lineTo(2.0,15.0)
                curveTo(2.0,15.552285194396973,2.4477152824401855,16.0,3.0,16.0)
                lineTo(5.415999889373779,16.0)
                curveTo(5.790170669555664,15.998903274536133,6.149210453033447,16.147632598876953,6.413000106811523,16.413000106811523)
                lineTo(9.795999526977539,19.797000885009766)
                curveTo(9.997644424438477,19.99904441833496,10.301224708557129,20.059553146362305,10.564925193786621,19.95026206970215)
                curveTo(10.828624725341797,19.840970993041992,11.000397682189941,19.583450317382812,11.0,19.29800033569336)
                lineTo(11.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.82800006866455,4.171999931335449)
                curveTo(10.024097442626953,3.9751522541046143,10.319570541381836,3.916034698486328,10.576310157775879,4.022279262542725)
                curveTo(10.833049774169922,4.128523826599121,11.000345230102539,4.379145622253418,11.0,4.6570000648498535)
                lineTo(11.0,5.3429999351501465)
            }
}

public val LucideIcons.All.VolumeOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.VolumeOff: ImageVector
    @Composable get() = VolumeOffDefinition.asImageVector()
