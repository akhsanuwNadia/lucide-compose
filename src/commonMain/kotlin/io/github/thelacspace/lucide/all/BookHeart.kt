package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookHeart") { strokeWidth ->
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
            lucidePath(strokeWidth) {
                moveTo(8.619999885559082,9.800000190734863)
                curveTo(8.046981811523438,9.202570915222168,7.848299503326416,8.338743209838867,8.1027250289917,7.551000118255615)
                curveTo(8.357150077819824,6.763257026672363,9.023585319519043,6.178844928741455,9.837806701660156,6.02946662902832)
                curveTo(10.652029037475586,5.880087852478027,11.482514381408691,6.189872741699219,12.0,6.835999965667725)
                curveTo(12.519877433776855,6.1967387199401855,13.347599029541016,5.892779350280762,14.157636642456055,6.04366397857666)
                curveTo(14.967674255371094,6.194548606872559,15.63044548034668,6.776140213012695,15.885293960571289,7.559708595275879)
                curveTo(16.1401424407959,8.343276977539062,15.94629955291748,9.203474998474121,15.380000114440918,9.802000045776367)
                lineTo(12.753999710083008,12.657999992370605)
                curveTo(12.564449310302734,12.87625503540039,12.289575576782227,13.001598358154297,12.000499725341797,13.001598358154297)
                curveTo(11.711423873901367,13.001598358154297,11.43655014038086,12.87625503540039,11.246999740600586,12.657999992370605)
                close()
            }
}

public val LucideIcons.All.BookHeartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookHeart: ImageVector
    @Composable get() = BookHeartDefinition.asImageVector()
