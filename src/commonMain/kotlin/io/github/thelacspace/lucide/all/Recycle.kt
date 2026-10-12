package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Recycle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.0,19.0)
                lineTo(4.815000057220459,19.0)
                curveTo(4.173412799835205,19.001855850219727,3.577712059020996,18.667579650878906,3.244999885559082,18.118999481201172)
                curveTo(2.925286293029785,17.567686080932617,2.9237618446350098,16.887739181518555,3.240999937057495,16.334999084472656)
                lineTo(7.196000099182129,9.5)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,19.0)
                lineTo(19.202999114990234,19.0)
                curveTo(19.841402053833008,18.995059967041016,20.43108558654785,18.657773971557617,20.75899887084961,18.110000610351562)
                curveTo(21.07422637939453,17.560321807861328,21.07422637939453,16.884679794311523,20.75899887084961,16.33500099182129)
                lineTo(19.53299903869629,14.215001106262207)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,16.0)
                lineTo(11.0,19.0)
                lineTo(14.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.293000221252441,13.595999717712402)
                lineTo(7.196000099182129,9.5)
                lineTo(3.0999999046325684,10.597999572753906)
            }
            lucidePath(strokeWidth) {
                moveTo(9.343999862670898,5.810999870300293)
                lineTo(10.437000274658203,3.9189999103546143)
                curveTo(10.756233215332031,3.3624939918518066,11.343581199645996,3.013803482055664,11.984999656677246,3.0)
                curveTo(12.621898651123047,2.998812675476074,13.2111234664917,3.337254762649536,13.531000137329102,3.888000011444092)
                lineTo(17.474000930786133,10.730999946594238)
            }
            lucidePath(strokeWidth) {
                moveTo(13.378000259399414,9.633000373840332)
                lineTo(17.474000930786133,10.731000900268555)
                lineTo(18.571001052856445,6.635000705718994)
            }
}

public val LucideIcons.All.RecycleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Recycle: ImageVector
    @Composable get() = RecycleDefinition.asImageVector()
