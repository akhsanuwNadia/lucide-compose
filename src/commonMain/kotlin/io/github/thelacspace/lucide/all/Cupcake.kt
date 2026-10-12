package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cupcake") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,22.0)
                lineTo(12.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,4.0)
                lineTo(15.0,4.0)
                curveTo(16.6568546295166,4.0,18.0,5.343145847320557,18.0,7.0)
                lineTo(17.996000289916992,7.125)
                curveTo(19.764389038085938,7.579648971557617,21.000450134277344,9.174101829528809,21.0,11.0)
                lineTo(21.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.5,22.0)
                lineTo(17.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,13.0)
                curveTo(21.336139678955078,13.00003719329834,21.64977264404297,13.168950080871582,21.83478546142578,13.449591636657715)
                curveTo(22.019800186157227,13.730232238769531,22.05143928527832,14.085050582885742,21.91900062561035,14.394000053405762)
                lineTo(19.179000854492188,20.788000106811523)
                curveTo(18.863691329956055,21.523542404174805,18.140275955200195,22.00031280517578,17.34000015258789,22.0)
                lineTo(6.658999919891357,22.0)
                curveTo(5.859087944030762,21.99991226196289,5.136165618896484,21.52320671081543,4.821000099182129,20.788000106811523)
                lineTo(2.0810000896453857,14.394000053405762)
                curveTo(1.9485613107681274,14.085051536560059,1.9802011251449585,13.730233192443848,2.165214776992798,13.449591636657715)
                curveTo(2.3502285480499268,13.168951034545898,2.663861036300659,13.00003719329834,3.0,13.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,13.0)
                lineTo(3.0,11.0)
                curveTo(2.9994325637817383,9.174389839172363,4.235008239746094,7.580032825469971,6.003000259399414,7.125)
                lineTo(6.0,7.0)
                curveTo(6.0,5.343145847320557,7.343145847320557,4.0,9.0,4.0)
                lineTo(10.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5,22.0)
                lineTo(7.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,4.0)
                curveTo(9.996794700622559,4.7166619300842285,10.377290725708008,5.380260467529297,10.997408866882324,5.7395195960998535)
                curveTo(11.617527961730957,6.098779201507568,12.382472038269043,6.098779201507568,13.002591133117676,5.7395195960998535)
                curveTo(13.622709274291992,5.380260467529297,14.003205299377441,4.7166619300842285,14.0,4.0)
                curveTo(14.003205299377441,3.2833380699157715,13.622709274291992,2.619739532470703,13.002591133117676,2.2604801654815674)
                curveTo(12.382472038269043,1.9012209177017212,11.617527961730957,1.9012209177017212,10.997408866882324,2.2604801654815674)
                curveTo(10.377290725708008,2.619739532470703,9.996794700622559,3.2833380699157715,10.0,4.0)
            }
}

public val LucideIcons.All.CupcakeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cupcake: ImageVector
    @Composable get() = CupcakeDefinition.asImageVector()
