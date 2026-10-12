package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserKey") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(20.0,11.0)
                lineTo(20.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,13.0)
                lineTo(22.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,21.0)
                lineTo(3.0,19.0)
                curveTo(3.0,16.790861129760742,4.790861129760742,15.0,7.0,15.0)
                lineTo(13.0,15.0)
                curveTo(13.730487823486328,14.999855995178223,14.447068214416504,15.199751853942871,15.072000503540039,15.57800006866455)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,7.0)
                curveTo(5.993589878082275,8.433323860168457,6.754580497741699,9.760520935058594,7.994818210601807,10.479039192199707)
                curveTo(9.235055923461914,11.197558403015137,10.764944076538086,11.197558403015137,12.005181312561035,10.479039192199707)
                curveTo(13.2454195022583,9.760520935058594,14.006409645080566,8.433323860168457,14.0,7.0)
                curveTo(14.006409645080566,5.566676139831543,13.2454195022583,4.239479064941406,12.005181312561035,3.5209603309631348)
                curveTo(10.764944076538086,2.8024418354034424,9.235055923461914,2.8024418354034424,7.994818210601807,3.5209603309631348)
                curveTo(6.754580497741699,4.239479064941406,5.993589878082275,5.566676139831543,6.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,19.0)
                curveTo(17.996795654296875,19.71666145324707,18.377290725708008,20.380260467529297,18.99740982055664,20.739519119262695)
                curveTo(19.61752700805664,21.098779678344727,20.38247299194336,21.098779678344727,21.00259017944336,20.739519119262695)
                curveTo(21.622709274291992,20.380260467529297,22.003204345703125,19.71666145324707,22.0,19.0)
                curveTo(22.003204345703125,18.28333854675293,21.622709274291992,17.619739532470703,21.00259017944336,17.260480880737305)
                curveTo(20.38247299194336,16.901220321655273,19.61752700805664,16.901220321655273,18.99740982055664,17.260480880737305)
                curveTo(18.377290725708008,17.619739532470703,17.996795654296875,18.28333854675293,18.0,19.0)
            }
}

public val LucideIcons.All.UserKeyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserKey: ImageVector
    @Composable get() = UserKeyDefinition.asImageVector()
