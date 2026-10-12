package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderBookmark") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,6.0)
                lineTo(12.0,13.750999450683594)
                curveTo(11.999828338623047,13.847373008728027,12.055066108703613,13.935262680053711,12.141979217529297,13.976903915405273)
                curveTo(12.228891372680664,14.018545150756836,12.332000732421875,14.006521224975586,12.406999588012695,13.945999145507812)
                lineTo(14.686999320983887,12.11199951171875)
                curveTo(14.870038032531738,11.964678764343262,15.130960464477539,11.964678764343262,15.31399917602539,12.11199951171875)
                lineTo(17.5939998626709,13.945999145507812)
                curveTo(17.66901397705078,14.005901336669922,17.771703720092773,14.017560005187988,17.85823631286621,13.975997924804688)
                curveTo(17.94477081298828,13.934436798095703,17.999862670898438,13.846996307373047,18.0,13.750999450683594)
                lineTo(18.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,20.0)
                curveTo(21.104570388793945,20.0,22.0,19.104570388793945,22.0,18.0)
                lineTo(22.0,8.0)
                curveTo(22.0,6.895430564880371,21.104570388793945,6.0,20.0,6.0)
                lineTo(12.100000381469727,6.0)
                curveTo(11.420332908630371,6.006663799285889,10.783802032470703,5.667683124542236,10.40999984741211,5.099999904632568)
                lineTo(9.600000381469727,3.9000000953674316)
                curveTo(9.230077743530273,3.3382794857025146,8.60258674621582,3.000110626220703,7.929999828338623,3.0)
                lineTo(4.0,3.0)
                curveTo(2.895430564880371,3.0,2.0,3.895430564880371,2.0,5.0)
                lineTo(2.0,18.0)
                curveTo(2.0,19.104570388793945,2.895430564880371,20.0,4.0,20.0)
                close()
            }
}

public val LucideIcons.All.FolderBookmarkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderBookmark: ImageVector
    @Composable get() = FolderBookmarkDefinition.asImageVector()
