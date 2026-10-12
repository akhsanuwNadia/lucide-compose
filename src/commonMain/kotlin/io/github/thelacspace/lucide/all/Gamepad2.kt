package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Gamepad2") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,11.0)
                lineTo(10.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,9.0)
                lineTo(8.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,12.0)
                lineTo(15.010000228881836,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,10.0)
                lineTo(18.010000228881836,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.31999969482422,5.0)
                lineTo(6.679999828338623,5.0)
                curveTo(4.629961013793945,5.0004777908325195,2.9121286869049072,6.5507588386535645,2.7019999027252197,8.59000015258789)
                curveTo(2.69599986076355,8.642000198364258,2.691999912261963,8.690999984741211,2.684999942779541,8.742000579833984)
                curveTo(2.6040000915527344,9.416000366210938,2.0,14.456000328063965,2.0,16.0)
                curveTo(2.0,17.6568546295166,3.3431458473205566,19.0,5.0,19.0)
                curveTo(6.0,19.0,6.5,18.5,7.0,18.0)
                lineTo(8.413999557495117,16.586000442504883)
                curveTo(8.788985252380371,16.210901260375977,9.29761028289795,16.000112533569336,9.82800006866455,16.0)
                lineTo(14.17199993133545,16.0)
                curveTo(14.70238971710205,16.000112533569336,15.211014747619629,16.210901260375977,15.586000442504883,16.586000442504883)
                lineTo(17.0,18.0)
                curveTo(17.5,18.5,18.0,19.0,19.0,19.0)
                curveTo(20.6568546295166,19.0,22.0,17.6568546295166,22.0,16.0)
                curveTo(22.0,14.454999923706055,21.395999908447266,9.416000366210938,21.315000534057617,8.742000579833984)
                curveTo(21.308000564575195,8.692000389099121,21.304000854492188,8.642000198364258,21.29800033569336,8.5910005569458)
                curveTo(21.088348388671875,6.55136251449585,19.370384216308594,5.000530242919922,17.31999969482422,5.0)
                close()
            }
}

public val LucideIcons.All.Gamepad2Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Gamepad2: ImageVector
    @Composable get() = Gamepad2Definition.asImageVector()
