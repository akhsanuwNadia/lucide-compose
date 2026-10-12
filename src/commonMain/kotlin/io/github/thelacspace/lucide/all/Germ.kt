package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Germ") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,2.0)
                lineTo(11.925000190734863,3.8480000495910645)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,15.0)
                lineTo(13.010000228881836,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,21.0)
                lineTo(15.0,18.527999877929688)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,2.0)
                lineTo(18.0,3.803999900817871)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,19.0)
                lineTo(4.746000289916992,17.62700080871582)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,16.0)
                lineTo(19.5260009765625,13.869999885559082)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,5.0)
                lineTo(20.195999145507812,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,10.0)
                lineTo(5.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,16.0)
                lineTo(9.010000228881836,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,20.0)
                lineTo(9.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.329999923706055,7.034999847412109)
                curveTo(8.819999694824219,8.512999534606934,7.543999671936035,9.96500015258789,6.239999771118164,10.828999519348145)
                curveTo(4.398562908172607,12.046311378479004,3.573289394378662,14.327127456665039,4.209428310394287,16.440906524658203)
                curveTo(4.84556770324707,18.554685592651367,6.792572498321533,20.001188278198242,9.0,20.0)
                curveTo(14.840569496154785,20.000354766845703,19.847801208496094,15.828642845153809,20.902000427246094,10.083999633789062)
                curveTo(21.47477149963379,6.99562406539917,19.568689346313477,3.988201379776001,16.53131103515625,3.187910556793213)
                curveTo(13.493932723999023,2.387619733810425,10.353401184082031,4.065356731414795,9.329999923706055,7.034999847412109)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,9.0)
                curveTo(12.996794700622559,9.71666145324707,13.377290725708008,10.380260467529297,13.997408866882324,10.739520072937012)
                curveTo(14.617527961730957,11.09877872467041,15.382472038269043,11.09877872467041,16.00259017944336,10.739520072937012)
                curveTo(16.622709274291992,10.380260467529297,17.003204345703125,9.71666145324707,17.0,9.0)
                curveTo(17.003204345703125,8.28333854675293,16.622709274291992,7.619739532470703,16.00259017944336,7.2604804039001465)
                curveTo(15.382472038269043,6.901220798492432,14.617527961730957,6.901220798492432,13.997408866882324,7.2604804039001465)
                curveTo(13.377290725708008,7.619739532470703,12.996794700622559,8.28333854675293,13.0,9.0)
            }
}

public val LucideIcons.All.GermDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Germ: ImageVector
    @Composable get() = GermDefinition.asImageVector()
