package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BeerOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0,13.0)
                lineTo(13.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,11.470000267028809)
                lineTo(17.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,11.0)
                lineTo(18.0,11.0)
                curveTo(19.01413345336914,10.99990463256836,19.959665298461914,11.512173652648926,20.513469696044922,12.361742973327637)
                curveTo(21.067272186279297,13.211313247680664,21.15437126159668,14.283164024353027,20.744998931884766,15.211000442504883)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,8.0)
                lineTo(5.0,20.0)
                curveTo(5.0,21.104570388793945,5.895430564880371,22.0,7.0,22.0)
                lineTo(15.0,22.0)
                curveTo(16.104570388793945,22.0,17.0,21.104570388793945,17.0,20.0)
                lineTo(17.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.535999774932861,7.534999847412109)
                curveTo(6.765999794006348,7.64900016784668,6.1539998054504395,8.0,5.5,8.0)
                curveTo(4.488699436187744,8.000188827514648,3.5768942832946777,7.391080856323242,3.1898608207702637,6.4567718505859375)
                curveTo(2.8028273582458496,5.522462368011475,3.016808032989502,4.44700288772583,3.7319998741149902,3.7319998741149902)
            }
            lucidePath(strokeWidth) {
                moveTo(8.72700023651123,3.2039999961853027)
                curveTo(9.305999755859375,2.7669999599456787,9.885000228881836,2.0,11.0,2.0)
                curveTo(12.559999465942383,2.0,13.0,3.5,14.0,3.5)
                curveTo(15.0,3.5,15.720000267028809,3.0,16.5,3.0)
                curveTo(17.395828247070312,2.9959936141967773,18.225324630737305,3.4716129302978516,18.674400329589844,4.246761322021484)
                curveTo(19.12347412109375,5.021909713745117,19.12347412109375,5.978090286254883,18.674400329589844,6.753238677978516)
                curveTo(18.225324630737305,7.528387069702148,17.395828247070312,8.004006385803223,16.5,8.0)
                curveTo(15.720000267028809,8.0,15.0,7.5,14.0,7.5)
                curveTo(13.715198516845703,7.501739025115967,13.4319486618042,7.542107105255127,13.157999992370605,7.619999885559082)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,14.600000381469727)
                lineTo(9.0,18.0)
            }
}

public val LucideIcons.All.BeerOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BeerOff: ImageVector
    @Composable get() = BeerOffDefinition.asImageVector()
