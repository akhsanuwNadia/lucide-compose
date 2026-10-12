package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TubeLotion") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,18.0)
                lineTo(15.0,21.0)
                curveTo(15.0,21.552284240722656,14.552285194396973,22.0,14.0,22.0)
                lineTo(10.0,22.0)
                curveTo(9.447714805603027,22.0,9.0,21.552284240722656,9.0,21.0)
                lineTo(9.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,2.0)
                curveTo(17.757543563842773,1.9999998807907104,18.450071334838867,2.428004503250122,18.788854598999023,3.1055727005004883)
                curveTo(19.12763786315918,3.7831406593322754,19.054527282714844,4.593964576721191,18.600000381469727,5.199999809265137)
                curveTo(17.56142234802246,6.584769248962402,17.0,8.269038200378418,17.0,10.0)
                lineTo(17.0,16.0)
                curveTo(17.0,17.104570388793945,16.104570388793945,18.0,15.0,18.0)
                lineTo(9.0,18.0)
                curveTo(7.895430564880371,18.0,7.0,17.104570388793945,7.0,16.0)
                lineTo(7.0,10.0)
                curveTo(7.0,8.269038200378418,6.438577175140381,6.584769248962402,5.400000095367432,5.199999809265137)
                curveTo(4.945473670959473,4.593964576721191,4.872361660003662,3.7831408977508545,5.211145877838135,3.1055727005004883)
                curveTo(5.549929618835449,2.428004741668701,6.242455959320068,2.0,7.0,2.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,10.0)
                curveTo(8.59932804107666,9.32998275756836,10.40067195892334,9.32998275756836,12.0,10.0)
                curveTo(13.59932804107666,10.67001724243164,15.40067195892334,10.67001724243164,17.0,10.0)
            }
}

public val LucideIcons.All.TubeLotionDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TubeLotion: ImageVector
    @Composable get() = TubeLotionDefinition.asImageVector()
