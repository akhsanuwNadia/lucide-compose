package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileImage") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,22.0)
                curveTo(4.895430564880371,22.0,4.0,21.104570388793945,4.0,20.0)
                lineTo(4.0,4.0)
                curveTo(4.0,2.895430564880371,4.895430564880371,2.0,6.0,2.0)
                lineTo(14.0,2.0)
                curveTo(14.639365196228027,1.9989635944366455,15.252715110778809,2.2530863285064697,15.704000473022461,2.7059998512268066)
                lineTo(19.29199981689453,6.293999671936035)
                curveTo(19.746139526367188,6.745443820953369,20.001039505004883,7.359653472900391,20.0,8.0)
                lineTo(20.0,20.0)
                curveTo(20.0,21.104570388793945,19.104570388793945,22.0,18.0,22.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,2.0)
                lineTo(14.0,7.0)
                curveTo(14.0,7.5522847175598145,14.447714805603027,8.0,15.0,8.0)
                lineTo(20.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,12.0)
                curveTo(7.996795177459717,12.71666145324707,8.377290725708008,13.380260467529297,8.997408866882324,13.739520072937012)
                curveTo(9.617527961730957,14.09877872467041,10.382472038269043,14.09877872467041,11.002591133117676,13.739520072937012)
                curveTo(11.622709274291992,13.380260467529297,12.003205299377441,12.71666145324707,12.0,12.0)
                curveTo(12.003205299377441,11.28333854675293,11.622709274291992,10.619739532470703,11.002591133117676,10.260479927062988)
                curveTo(10.382472038269043,9.90122127532959,9.617527961730957,9.90122127532959,8.997408866882324,10.260479927062988)
                curveTo(8.377290725708008,10.619739532470703,7.996795177459717,11.28333854675293,8.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,17.0)
                lineTo(18.70400047302246,15.704000473022461)
                curveTo(17.762866973876953,14.763007164001465,16.23713493347168,14.763007164001465,15.296000480651855,15.704000473022461)
                lineTo(9.0,22.0)
            }
}

public val LucideIcons.All.FileImageDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileImage: ImageVector
    @Composable get() = FileImageDefinition.asImageVector()
