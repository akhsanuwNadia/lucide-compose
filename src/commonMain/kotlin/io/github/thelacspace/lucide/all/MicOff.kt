package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MicOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,19.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,9.34000015258789)
                lineTo(15.0,5.0)
                curveTo(14.991645812988281,3.613412857055664,14.034113883972168,2.413214683532715,12.684019088745117,2.097083568572998)
                curveTo(11.333924293518066,1.7809522151947021,9.943085670471191,2.431267738342285,9.319999694824219,3.6700000762939453)
            }
            lucidePath(strokeWidth) {
                moveTo(16.950000762939453,16.950000762939453)
                curveTo(14.948005676269531,18.952199935913086,11.937002182006836,19.551189422607422,9.321146965026855,18.467634201049805)
                curveTo(6.705292701721191,17.38408088684082,4.999794960021973,14.831393241882324,5.0,12.0)
                lineTo(5.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.889999389648438,13.229999542236328)
                curveTo(18.96282958984375,12.824041366577148,18.99964141845703,12.412440299987793,19.0,12.0)
                lineTo(19.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,9.0)
                lineTo(9.0,12.0)
                curveTo(9.001066207885742,13.212566375732422,9.731980323791504,14.305262565612793,10.852306365966797,14.769147872924805)
                curveTo(11.972631454467773,15.2330322265625,13.262052536010742,14.97688102722168,14.119999885559082,14.119999885559082)
            }
}

public val LucideIcons.All.MicOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MicOff: ImageVector
    @Composable get() = MicOffDefinition.asImageVector()
