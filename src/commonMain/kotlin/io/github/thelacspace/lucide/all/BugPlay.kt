package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BugPlay") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,19.655000686645508)
                curveTo(7.603362560272217,18.807661056518555,6.0007853507995605,16.542016983032227,6.0,14.0)
                lineTo(6.0,11.0)
                curveTo(6.0,8.790861129760742,7.790861129760742,7.0,10.0,7.0)
                lineTo(14.0,7.0)
                curveTo(16.19747543334961,6.999938011169434,17.983518600463867,8.77258586883545,18.0,10.970000267028809)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,15.003000259399414)
                curveTo(13.998909950256348,14.641666412353516,14.192831993103027,14.30784797668457,14.507257461547852,14.129804611206055)
                curveTo(14.821683883666992,13.951761245727539,15.207703590393066,13.95718765258789,15.517000198364258,14.144000053405762)
                lineTo(20.513999938964844,17.141000747680664)
                curveTo(20.816635131835938,17.321374893188477,21.002025604248047,17.64769172668457,21.002025604248047,18.0)
                curveTo(21.002025604248047,18.352310180664062,20.816635131835938,18.678627014160156,20.513999938964844,18.85900115966797)
                lineTo(15.517000198364258,21.856000900268555)
                curveTo(15.207550048828125,22.04290771484375,14.821313858032227,22.048242568969727,14.506819725036621,21.869953155517578)
                curveTo(14.192325592041016,21.69166374206543,13.998546600341797,21.357513427734375,14.0,20.996000289916992)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.119999885559082,3.880000114440918)
                lineTo(16.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,5.0)
                curveTo(20.997657775878906,7.033257484436035,19.470352172851562,8.741259574890137,17.450000762939453,8.970000267028809)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,21.0)
                curveTo(2.9975879192352295,18.86298179626465,4.675393104553223,17.10150718688965,6.809999942779541,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,5.0)
                curveTo(3.0023417472839355,7.033257484436035,4.529648780822754,8.741260528564453,6.550000190734863,8.970000267028809)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,13.0)
                lineTo(2.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,2.0)
                lineTo(9.880000114440918,3.880000114440918)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,7.130000114440918)
                lineTo(9.0,6.0)
                curveTo(8.995192527770996,4.925007343292236,9.565935134887695,3.9296092987060547,10.496113777160645,3.3907203674316406)
                curveTo(11.426291465759277,2.8518311977386475,12.573708534240723,2.8518311977386475,13.503886222839355,3.3907203674316406)
                curveTo(14.434064865112305,3.9296092987060547,15.004807472229004,4.925007343292236,15.0,6.0)
                lineTo(15.0,7.130000114440918)
            }
}

public val LucideIcons.All.BugPlayDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BugPlay: ImageVector
    @Composable get() = BugPlayDefinition.asImageVector()
