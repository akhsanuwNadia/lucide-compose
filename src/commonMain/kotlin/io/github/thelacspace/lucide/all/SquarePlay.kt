package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquarePlay") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,3.0)
                lineTo(19.0,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,21.0)
                lineTo(19.0,21.0)
                lineTo(5.0,21.0)
                lineTo(3.0,21.0)
                lineTo(3.0,3.0)
                lineTo(5.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,9.003000259399414)
                curveTo(8.998909950256348,8.641666412353516,9.192831993103027,8.30784797668457,9.507257461547852,8.129804611206055)
                curveTo(9.821683883666992,7.951760768890381,10.207703590393066,7.957187652587891,10.517000198364258,8.144000053405762)
                lineTo(15.513999938964844,11.140999794006348)
                curveTo(15.816634178161621,11.32137393951416,16.002025604248047,11.647689819335938,16.002025604248047,12.0)
                curveTo(16.002025604248047,12.352310180664062,15.816634178161621,12.67862606048584,15.513999938964844,12.859000205993652)
                lineTo(10.517000198364258,15.855999946594238)
                curveTo(10.207550048828125,16.042905807495117,9.821314811706543,16.048240661621094,9.506820678710938,15.869951248168945)
                curveTo(9.192326545715332,15.691662788391113,8.998546600341797,15.357512474060059,9.0,14.996000289916992)
                close()
            }
}

public val LucideIcons.All.SquarePlayDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquarePlay: ImageVector
    @Composable get() = SquarePlayDefinition.asImageVector()
