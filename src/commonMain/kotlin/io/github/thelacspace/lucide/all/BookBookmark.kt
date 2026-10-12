package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookBookmark") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,2.0)
                lineTo(10.0,9.750999450683594)
                curveTo(9.999828338623047,9.847373008728027,10.055066108703613,9.935262680053711,10.141979217529297,9.976903915405273)
                curveTo(10.228891372680664,10.018545150756836,10.332000732421875,10.006521224975586,10.406999588012695,9.945999145507812)
                lineTo(12.686999320983887,8.11199951171875)
                curveTo(12.870038032531738,7.96467924118042,13.130960464477539,7.96467924118042,13.31399917602539,8.11199951171875)
                lineTo(15.593998908996582,9.945999145507812)
                curveTo(15.669013023376465,10.005902290344238,15.771702766418457,10.017560958862305,15.858236312866211,9.975998878479004)
                curveTo(15.944769859313965,9.93443775177002,15.999863624572754,9.846997261047363,16.0,9.75100040435791)
                lineTo(16.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,19.5)
                lineTo(4.0,4.5)
                curveTo(4.0,3.119288206100464,5.119287967681885,2.0,6.5,2.0)
                lineTo(19.0,2.0)
                curveTo(19.552284240722656,2.0,20.0,2.4477152824401855,20.0,3.0)
                lineTo(20.0,21.0)
                curveTo(20.0,21.552284240722656,19.552284240722656,22.0,19.0,22.0)
                lineTo(6.5,22.0)
                curveTo(5.123652458190918,21.993844985961914,4.011155605316162,20.876361846923828,4.011155605316162,19.5)
                curveTo(4.011155605316162,18.123638153076172,5.123652458190918,17.006155014038086,6.5,17.0)
                lineTo(20.0,17.0)
            }
}

public val LucideIcons.All.BookBookmarkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookBookmark: ImageVector
    @Composable get() = BookBookmarkDefinition.asImageVector()
