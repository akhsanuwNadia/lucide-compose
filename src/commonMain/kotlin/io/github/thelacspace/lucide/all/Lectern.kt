package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Lectern") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,13.0)
                lineTo(19.0,13.0)
                curveTo(19.865516662597656,12.999795913696289,20.6326904296875,12.442878723144531,20.9010009765625,11.619999885559082)
                lineTo(21.95800018310547,7.286999702453613)
                curveTo(22.048707962036133,6.984241962432861,21.990949630737305,6.656423091888428,21.80223274230957,6.402895927429199)
                curveTo(21.613515853881836,6.149368762969971,21.31605339050293,5.999978065490723,21.0,6.0)
                lineTo(3.0,6.0)
                curveTo(2.683945894241333,5.999978065490723,2.386484146118164,6.149368762969971,2.1977670192718506,6.402895927429199)
                curveTo(2.009049892425537,6.656423091888428,1.951292634010315,6.984241962432861,2.0420000553131104,7.286999702453613)
                lineTo(3.0999999046325684,11.621000289916992)
                curveTo(3.368659734725952,12.443482398986816,4.135750770568848,12.9999361038208,5.000999927520752,13.0)
                lineTo(9.000999450683594,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,22.0)
                lineTo(15.0,11.0)
                curveTo(15.0,10.447714805603027,14.552285194396973,10.0,14.0,10.0)
                lineTo(10.0,10.0)
                curveTo(9.447714805603027,10.0,9.0,10.447714805603027,9.0,11.0)
                lineTo(9.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,22.0)
                lineTo(6.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,6.0)
                lineTo(18.0,3.0)
                curveTo(18.0,2.4477152824401855,17.552284240722656,2.0,17.0,2.0)
                lineTo(14.0,2.0)
            }
}

public val LucideIcons.All.LecternDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Lectern: ImageVector
    @Composable get() = LecternDefinition.asImageVector()
