package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Mop") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,22.0)
                curveTo(12.76099967956543,22.0,15.0,20.209999084472656,15.0,18.0)
                curveTo(10.579999923706055,18.0,10.920000076293945,13.0,6.5,13.0)
                curveTo(4.887510776519775,12.992788314819336,3.394413948059082,13.84890365600586,2.586080551147461,15.244170188903809)
                curveTo(1.7777469158172607,16.63943862915039,1.7777469158172607,18.36056137084961,2.586080551147461,19.755828857421875)
                curveTo(3.394413948059082,21.15109634399414,4.887510776519775,22.007211685180664,6.5,22.0)
                close()
                lineTo(10.0,22.0)
                curveTo(8.343145370483398,22.0,7.0,20.6568546295166,7.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.5,11.5)
                lineTo(22.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.980000019073486,13.020000457763672)
                lineTo(9.645000457763672,10.356000900268555)
                curveTo(10.11739730834961,9.884264945983887,10.882603645324707,9.884264945983887,11.355000495910645,10.356000900268555)
                lineTo(13.645000457763672,12.644001007080078)
                curveTo(13.872164726257324,12.870952606201172,13.999802589416504,13.178892135620117,13.999802589416504,13.500000953674316)
                curveTo(13.999802589416504,13.821109771728516,13.872164726257324,14.129049301147461,13.645000457763672,14.356000900268555)
                lineTo(11.557000160217285,16.44300079345703)
            }
}

public val LucideIcons.All.MopDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Mop: ImageVector
    @Composable get() = MopDefinition.asImageVector()
