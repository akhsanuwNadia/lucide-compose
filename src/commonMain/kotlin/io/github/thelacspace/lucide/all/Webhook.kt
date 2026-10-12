package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Webhook") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0,16.979999542236328)
                lineTo(12.010000228881836,16.979999542236328)
                curveTo(10.90999984741211,16.979999542236328,10.0600004196167,17.920000076293945,9.530000686645508,18.8799991607666)
                curveTo(8.666756629943848,20.49980354309082,6.811878204345703,21.324234008789062,5.031070709228516,20.879623413085938)
                curveTo(3.25026273727417,20.435014724731445,2.000572919845581,18.83547019958496,2.0,17.0)
                curveTo(2.009999990463257,16.299999237060547,2.200000047683716,15.600000381469727,2.569999933242798,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,17.0)
                lineTo(9.130000114440918,11.219999313354492)
                curveTo(9.65999984741211,10.249999046325684,9.230000495910645,9.039999008178711,8.630000114440918,8.119998931884766)
                curveTo(7.859055042266846,6.887026309967041,7.817971706390381,5.33278751373291,8.522703170776367,4.060808181762695)
                curveTo(9.227435111999512,2.7888288497924805,10.566954612731934,1.9995040893554688,12.021113395690918,1.9993358850479126)
                curveTo(13.475272178649902,1.9991676807403564,14.814974784851074,2.7881827354431152,15.520000457763672,4.059998989105225)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,6.0)
                lineTo(15.130000114440918,11.729999542236328)
                curveTo(15.65999984741211,12.699999809265137,16.899999618530273,13.0,18.0,13.0)
                curveTo(20.20215606689453,13.009848594665527,21.98215103149414,14.797821998596191,21.98215103149414,17.0)
                curveTo(21.98215103149414,19.202178955078125,20.20215606689453,20.99015235900879,18.0,21.0)
            }
}

public val LucideIcons.All.WebhookDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Webhook: ImageVector
    @Composable get() = WebhookDefinition.asImageVector()
