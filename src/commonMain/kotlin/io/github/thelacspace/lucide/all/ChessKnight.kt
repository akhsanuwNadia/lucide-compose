package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChessKnight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,20.0)
                curveTo(5.0,18.895429611206055,5.895430564880371,18.0,7.0,18.0)
                lineTo(17.0,18.0)
                curveTo(18.104570388793945,18.0,19.0,18.895429611206055,19.0,20.0)
                lineTo(19.0,21.0)
                curveTo(19.0,21.552284240722656,18.552284240722656,22.0,18.0,22.0)
                lineTo(6.0,22.0)
                curveTo(5.4477152824401855,22.0,5.0,21.552284240722656,5.0,21.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.5,18.0)
                curveTo(17.5,16.0,19.0,13.0,19.0,9.0)
                curveTo(19.0,5.134006977081299,15.86599349975586,2.0,12.0,2.0)
                lineTo(6.635000228881836,2.0)
                curveTo(6.247093677520752,2.000145435333252,5.894266128540039,2.2246103286743164,5.729756832122803,2.5759055614471436)
                curveTo(5.565248012542725,2.9272005558013916,5.618740081787109,3.341942310333252,5.867000102996826,3.6399998664855957)
                lineTo(7.0,5.0)
                lineTo(4.680000305175781,10.802000045776367)
                curveTo(4.295270919799805,11.762971878051758,4.707366466522217,12.858712196350098,5.630000114440918,13.32800006866455)
                lineTo(8.5,14.784000396728516)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,5.0)
                lineTo(16.424999237060547,3.575000047683716)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,8.0)
                lineTo(18.530000686645508,6.470000267028809)
            }
            lucidePath(strokeWidth) {
                moveTo(9.713000297546387,12.1850004196167)
                lineTo(7.0,18.0)
            }
}

public val LucideIcons.All.ChessKnightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChessKnight: ImageVector
    @Composable get() = ChessKnightDefinition.asImageVector()
