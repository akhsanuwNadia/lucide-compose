package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CctvOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.309000015258789,6.6519999504089355)
                lineTo(17.105998992919922,9.052999496459961)
                curveTo(17.599525451660156,9.300057411193848,17.799585342407227,9.900236129760742,17.55299949645996,10.393999099731445)
                lineTo(17.052000045776367,11.394999504089355)
                lineTo(17.656999588012695,12.0)
                lineTo(20.381999969482422,12.0)
                curveTo(20.728439331054688,12.000185012817383,21.05010414123535,12.179668426513672,21.232194900512695,12.474394798278809)
                curveTo(21.41428565979004,12.769121170043945,21.430858612060547,13.13709831237793,21.275999069213867,13.447000503540039)
                lineTo(20.551998138427734,14.895000457763672)
            }
            lucidePath(strokeWidth) {
                moveTo(15.166000366210938,15.166000366210938)
                lineTo(14.447000503540039,16.604999542236328)
                curveTo(14.328354835510254,16.842273712158203,14.120291709899902,17.02267837524414,13.868602752685547,17.10651397705078)
                curveTo(13.616913795471191,17.19034767150879,13.342227935791016,17.170738220214844,13.105000495910645,17.052000045776367)
                lineTo(3.609999895095825,12.300000190734863)
                curveTo(2.1741814613342285,11.576774597167969,1.5930711030960083,9.828972816467285,2.309999942779541,8.390000343322754)
                lineTo(3.690000057220459,5.599999904632568)
                curveTo(3.8949923515319824,5.190220832824707,4.194164752960205,4.8348469734191895,4.563000202178955,4.562999725341797)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,19.0)
                lineTo(5.760000228881836,19.0)
                curveTo(6.5203142166137695,19.005290985107422,7.217869281768799,18.579008102416992,7.560000419616699,17.899999618530273)
                lineTo(9.00100040435791,14.99799919128418)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,21.0)
                lineTo(2.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,9.0)
                lineTo(7.010000228881836,9.0)
            }
}

public val LucideIcons.All.CctvOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CctvOff: ImageVector
    @Composable get() = CctvOffDefinition.asImageVector()
