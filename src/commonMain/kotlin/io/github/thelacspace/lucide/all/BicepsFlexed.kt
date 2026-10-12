package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BicepsFlexed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.409000396728516,13.017000198364258)
                curveTo(13.348638534545898,10.838915824890137,15.68937873840332,9.620853424072266,18.012371063232422,10.101146697998047)
                curveTo(20.33536148071289,10.581439971923828,22.00114631652832,12.627876281738281,22.0,15.0)
                curveTo(22.0,18.865999221801758,18.0,22.0,13.0,22.0)
                curveTo(8.92300033569336,22.0,4.8470001220703125,21.18000030517578,2.628999710083008,19.538000106811523)
                curveTo(2.2029995918273926,19.222000122070312,1.997999668121338,18.70599937438965,2.008999824523926,18.176000595092773)
                curveTo(2.118000030517578,12.722999572753906,2.627000093460083,2.0,10.0,2.0)
                curveTo(11.656854629516602,2.0,13.0,3.3431458473205566,13.0,5.0)
                curveTo(13.0,6.104569435119629,12.104569435119629,7.0,11.0,7.0)
                curveTo(9.895000457763672,7.0,9.359999656677246,6.555999755859375,9.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,14.0)
                curveTo(13.777315139770508,13.082473754882812,12.202079772949219,12.774681091308594,10.723950386047363,13.164483070373535)
                curveTo(9.245820045471191,13.554286003112793,8.027219772338867,14.598849296569824,7.415999889373779,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.96399974822998,6.824999809265137)
                curveTo(8.019000053405762,7.9770002365112305,9.5,13.0,8.0,15.0)
            }
}

public val LucideIcons.All.BicepsFlexedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BicepsFlexed: ImageVector
    @Composable get() = BicepsFlexedDefinition.asImageVector()
