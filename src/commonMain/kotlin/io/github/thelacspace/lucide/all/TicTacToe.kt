package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TicTacToe") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,16.0)
                lineTo(16.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,21.0)
                lineTo(16.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,12.0)
                lineTo(2.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,3.0)
                lineTo(3.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,8.0)
                lineTo(3.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,5.5)
                curveTo(15.995993614196777,6.395827293395996,16.47161293029785,7.225325584411621,17.246761322021484,7.6743998527526855)
                curveTo(18.021909713745117,8.12347412109375,18.978090286254883,8.12347412109375,19.753238677978516,7.6743998527526855)
                curveTo(20.52838706970215,7.225325584411621,21.004005432128906,6.395827293395996,21.0,5.5)
                curveTo(21.004005432128906,4.604172706604004,20.52838706970215,3.774674415588379,19.753238677978516,3.3256003856658936)
                curveTo(18.978090286254883,2.876526117324829,18.021909713745117,2.876526117324829,17.246761322021484,3.3256003856658936)
                curveTo(16.47161293029785,3.774674415588379,15.995993614196777,4.604172706604004,16.0,5.5)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,18.5)
                curveTo(2.9959936141967773,19.395828247070312,3.4716129302978516,20.225324630737305,4.246761322021484,20.674400329589844)
                curveTo(5.021909713745117,21.12347412109375,5.978090286254883,21.12347412109375,6.753238677978516,20.674400329589844)
                curveTo(7.528387069702148,20.225324630737305,8.004006385803223,19.395828247070312,8.0,18.5)
                curveTo(8.004006385803223,17.604171752929688,7.528387069702148,16.774675369262695,6.753238677978516,16.325599670410156)
                curveTo(5.978090286254883,15.87652587890625,5.021909713745117,15.87652587890625,4.246761322021484,16.325599670410156)
                curveTo(3.4716129302978516,16.774675369262695,2.9959936141967773,17.604171752929688,3.0,18.5)
            }
}

public val LucideIcons.All.TicTacToeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TicTacToe: ImageVector
    @Composable get() = TicTacToeDefinition.asImageVector()
