package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Squirrel") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.236000061035156,22.0)
                curveTo(16.020488739013672,21.123085021972656,16.219934463500977,19.868534088134766,15.746068954467773,18.79157066345215)
                curveTo(15.272204399108887,17.7146053314209,14.212522506713867,17.014070510864258,13.03600025177002,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,20.0)
                curveTo(16.0,18.3431453704834,17.3431453704834,17.0,19.0,17.0)
                lineTo(20.0,17.0)
                curveTo(21.104570388793945,17.0,22.0,16.104570388793945,22.0,15.0)
                lineTo(22.0,13.0)
                curveTo(22.0,10.790861129760742,20.209138870239258,9.0,18.0,9.0)
                lineTo(18.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,13.0)
                lineTo(18.010000228881836,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,6.0)
                curveTo(15.790861129760742,6.0,14.0,7.790861129760742,14.0,10.0)
                curveTo(10.13400650024414,10.0,7.0,13.13400650024414,7.0,17.0)
                curveTo(7.0,12.0,11.0,12.0,11.0,6.5)
                curveTo(11.007211685180664,4.887510776519775,10.15109634399414,3.394413948059082,8.755829811096191,2.586080551147461)
                curveTo(7.360562324523926,1.7777469158172607,5.639437675476074,1.7777469158172607,4.244170665740967,2.586080551147461)
                curveTo(2.848903179168701,3.394413948059082,1.9927886724472046,4.887510776519775,2.0,6.5)
                curveTo(2.006155252456665,7.876347541809082,3.12363862991333,8.988844871520996,4.5,8.988844871520996)
                curveTo(5.87636137008667,8.988844871520996,6.993844985961914,7.876347541809082,7.0,6.5)
                curveTo(7.0,10.0,3.0,11.0,3.0,17.0)
                curveTo(3.0,19.799999237060547,5.199999809265137,22.0,8.0,22.0)
                lineTo(18.0,22.0)
            }
}

public val LucideIcons.All.SquirrelDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Squirrel: ImageVector
    @Composable get() = SquirrelDefinition.asImageVector()
