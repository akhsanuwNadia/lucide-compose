package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CameraOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.564000129699707,14.557999610900879)
                curveTo(13.917839050292969,15.62207317352295,12.681648254394531,16.176517486572266,11.457270622253418,15.95140266418457)
                curveTo(10.232893943786621,15.726286888122559,9.274765014648438,14.768390655517578,9.049351692199707,13.5440673828125)
                curveTo(8.823938369750977,12.319745063781738,9.378083229064941,11.083419799804688,10.441999435424805,10.437000274658203)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,20.0)
                lineTo(4.0,20.0)
                curveTo(2.895430564880371,20.0,2.0,19.104570388793945,2.0,18.0)
                lineTo(2.0,9.0)
                curveTo(2.0,7.895430564880371,2.895430564880371,7.0,4.0,7.0)
                lineTo(5.996999740600586,7.0)
                curveTo(6.279290676116943,7.000119209289551,6.558409214019775,6.940478801727295,6.815999984741211,6.824999809265137)
            }
            lucidePath(strokeWidth) {
                moveTo(9.694999694824219,4.02400016784668)
                curveTo(9.797224044799805,4.00801944732666,9.900533676147461,3.999995231628418,10.003999710083008,4.0)
                lineTo(13.996999740600586,4.0)
                curveTo(14.732041358947754,3.9999895095825195,15.407855033874512,4.403173923492432,15.756999969482422,5.050000190734863)
                lineTo(16.243000030517578,5.950000286102295)
                curveTo(16.592144012451172,6.596826076507568,17.267959594726562,7.0000104904174805,18.003000259399414,7.0)
                lineTo(20.0,7.0)
                curveTo(21.104570388793945,7.0,22.0,7.895430564880371,22.0,9.0)
                lineTo(22.0,16.3439998626709)
            }
}

public val LucideIcons.All.CameraOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CameraOff: ImageVector
    @Composable get() = CameraOffDefinition.asImageVector()
