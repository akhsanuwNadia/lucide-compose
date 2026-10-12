package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquareBookmark") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,3.0)
                lineTo(11.0,10.750999450683594)
                curveTo(10.999828338623047,10.847373008728027,11.055066108703613,10.935262680053711,11.141979217529297,10.976903915405273)
                curveTo(11.228891372680664,11.018545150756836,11.332000732421875,11.006521224975586,11.406999588012695,10.945999145507812)
                lineTo(13.686999320983887,9.11199951171875)
                curveTo(13.870038032531738,8.964678764343262,14.130960464477539,8.964678764343262,14.31399917602539,9.11199951171875)
                lineTo(16.5939998626709,10.945999145507812)
                curveTo(16.66901397705078,11.005901336669922,16.771703720092773,11.017560005187988,16.85823631286621,10.975997924804688)
                curveTo(16.94477081298828,10.934436798095703,16.999862670898438,10.846996307373047,17.0,10.750999450683594)
                lineTo(17.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,3.0)
                lineTo(19.0,3.0)
                lineTo(21.0,3.0)
                lineTo(21.0,21.0)
                lineTo(19.0,21.0)
                lineTo(5.0,21.0)
                lineTo(3.0,21.0)
                lineTo(3.0,3.0)
                lineTo(5.0,3.0)
                close()
            }
}

public val LucideIcons.All.SquareBookmarkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquareBookmark: ImageVector
    @Composable get() = SquareBookmarkDefinition.asImageVector()
