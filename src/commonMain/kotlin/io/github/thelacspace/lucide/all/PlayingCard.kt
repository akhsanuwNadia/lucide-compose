package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PlayingCard") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.831999778747559,8.444999694824219)
                curveTo(12.658559799194336,8.185134887695312,12.373632431030273,8.021265029907227,12.061797142028809,8.002032279968262)
                curveTo(11.749961853027344,7.982800483703613,11.447057723999023,8.110417366027832,11.243000030517578,8.347000122070312)
                lineTo(9.168000221252441,11.444999694824219)
                curveTo(8.943800926208496,11.781036376953125,8.943800926208496,12.218962669372559,9.168000221252441,12.554999351501465)
                lineTo(11.168000221252441,15.554999351501465)
                curveTo(11.353473663330078,15.833154678344727,11.665678977966309,16.00022315979004,12.0,16.00022315979004)
                curveTo(12.334321975708008,16.00022315979004,12.646527290344238,15.833154678344727,12.832000732421875,15.554999351501465)
                lineTo(14.832000732421875,12.554999351501465)
                curveTo(15.05620002746582,12.218962669372559,15.05620002746582,11.781036376953125,14.832000732421875,11.444999694824219)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,2.0)
                lineTo(17.0,2.0)
                lineTo(19.0,2.0)
                lineTo(19.0,22.0)
                lineTo(17.0,22.0)
                lineTo(7.0,22.0)
                lineTo(5.0,22.0)
                lineTo(5.0,2.0)
                lineTo(7.0,2.0)
                close()
            }
}

public val LucideIcons.All.PlayingCardDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PlayingCard: ImageVector
    @Composable get() = PlayingCardDefinition.asImageVector()
