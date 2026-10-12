package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Guitar") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.899999618530273,12.100000381469727)
                lineTo(16.413999557495117,7.586000442504883)
            }
            lucidePath(strokeWidth) {
                moveTo(20.100000381469727,2.299999952316284)
                curveTo(19.711156845092773,1.9188573360443115,19.088844299316406,1.9188573360443115,18.700000762939453,2.299999952316284)
                lineTo(17.586000442504883,3.4140000343322754)
                curveTo(17.210901260375977,3.78898549079895,17.000112533569336,4.297610282897949,17.0,4.828000068664551)
                lineTo(17.0,6.171999931335449)
                curveTo(16.999887466430664,6.702389717102051,16.789098739624023,7.211014747619629,16.413999557495117,7.585999965667725)
                curveTo(16.788984298706055,7.210901260375977,17.297609329223633,7.000113487243652,17.827999114990234,7.0)
                lineTo(19.171998977661133,7.0)
                curveTo(19.702388763427734,6.999886512756348,20.211013793945312,6.789098739624023,20.58599853515625,6.414000034332275)
                lineTo(21.700000762939453,5.300000190734863)
                curveTo(22.081144332885742,4.91115665435791,22.081144332885742,4.288843631744385,21.700000762939453,3.9000000953674316)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,16.0)
                lineTo(8.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.229999542236328,9.850000381469727)
                curveTo(8.694720268249512,8.730292320251465,9.787683486938477,8.000335693359375,11.0,8.0)
                curveTo(13.76142406463623,8.0,16.0,10.23857593536377,16.0,13.0)
                curveTo(15.999664306640625,14.212316513061523,15.269707679748535,15.305279731750488,14.149999618530273,15.770000457763672)
                lineTo(13.229999542236328,16.149999618530273)
                curveTo(12.48371410369873,16.461315155029297,11.998315811157227,17.19138526916504,12.0,18.0)
                curveTo(12.0,20.209138870239258,10.209138870239258,22.0,8.0,22.0)
                curveTo(4.686291694641113,22.0,2.0,19.313709259033203,2.0,16.0)
                curveTo(2.0,13.790861129760742,3.790860891342163,12.0,6.0,12.0)
                curveTo(6.808614253997803,12.001684188842773,7.538684368133545,11.51628589630127,7.849999904632568,10.770000457763672)
                close()
            }
}

public val LucideIcons.All.GuitarDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Guitar: ImageVector
    @Composable get() = GuitarDefinition.asImageVector()
