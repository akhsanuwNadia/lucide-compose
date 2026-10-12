package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Mosque") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.267999649047852,2.0)
                curveTo(11.721726417541504,2.956271171569824,12.051143646240234,4.174224853515625,13.004961967468262,4.724769592285156)
                curveTo(13.958780288696289,5.275313854217529,15.178194999694824,4.9513468742370605,15.732999801635742,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,5.0)
                lineTo(14.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,22.0)
                lineTo(16.0,19.0)
                curveTo(15.995076179504395,17.898921966552734,15.101089477539062,17.00892448425293,14.0,17.00892448425293)
                curveTo(12.898910522460938,17.00892448425293,12.004923820495605,17.898921966552734,12.0,19.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,13.0)
                curveTo(20.33799934387207,11.503000259399414,19.333999633789062,10.246999740600586,18.100000381469727,9.369999885559082)
                curveTo(16.825000762939453,8.470000267028809,15.42199993133545,8.0,14.0,8.0)
                curveTo(12.57800006866455,8.0,11.173999786376953,8.470000267028809,9.899999618530273,9.369999885559082)
                curveTo(8.668000221252441,10.248000144958496,7.663000106811523,11.503999710083008,7.0,13.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,9.0)
                lineTo(7.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,22.0)
                lineTo(7.0,6.0)
                curveTo(7.0,4.426213264465332,6.259029388427734,2.9442718029022217,5.0,2.0)
                curveTo(3.7409708499908447,2.9442718029022217,3.0,4.426213264465332,3.0,6.0)
                lineTo(3.0,20.0)
                curveTo(3.0,21.104570388793945,3.895430564880371,22.0,5.0,22.0)
                lineTo(19.0,22.0)
                curveTo(20.104570388793945,22.0,21.0,21.104570388793945,21.0,20.0)
                lineTo(21.0,13.0)
            }
}

public val LucideIcons.All.MosqueDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Mosque: ImageVector
    @Composable get() = MosqueDefinition.asImageVector()
