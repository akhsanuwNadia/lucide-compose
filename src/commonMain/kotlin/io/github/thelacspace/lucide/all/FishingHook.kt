package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FishingHook") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.586000442504883,11.413999557495117)
                lineTo(11.656000137329102,17.3439998626709)
                curveTo(9.443995475769043,19.53630828857422,5.8760271072387695,19.528329849243164,3.6738486289978027,17.32615089416504)
                curveTo(1.471670389175415,15.12397289276123,1.4636921882629395,11.556004524230957,3.6560001373291016,9.343999862670898)
                lineTo(6.793000221252441,6.206999778747559)
                curveTo(6.995203495025635,6.004735469818115,7.299350261688232,5.944218158721924,7.563577651977539,6.053674697875977)
                curveTo(7.827805519104004,6.163131237030029,8.00006103515625,6.4209980964660645,8.0,6.706999778747559)
                lineTo(8.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.413999557495117,8.586000442504883)
                lineTo(22.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,10.0)
                curveTo(16.996795654296875,10.71666145324707,17.377290725708008,11.380260467529297,17.99740982055664,11.739520072937012)
                curveTo(18.61752700805664,12.09877872467041,19.38247299194336,12.09877872467041,20.00259017944336,11.739520072937012)
                curveTo(20.622709274291992,11.380260467529297,21.003204345703125,10.71666145324707,21.0,10.0)
                curveTo(21.003204345703125,9.28333854675293,20.622709274291992,8.619739532470703,20.00259017944336,8.260479927062988)
                curveTo(19.38247299194336,7.901220798492432,18.61752700805664,7.901220798492432,17.99740982055664,8.260479927062988)
                curveTo(17.377290725708008,8.619739532470703,16.996795654296875,9.28333854675293,17.0,10.0)
            }
}

public val LucideIcons.All.FishingHookDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FishingHook: ImageVector
    @Composable get() = FishingHookDefinition.asImageVector()
