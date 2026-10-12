package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShipWheel") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,12.0)
                curveTo(3.98717999458313,14.866647720336914,5.509161472320557,17.521041870117188,7.989636421203613,18.958078384399414)
                curveTo(10.470111846923828,20.395116806030273,13.529888153076172,20.395116806030273,16.01036262512207,18.958078384399414)
                curveTo(18.4908390045166,17.521041870117188,20.012819290161133,14.866647720336914,20.0,12.0)
                curveTo(20.012819290161133,9.133352279663086,18.4908390045166,6.4789581298828125,16.01036262512207,5.0419206619262695)
                curveTo(13.529888153076172,3.6048834323883057,10.470111846923828,3.6048834323883057,7.989636421203613,5.0419206619262695)
                curveTo(5.509161472320557,6.4789581298828125,3.98717999458313,9.133352279663086,4.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,9.5)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,5.0)
                lineTo(13.770000457763672,10.229999542236328)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,12.0)
                lineTo(14.5,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,19.0)
                lineTo(13.770000457763672,13.770000457763672)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,14.5)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.229999542236328,13.770000457763672)
                lineTo(5.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.5,12.0)
                lineTo(2.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.229999542236328,10.229999542236328)
                lineTo(5.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.5,12.0)
                curveTo(9.495993614196777,12.895827293395996,9.971612930297852,13.725325584411621,10.746761322021484,14.174399375915527)
                curveTo(11.521909713745117,14.62347412109375,12.478090286254883,14.62347412109375,13.253238677978516,14.174399375915527)
                curveTo(14.028387069702148,13.725325584411621,14.504006385803223,12.895827293395996,14.5,12.0)
                curveTo(14.504006385803223,11.104172706604004,14.028387069702148,10.274674415588379,13.253238677978516,9.825600624084473)
                curveTo(12.478090286254883,9.37652587890625,11.521909713745117,9.37652587890625,10.746761322021484,9.825600624084473)
                curveTo(9.971612930297852,10.274674415588379,9.495993614196777,11.104172706604004,9.5,12.0)
            }
}

public val LucideIcons.All.ShipWheelDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShipWheel: ImageVector
    @Composable get() = ShipWheelDefinition.asImageVector()
