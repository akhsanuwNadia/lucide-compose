package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PlayingCards") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.831999778747559,8.444999694824219)
                curveTo(14.658559799194336,8.185134887695312,14.373632431030273,8.021265029907227,14.061797142028809,8.002032279968262)
                curveTo(13.749961853027344,7.982800483703613,13.447057723999023,8.110417366027832,13.243000030517578,8.347000122070312)
                lineTo(11.168000221252441,11.444999694824219)
                curveTo(10.943800926208496,11.781036376953125,10.943800926208496,12.218962669372559,11.168000221252441,12.554999351501465)
                lineTo(13.168000221252441,15.554999351501465)
                curveTo(13.353473663330078,15.833154678344727,13.665678977966309,16.00022315979004,14.0,16.00022315979004)
                curveTo(14.334321975708008,16.00022315979004,14.646527290344238,15.833154678344727,14.832000732421875,15.554999351501465)
                lineTo(16.832000732421875,12.554999351501465)
                curveTo(17.05620002746582,12.218962669372559,17.05620002746582,11.781036376953125,16.832000732421875,11.444999694824219)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.179999828338623,20.82699966430664)
                lineTo(2.179999828338623,9.82699966430664)
                curveTo(1.7238081693649292,8.821823120117188,2.1682419776916504,7.637113094329834,3.172999858856201,7.179999351501465)
                lineTo(7.0,5.440000057220459)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,2.0)
                lineTo(19.0,2.0)
                lineTo(21.0,2.0)
                lineTo(21.0,22.0)
                lineTo(19.0,22.0)
                lineTo(9.0,22.0)
                lineTo(7.0,22.0)
                lineTo(7.0,2.0)
                lineTo(9.0,2.0)
                close()
            }
}

public val LucideIcons.All.PlayingCardsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PlayingCards: ImageVector
    @Composable get() = PlayingCardsDefinition.asImageVector()
