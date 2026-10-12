package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,10.270000457763672)
                lineTo(7.0,3.3399999141693115)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,13.729999542236328)
                lineTo(7.0,20.65999984741211)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,22.0)
                lineTo(12.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,12.0)
                lineTo(22.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,20.65999984741211)
                lineTo(16.0,18.93000030517578)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,3.3399999141693115)
                lineTo(16.0,5.069999694824219)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                lineTo(4.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.65999984741211,17.0)
                lineTo(18.93000030517578,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.65999984741211,7.0)
                lineTo(18.93000030517578,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.3399999141693115,17.0)
                lineTo(5.069999694824219,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.3399999141693115,7.0)
                lineTo(5.069999694824219,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,12.0)
                curveTo(9.996794700622559,12.71666145324707,10.377290725708008,13.380260467529297,10.997408866882324,13.739520072937012)
                curveTo(11.617527961730957,14.09877872467041,12.382472038269043,14.09877872467041,13.002591133117676,13.739520072937012)
                curveTo(13.622709274291992,13.380260467529297,14.003205299377441,12.71666145324707,14.0,12.0)
                curveTo(14.003205299377441,11.28333854675293,13.622709274291992,10.619739532470703,13.002591133117676,10.260479927062988)
                curveTo(12.382472038269043,9.90122127532959,11.617527961730957,9.90122127532959,10.997408866882324,10.260479927062988)
                curveTo(10.377290725708008,10.619739532470703,9.996794700622559,11.28333854675293,10.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,12.0)
                curveTo(3.98717999458313,14.866647720336914,5.509161472320557,17.521041870117188,7.989636421203613,18.958078384399414)
                curveTo(10.470111846923828,20.395116806030273,13.529888153076172,20.395116806030273,16.01036262512207,18.958078384399414)
                curveTo(18.4908390045166,17.521041870117188,20.012819290161133,14.866647720336914,20.0,12.0)
                curveTo(20.012819290161133,9.133352279663086,18.4908390045166,6.4789581298828125,16.01036262512207,5.0419206619262695)
                curveTo(13.529888153076172,3.6048834323883057,10.470111846923828,3.6048834323883057,7.989636421203613,5.0419206619262695)
                curveTo(5.509161472320557,6.4789581298828125,3.98717999458313,9.133352279663086,4.0,12.0)
            }
}

public val LucideIcons.All.CogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cog: ImageVector
    @Composable get() = CogDefinition.asImageVector()
