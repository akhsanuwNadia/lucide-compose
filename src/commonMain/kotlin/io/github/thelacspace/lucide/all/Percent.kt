package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Percent") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0,5.0)
                lineTo(5.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,6.5)
                curveTo(3.9959936141967773,7.395827293395996,4.471612930297852,8.225325584411621,5.246761322021484,8.674399375915527)
                curveTo(6.021909713745117,9.12347412109375,6.978090286254883,9.12347412109375,7.753238677978516,8.674399375915527)
                curveTo(8.528387069702148,8.225325584411621,9.004006385803223,7.395827293395996,9.0,6.5)
                curveTo(9.004006385803223,5.604172706604004,8.528387069702148,4.774674415588379,7.753238677978516,4.3256001472473145)
                curveTo(6.978090286254883,3.876526117324829,6.021909713745117,3.876526117324829,5.246761322021484,4.3256001472473145)
                curveTo(4.471612930297852,4.774674415588379,3.9959936141967773,5.604172706604004,4.0,6.5)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,17.5)
                curveTo(14.995993614196777,18.395828247070312,15.471612930297852,19.225324630737305,16.246761322021484,19.674400329589844)
                curveTo(17.021909713745117,20.12347412109375,17.978090286254883,20.12347412109375,18.753238677978516,19.674400329589844)
                curveTo(19.52838706970215,19.225324630737305,20.004005432128906,18.395828247070312,20.0,17.5)
                curveTo(20.004005432128906,16.604171752929688,19.52838706970215,15.774674415588379,18.753238677978516,15.325600624084473)
                curveTo(17.978090286254883,14.87652587890625,17.021909713745117,14.87652587890625,16.246761322021484,15.325600624084473)
                curveTo(15.471612930297852,15.774674415588379,14.995993614196777,16.604171752929688,15.0,17.5)
            }
}

public val LucideIcons.All.PercentDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Percent: ImageVector
    @Composable get() = PercentDefinition.asImageVector()
