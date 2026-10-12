package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ListVideo") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0,5.0)
                lineTo(3.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,12.0)
                lineTo(3.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,19.0)
                lineTo(3.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,12.003000259399414)
                curveTo(14.998909950256348,11.641666412353516,15.192831993103027,11.30784797668457,15.507257461547852,11.129804611206055)
                curveTo(15.821683883666992,10.951761245727539,16.20770263671875,10.95718765258789,16.517000198364258,11.144000053405762)
                lineTo(21.513999938964844,14.140999794006348)
                curveTo(21.816635131835938,14.32137393951416,22.002025604248047,14.647689819335938,22.002025604248047,15.0)
                curveTo(22.002025604248047,15.352310180664062,21.816635131835938,15.67862606048584,21.513999938964844,15.859000205993652)
                lineTo(16.517000198364258,18.856000900268555)
                curveTo(16.207550048828125,19.04290771484375,15.821313858032227,19.048242568969727,15.506819725036621,18.869953155517578)
                curveTo(15.192325592041016,18.69166374206543,14.998546600341797,18.357513427734375,15.0,17.996000289916992)
                close()
            }
}

public val LucideIcons.All.ListVideoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ListVideo: ImageVector
    @Composable get() = ListVideoDefinition.asImageVector()
