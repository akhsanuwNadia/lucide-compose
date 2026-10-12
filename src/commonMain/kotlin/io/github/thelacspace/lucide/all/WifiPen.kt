package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("WifiPen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,8.819999694824219)
                curveTo(7.6940131187438965,3.7271194458007812,16.305986404418945,3.7271194458007812,22.0,8.819999694824219)
            }
            lucidePath(strokeWidth) {
                moveTo(21.378000259399414,16.625999450683594)
                curveTo(22.20121192932129,15.795392036437988,22.19821548461914,14.455619812011719,21.37129783630371,13.628702163696289)
                curveTo(20.54438018798828,12.801783561706543,19.204608917236328,12.798788070678711,18.374000549316406,13.621999740600586)
                lineTo(14.36400032043457,17.63399887084961)
                curveTo(14.12624740600586,17.871620178222656,13.952220916748047,18.165332794189453,13.858000755310059,18.487998962402344)
                lineTo(13.021000862121582,21.35799789428711)
                curveTo(12.969882011413574,21.533262252807617,13.018352508544922,21.722455978393555,13.147446632385254,21.851551055908203)
                curveTo(13.276541709899902,21.98064613342285,13.46573543548584,22.029117584228516,13.641000747680664,21.977998733520508)
                lineTo(16.511001586914062,21.14099884033203)
                curveTo(16.833667755126953,21.046777725219727,17.12738037109375,20.872751235961914,17.365001678466797,20.634998321533203)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,12.859000205993652)
                curveTo(7.77240514755249,10.143786430358887,11.865338325500488,9.277643203735352,15.5,10.63700008392334)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5,16.429000854492188)
                curveTo(9.311152458190918,15.633012771606445,10.369272232055664,15.137106895446777,11.5,15.023000717163086)
            }
}

public val LucideIcons.All.WifiPenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.WifiPen: ImageVector
    @Composable get() = WifiPenDefinition.asImageVector()
