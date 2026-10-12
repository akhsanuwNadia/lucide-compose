package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CandyCane") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.800000190734863,5.0)
                lineTo(12.91100025177002,9.222999572753906)
            }
            lucidePath(strokeWidth) {
                moveTo(17.75,7.0)
                lineTo(15.0,2.0999999046325684)
            }
            lucidePath(strokeWidth) {
                moveTo(4.874000072479248,14.647000312805176)
                lineTo(6.99399995803833,18.887001037597656)
            }
            lucidePath(strokeWidth) {
                moveTo(5.699999809265137,21.0)
                curveTo(5.1451520919799805,21.960981369018555,3.917915105819702,22.292736053466797,2.9544620513916016,21.742191314697266)
                curveTo(1.9910088777542114,21.191646575927734,1.6537693738937378,19.965906143188477,2.1999998092651367,19.0)
                lineTo(10.800000190734863,5.0)
                curveTo(12.464420318603516,2.144582748413086,16.123781204223633,1.1715691089630127,18.986614227294922,2.8232028484344482)
                curveTo(21.849445343017578,4.474836826324463,22.838815689086914,8.129810333251953,21.200000762939453,11.0)
                curveTo(20.84526824951172,11.623884201049805,20.18345069885254,12.009872436523438,19.465770721435547,12.011444091796875)
                curveTo(18.748092651367188,12.013016700744629,18.0845890045166,11.629932403564453,17.727127075195312,11.007608413696289)
                curveTo(17.369665145874023,10.385284423828125,17.373050689697266,9.619139671325684,17.736000061035156,9.0)
                curveTo(18.098976135253906,8.380858421325684,18.102378845214844,7.614696025848389,17.744915008544922,6.992355823516846)
                curveTo(17.387451171875,6.370015621185303,16.723934173583984,5.986921787261963,16.00623893737793,5.98850154876709)
                curveTo(15.288545608520508,5.990081310272217,14.626720428466797,6.376091957092285,14.272000312805176,7.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.906000137329102,9.711999893188477)
                lineTo(9.91100025177002,14.12299919128418)
            }
}

public val LucideIcons.All.CandyCaneDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CandyCane: ImageVector
    @Composable get() = CandyCaneDefinition.asImageVector()
