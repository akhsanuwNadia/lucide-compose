package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MegaphoneOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.63599967956543,6.0)
                curveTo(14.45943832397461,5.934791564941406,17.18484878540039,4.951902866363525,19.399999618530273,3.200000047683716)
                curveTo(19.703018188476562,2.9727365970611572,20.108428955078125,2.936180591583252,20.447214126586914,3.105572462081909)
                curveTo(20.78599739074707,3.2749645709991455,21.0,3.621227741241455,21.0,4.0)
                lineTo(21.0,15.343999862670898)
            }
            lucidePath(strokeWidth) {
                moveTo(14.378000259399414,14.357000350952148)
                curveTo(13.272459983825684,14.090770721435547,12.136767387390137,13.970746994018555,11.0,14.0)
                lineTo(5.0,14.0)
                curveTo(3.895430564880371,14.0,3.0,13.104569435119629,3.0,12.0)
                lineTo(3.0,8.0)
                curveTo(3.0,6.895430564880371,3.895430564880371,6.0,5.0,6.0)
                lineTo(6.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,14.0)
                curveTo(5.999999523162842,16.59644317626953,6.84213399887085,19.122846603393555,8.399999618530273,21.200000762939453)
                curveTo(9.06458568572998,22.077909469604492,10.313773155212402,22.253515243530273,11.194644927978516,21.59286117553711)
                curveTo(12.075515747070312,20.932207107543945,12.256707191467285,19.683818817138672,11.59999942779541,18.80000114440918)
                curveTo(10.561422348022461,17.415231704711914,10.0,15.730961799621582,10.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,8.0)
                lineTo(8.0,14.0)
            }
}

public val LucideIcons.All.MegaphoneOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MegaphoneOff: ImageVector
    @Composable get() = MegaphoneOffDefinition.asImageVector()
