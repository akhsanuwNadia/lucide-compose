package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShieldCogCorner") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,22.0)
                curveTo(7.194000244140625,20.549999237060547,4.0,18.034000396728516,4.0,13.0)
                lineTo(4.0,6.0)
                curveTo(4.0,5.4477152824401855,4.4477152824401855,5.0,5.0,5.0)
                curveTo(7.0,5.0,9.5,3.799999952316284,11.239999771118164,2.2799999713897705)
                curveTo(11.67767333984375,1.9060670137405396,12.32232666015625,1.9060670137405396,12.760000228881836,2.2799999713897705)
                curveTo(14.510000228881836,3.809999942779541,17.0,5.0,19.0,5.0)
                curveTo(19.552284240722656,5.0,20.0,5.4477152824401855,20.0,6.0)
                lineTo(20.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.92300033569336,16.547000885009766)
                lineTo(14.0,16.163999557495117)
            }
            lucidePath(strokeWidth) {
                moveTo(14.92300033569336,18.843000411987305)
                lineTo(14.0,19.22599983215332)
            }
            lucidePath(strokeWidth) {
                moveTo(16.547000885009766,14.92300033569336)
                lineTo(16.163999557495117,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.547000885009766,20.466999053955078)
                lineTo(16.16400146484375,21.39099884033203)
            }
            lucidePath(strokeWidth) {
                moveTo(18.843000411987305,14.92300033569336)
                lineTo(19.22599983215332,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.225000381469727,21.391000747680664)
                lineTo(18.843000411987305,20.46700096130371)
            }
            lucidePath(strokeWidth) {
                moveTo(20.466999053955078,16.547000885009766)
                lineTo(21.389999389648438,16.16400146484375)
            }
            lucidePath(strokeWidth) {
                moveTo(20.466999053955078,18.843000411987305)
                lineTo(21.389999389648438,19.22599983215332)
            }
            lucidePath(strokeWidth) {
                moveTo(14.694999694824219,17.69499969482422)
                curveTo(14.690192222595215,18.76999282836914,15.260934829711914,19.765390396118164,16.191112518310547,20.304279327392578)
                curveTo(17.121292114257812,20.843168258666992,18.268707275390625,20.843168258666992,19.19888687133789,20.304279327392578)
                curveTo(20.129064559936523,19.765390396118164,20.69980812072754,18.76999282836914,20.69499969482422,17.69499969482422)
                curveTo(20.69980812072754,16.620006561279297,20.129064559936523,15.624608993530273,19.19888687133789,15.08572006225586)
                curveTo(18.268707275390625,14.546831130981445,17.121292114257812,14.546831130981445,16.191112518310547,15.08572006225586)
                curveTo(15.260934829711914,15.624608993530273,14.690192222595215,16.620006561279297,14.694999694824219,17.69499969482422)
            }
}

public val LucideIcons.All.ShieldCogCornerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShieldCogCorner: ImageVector
    @Composable get() = ShieldCogCornerDefinition.asImageVector()
