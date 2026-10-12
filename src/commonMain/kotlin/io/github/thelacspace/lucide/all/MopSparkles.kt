package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MopSparkles") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,22.0)
                curveTo(8.343145370483398,22.0,7.0,20.6568546295166,7.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,22.0)
                curveTo(12.76099967956543,22.0,15.0,20.209999084472656,15.0,18.0)
                curveTo(10.579999923706055,18.0,10.920000076293945,13.0,6.5,13.0)
                curveTo(4.051681995391846,13.051615715026855,2.093870162963867,15.051137924194336,2.093870162963867,17.5)
                curveTo(2.093870162963867,19.948862075805664,4.051681995391846,21.948383331298828,6.5,22.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,3.0)
                lineTo(8.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.5,11.5)
                lineTo(22.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,13.0)
                lineTo(20.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,15.0)
                lineTo(18.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,5.0)
                lineTo(4.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,7.0)
                lineTo(2.0,7.0)
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
            lucidePath(strokeWidth) {
                moveTo(9.0,2.0)
                lineTo(9.0,4.0)
            }
}

public val LucideIcons.All.MopSparklesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MopSparkles: ImageVector
    @Composable get() = MopSparklesDefinition.asImageVector()
