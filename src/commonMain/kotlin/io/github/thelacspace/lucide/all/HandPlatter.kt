package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HandPlatter") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,3.0)
                lineTo(12.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.399999618530273,17.399999618530273)
                lineTo(18.600000381469727,14.59999942779541)
                curveTo(19.11733627319336,14.096012115478516,19.864791870117188,13.907353401184082,20.55933952331543,14.105457305908203)
                curveTo(21.25388526916504,14.30356216430664,21.789344787597656,14.858146667480469,21.96296501159668,15.55921459197998)
                curveTo(22.136585235595703,16.260282516479492,21.921823501586914,17.000659942626953,21.399999618530273,17.5)
                lineTo(17.799999237060547,20.799999237060547)
                curveTo(17.099998474121094,21.599998474121094,16.099998474121094,22.0,14.999999046325684,22.0)
                lineTo(10.999999046325684,22.0)
                curveTo(9.899998664855957,22.0,8.899999618530273,21.600000381469727,8.19999885559082,20.799999237060547)
                lineTo(6.897998809814453,19.33599853515625)
                curveTo(6.708392143249512,19.122482299804688,6.436551570892334,19.00020980834961,6.151000022888184,19.0)
                lineTo(5.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,14.0)
                lineTo(14.0,14.0)
                curveTo(15.101078033447266,14.004923820495605,15.99107551574707,14.898910522460938,15.99107551574707,16.0)
                curveTo(15.99107551574707,17.101089477539062,15.101078033447266,17.995075225830078,14.0,18.0)
                lineTo(12.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,10.0)
                lineTo(20.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,10.0)
                curveTo(5.017234802246094,6.146226406097412,8.146187782287598,3.0312349796295166,12.0,3.0312349796295166)
                curveTo(15.853812217712402,3.0312349796295166,18.982765197753906,6.146226406097412,19.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,14.0)
                lineTo(5.0,20.0)
                curveTo(5.0,20.552284240722656,4.5522847175598145,21.0,4.0,21.0)
                lineTo(2.0,21.0)
            }
}

public val LucideIcons.All.HandPlatterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HandPlatter: ImageVector
    @Composable get() = HandPlatterDefinition.asImageVector()
