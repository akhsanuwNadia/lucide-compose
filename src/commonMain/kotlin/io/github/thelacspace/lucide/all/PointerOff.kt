package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PointerOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,4.5)
                lineTo(10.0,4.0)
                curveTo(9.999842643737793,3.3977293968200684,9.728285789489746,2.8275973796844482,9.260748863220215,2.447941303253174)
                curveTo(8.793210983276367,2.0682854652404785,8.179479598999023,1.9195345640182495,7.590000152587891,2.0429999828338623)
            }
            lucidePath(strokeWidth) {
                moveTo(13.899999618530273,8.399999618530273)
                curveTo(13.710034370422363,7.792404651641846,13.242162704467773,7.31153678894043,12.639999389648438,7.104999542236328)
            }
            lucidePath(strokeWidth) {
                moveTo(21.700000762939453,16.200000762939453)
                curveTo(21.901775360107422,15.484176635742188,22.002748489379883,14.74371337890625,22.0,14.0)
                lineTo(22.0,11.0)
                curveTo(22.003204345703125,10.28333854675293,21.622709274291992,9.619739532470703,21.00259017944336,9.260479927062988)
                curveTo(20.38247299194336,8.90122127532959,19.61752700805664,8.90122127532959,18.99740982055664,9.260479927062988)
                curveTo(18.377290725708008,9.619739532470703,17.996795654296875,10.28333854675293,18.0,11.0)
                lineTo(18.0,10.0)
                curveTo(17.99959945678711,9.129938125610352,17.436744689941406,8.359953880310059,16.607837677001953,8.095525741577148)
                curveTo(15.7789306640625,7.831097602844238,14.874166488647461,8.132899284362793,14.369999885559082,8.842000007629395)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,15.0)
                lineTo(5.199999809265137,13.199999809265137)
                curveTo(4.401206016540527,12.49179458618164,3.1870176792144775,12.535784721374512,2.4415674209594727,13.29993724822998)
                curveTo(1.6961170434951782,14.064090728759766,1.6822218894958496,15.278996467590332,2.4099998474121094,16.059999465942383)
                lineTo(6.0,19.700000762939453)
                curveTo(7.572237014770508,21.29986572265625,9.761209487915039,22.13897132873535,12.0,22.0)
                lineTo(14.0,22.0)
                curveTo(16.121761322021484,22.000076293945312,18.156648635864258,21.157272338867188,19.656999588012695,19.656999588012695)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,6.0)
                lineTo(6.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
}

public val LucideIcons.All.PointerOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PointerOff: ImageVector
    @Composable get() = PointerOffDefinition.asImageVector()
