package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RobotArm") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,21.0)
                lineTo(7.5,8.321999549865723)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,7.0)
                lineTo(15.75,3.2330000400543213)
                curveTo(15.8908052444458,3.0100958347320557,16.180498123168945,2.934828281402588,16.41200065612793,3.061000108718872)
                lineTo(20.0,5.005000114440918)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,8.998000144958496)
                lineTo(16.41200065612793,10.942000389099121)
                curveTo(16.180498123168945,11.068171501159668,15.890806198120117,10.992903709411621,15.750000953674316,10.770000457763672)
                lineTo(14.0,7.0)
                lineTo(8.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.4860000610351562,21.0)
                lineTo(13.486000061035156,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,21.0)
                lineTo(5.0,8.732000350952148)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,7.0)
                curveTo(3.9967949390411377,7.7166619300842285,4.37729024887085,8.380260467529297,4.997409343719482,8.739520072937012)
                curveTo(5.617527961730957,9.09877872467041,6.382472038269043,9.09877872467041,7.002590656280518,8.739520072937012)
                curveTo(7.62270975112915,8.380260467529297,8.003205299377441,7.7166619300842285,8.0,7.0)
                curveTo(8.003205299377441,6.2833380699157715,7.62270975112915,5.619739532470703,7.002590656280518,5.2604804039001465)
                curveTo(6.382472038269043,4.901220798492432,5.617527961730957,4.901220798492432,4.997409343719482,5.2604804039001465)
                curveTo(4.37729024887085,5.619739532470703,3.9967949390411377,6.2833380699157715,4.0,7.0)
            }
}

public val LucideIcons.All.RobotArmDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RobotArm: ImageVector
    @Composable get() = RobotArmDefinition.asImageVector()
