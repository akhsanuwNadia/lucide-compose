package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("School") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,21.0)
                lineTo(14.0,18.0)
                curveTo(13.995076179504395,16.898921966552734,13.101089477539062,16.00892448425293,12.0,16.00892448425293)
                curveTo(10.898910522460938,16.00892448425293,10.004923820495605,16.898921966552734,10.0,18.0)
                lineTo(10.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,4.933000087738037)
                lineTo(18.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,6.0)
                lineTo(11.105999946594238,2.2100000381469727)
                curveTo(11.668821334838867,1.9287571907043457,12.331178665161133,1.9287571907043457,12.894000053405762,2.2100000381469727)
                lineTo(20.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,11.0)
                lineTo(2.4800000190734863,13.147000312805176)
                curveTo(2.1819710731506348,13.328434944152832,2.0000579357147217,13.652088165283203,2.0,14.00100040435791)
                lineTo(2.0,19.0)
                curveTo(2.0,20.104570388793945,2.895430564880371,21.0,4.0,21.0)
                lineTo(20.0,21.0)
                curveTo(21.104570388793945,21.0,22.0,20.104570388793945,22.0,19.0)
                lineTo(22.0,14.0)
                curveTo(21.99959373474121,13.651444435119629,21.817724227905273,13.328248977661133,21.520000457763672,13.147000312805176)
                lineTo(18.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,4.933000087738037)
                lineTo(6.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,9.0)
                curveTo(9.996794700622559,9.71666145324707,10.377290725708008,10.380260467529297,10.997408866882324,10.739520072937012)
                curveTo(11.617527961730957,11.09877872467041,12.382472038269043,11.09877872467041,13.002591133117676,10.739520072937012)
                curveTo(13.622709274291992,10.380260467529297,14.003205299377441,9.71666145324707,14.0,9.0)
                curveTo(14.003205299377441,8.28333854675293,13.622709274291992,7.619739532470703,13.002591133117676,7.2604804039001465)
                curveTo(12.382472038269043,6.901220798492432,11.617527961730957,6.901220798492432,10.997408866882324,7.2604804039001465)
                curveTo(10.377290725708008,7.619739532470703,9.996794700622559,8.28333854675293,10.0,9.0)
            }
}

public val LucideIcons.All.SchoolDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.School: ImageVector
    @Composable get() = SchoolDefinition.asImageVector()
