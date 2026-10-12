package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShieldCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.928999900817871,14.467000007629395)
                lineTo(10.545999526977539,15.390999794006348)
            }
            lucidePath(strokeWidth) {
                moveTo(10.928999900817871,8.92300033569336)
                lineTo(10.545999526977539,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.225000381469727,8.92300033569336)
                lineTo(13.607999801635742,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.607000350952148,15.390999794006348)
                lineTo(13.225000381469727,14.467000007629395)
            }
            lucidePath(strokeWidth) {
                moveTo(14.848999977111816,10.54699993133545)
                lineTo(15.772000312805176,10.163999557495117)
            }
            lucidePath(strokeWidth) {
                moveTo(14.848999977111816,12.843000411987305)
                lineTo(15.772000312805176,13.226000785827637)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,13.0)
                curveTo(20.0,18.0,16.5,20.5,12.34000015258789,21.950000762939453)
                curveTo(12.122162818908691,22.023818969726562,11.885537147521973,22.020286560058594,11.670000076293945,21.940000534057617)
                curveTo(7.5,20.5,4.0,18.0,4.0,13.0)
                lineTo(4.0,6.0)
                curveTo(4.0,5.4477152824401855,4.4477152824401855,5.0,5.0,5.0)
                curveTo(7.0,5.0,9.5,3.799999952316284,11.239999771118164,2.2799999713897705)
                curveTo(11.67767333984375,1.9060670137405396,12.32232666015625,1.9060670137405396,12.760000228881836,2.2799999713897705)
                curveTo(14.510000228881836,3.809999942779541,17.0,5.0,19.0,5.0)
                curveTo(19.552284240722656,5.0,20.0,5.4477152824401855,20.0,6.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.305000305175781,10.54699993133545)
                lineTo(8.381999969482422,10.163999557495117)
            }
            lucidePath(strokeWidth) {
                moveTo(9.305000305175781,12.843000411987305)
                lineTo(8.381999969482422,13.226000785827637)
            }
            lucidePath(strokeWidth) {
                moveTo(9.07699966430664,11.694999694824219)
                curveTo(9.072192192077637,12.76999282836914,9.642934799194336,13.765390396118164,10.573113441467285,14.304279327392578)
                curveTo(11.503291130065918,14.843168258666992,12.650708198547363,14.843168258666992,13.580885887145996,14.304279327392578)
                curveTo(14.511064529418945,13.765390396118164,15.081807136535645,12.76999282836914,15.07699966430664,11.694999694824219)
                curveTo(15.081807136535645,10.620006561279297,14.511064529418945,9.624608993530273,13.580885887145996,9.08572006225586)
                curveTo(12.650708198547363,8.546831130981445,11.503291130065918,8.546831130981445,10.573113441467285,9.08572006225586)
                curveTo(9.642934799194336,9.624608993530273,9.072192192077637,10.620006561279297,9.07699966430664,11.694999694824219)
            }
}

public val LucideIcons.All.ShieldCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShieldCog: ImageVector
    @Composable get() = ShieldCogDefinition.asImageVector()
