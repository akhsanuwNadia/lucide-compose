package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TvMinimalPlay") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.032999992370605,9.4399995803833)
                curveTo(15.232872009277344,9.555658340454102,15.355949401855469,9.769076347351074,15.355949401855469,10.0)
                curveTo(15.355949401855469,10.23092269897461,15.232872009277344,10.444340705871582,15.032999992370605,10.559999465942383)
                lineTo(10.968000411987305,12.911999702453613)
                curveTo(10.768187522888184,13.027602195739746,10.521827697753906,13.027605056762695,10.32201099395752,12.912009239196777)
                curveTo(10.122194290161133,12.796412467956543,9.9993896484375,12.582842826843262,10.0,12.351999282836914)
                lineTo(10.0,7.6479997634887695)
                curveTo(9.999597549438477,7.417465686798096,10.122265815734863,7.204244136810303,10.321762084960938,7.088713645935059)
                curveTo(10.521259307861328,6.9731831550598145,10.767248153686523,6.9729108810424805,10.967000007629395,7.0879998207092285)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,21.0)
                lineTo(17.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,3.0)
                lineTo(20.0,3.0)
                lineTo(22.0,3.0)
                lineTo(22.0,17.0)
                lineTo(20.0,17.0)
                lineTo(4.0,17.0)
                lineTo(2.0,17.0)
                lineTo(2.0,3.0)
                lineTo(4.0,3.0)
                close()
            }
}

public val LucideIcons.All.TvMinimalPlayDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TvMinimalPlay: ImageVector
    @Composable get() = TvMinimalPlayDefinition.asImageVector()
