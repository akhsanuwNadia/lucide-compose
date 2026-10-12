package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ImagePlay") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,15.003000259399414)
                curveTo(14.998909950256348,14.641666412353516,15.192831993103027,14.30784797668457,15.507257461547852,14.129804611206055)
                curveTo(15.821683883666992,13.951761245727539,16.20770263671875,13.95718765258789,16.517000198364258,14.144000053405762)
                lineTo(21.513999938964844,17.141000747680664)
                curveTo(21.816635131835938,17.321374893188477,22.002025604248047,17.64769172668457,22.002025604248047,18.0)
                curveTo(22.002025604248047,18.352310180664062,21.816635131835938,18.678627014160156,21.513999938964844,18.85900115966797)
                lineTo(16.517000198364258,21.856000900268555)
                curveTo(16.207550048828125,22.04290771484375,15.821313858032227,22.048242568969727,15.506819725036621,21.869953155517578)
                curveTo(15.192325592041016,21.69166374206543,14.998546600341797,21.357513427734375,15.0,20.996000289916992)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,12.170000076293945)
                lineTo(21.0,5.0)
                curveTo(21.0,3.895430564880371,20.104570388793945,3.0,19.0,3.0)
                lineTo(5.0,3.0)
                curveTo(3.895430564880371,3.0,3.0,3.895430564880371,3.0,5.0)
                lineTo(3.0,19.0)
                curveTo(3.0,20.104570388793945,3.895430564880371,21.0,5.0,21.0)
                lineTo(11.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,21.0)
                lineTo(11.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,9.0)
                curveTo(6.996795177459717,9.71666145324707,7.37729024887085,10.380260467529297,7.997409343719482,10.739520072937012)
                curveTo(8.617527961730957,11.09877872467041,9.382472038269043,11.09877872467041,10.002591133117676,10.739520072937012)
                curveTo(10.622709274291992,10.380260467529297,11.003205299377441,9.71666145324707,11.0,9.0)
                curveTo(11.003205299377441,8.28333854675293,10.622709274291992,7.619739532470703,10.002591133117676,7.2604804039001465)
                curveTo(9.382472038269043,6.901220798492432,8.617527961730957,6.901220798492432,7.997409343719482,7.2604804039001465)
                curveTo(7.37729024887085,7.619739532470703,6.996795177459717,8.28333854675293,7.0,9.0)
            }
}

public val LucideIcons.All.ImagePlayDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ImagePlay: ImageVector
    @Composable get() = ImagePlayDefinition.asImageVector()
