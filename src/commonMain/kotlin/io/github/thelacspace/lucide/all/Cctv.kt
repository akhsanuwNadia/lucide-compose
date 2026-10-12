package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cctv") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.75,12.0)
                lineTo(20.381999969482422,12.0)
                curveTo(20.728439331054688,12.000185012817383,21.05010414123535,12.179668426513672,21.232194900512695,12.474394798278809)
                curveTo(21.41428565979004,12.769121170043945,21.430858612060547,13.13709831237793,21.275999069213867,13.447000503540039)
                lineTo(19.24199867248535,17.516000747680664)
                curveTo(19.085126876831055,17.82961654663086,18.77544593811035,18.038150787353516,18.425859451293945,18.06557846069336)
                curveTo(18.076271057128906,18.09300422668457,17.73785972595215,17.93531608581543,17.533998489379883,17.650001525878906)
                lineTo(15.409997940063477,14.680001258850098)
            }
            lucidePath(strokeWidth) {
                moveTo(17.106000900268555,9.053000450134277)
                curveTo(17.59952735900879,9.300058364868164,17.79958724975586,9.900237083435059,17.553001403808594,10.394000053405762)
                lineTo(14.447001457214355,16.604999542236328)
                curveTo(14.32835578918457,16.842273712158203,14.120292663574219,17.02267837524414,13.868603706359863,17.10651397705078)
                curveTo(13.616914749145508,17.19034767150879,13.342228889465332,17.170738220214844,13.105001449584961,17.052000045776367)
                lineTo(3.609999895095825,12.300000190734863)
                curveTo(2.1741814613342285,11.576774597167969,1.5930711030960083,9.828972816467285,2.309999942779541,8.390000343322754)
                lineTo(3.690000057220459,5.599999904632568)
                curveTo(4.03737211227417,4.907725811004639,4.645554542541504,4.3818254470825195,5.380721092224121,4.1380205154418945)
                curveTo(6.115887641906738,3.8942151069641113,6.917799472808838,3.952482223510742,7.610000133514404,4.300000190734863)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,19.0)
                lineTo(5.760000228881836,19.0)
                curveTo(6.5203142166137695,19.005290985107422,7.217869281768799,18.579008102416992,7.560000419616699,17.899999618530273)
                lineTo(9.0,15.0)
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

public val LucideIcons.All.CctvDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cctv: ImageVector
    @Composable get() = CctvDefinition.asImageVector()
