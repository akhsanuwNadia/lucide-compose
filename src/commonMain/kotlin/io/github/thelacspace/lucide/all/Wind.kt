package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Wind") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.800000190734863,19.600000381469727)
                curveTo(13.496147155761719,20.12211036682129,14.44999885559082,20.134180068969727,15.159132957458496,19.629850387573242)
                curveTo(15.868268013000488,19.125520706176758,16.169925689697266,18.220544815063477,15.905216217041016,17.391599655151367)
                curveTo(15.64050579071045,16.56265640258789,14.870183944702148,16.0,14.0,16.0)
                lineTo(2.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.5,8.0)
                curveTo(18.20539093017578,7.059479236602783,19.47079086303711,6.737518787384033,20.539905548095703,7.226545333862305)
                curveTo(21.60902214050293,7.715571880340576,22.192955017089844,8.883440017700195,21.942707061767578,10.032148361206055)
                curveTo(21.692459106445312,11.180856704711914,20.67565155029297,12.0,19.5,12.0)
                lineTo(2.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.800000190734863,4.400000095367432)
                curveTo(10.496147155761719,3.877889394760132,11.44999885559082,3.8658206462860107,12.159133911132812,4.370150089263916)
                curveTo(12.868268013000488,4.874480247497559,13.169926643371582,5.779455184936523,12.905217170715332,6.608399868011475)
                curveTo(12.640506744384766,7.437344551086426,11.870183944702148,8.0,11.0,8.0)
                lineTo(2.0,8.0)
            }
}

public val LucideIcons.All.WindDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Wind: ImageVector
    @Composable get() = WindDefinition.asImageVector()
