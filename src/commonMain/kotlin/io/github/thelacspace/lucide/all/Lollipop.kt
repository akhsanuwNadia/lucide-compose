package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Lollipop") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,11.0)
                curveTo(2.98717999458313,13.866647720336914,4.509161472320557,16.521041870117188,6.989636421203613,17.958078384399414)
                curveTo(9.470111846923828,19.395116806030273,12.529888153076172,19.395116806030273,15.010363578796387,17.958078384399414)
                curveTo(17.4908390045166,16.521041870117188,19.012819290161133,13.866647720336914,19.0,11.0)
                curveTo(19.012819290161133,8.133352279663086,17.4908390045166,5.4789581298828125,15.010363578796387,4.0419206619262695)
                curveTo(12.529888153076172,2.6048834323883057,9.470111846923828,2.6048834323883057,6.989636421203613,4.0419206619262695)
                curveTo(4.509161472320557,5.4789581298828125,2.98717999458313,8.133352279663086,3.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,21.0)
                lineTo(16.700000762939453,16.700000762939453)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,11.0)
                curveTo(11.004923820495605,12.101078033447266,11.898910522460938,12.99107551574707,13.0,12.99107551574707)
                curveTo(14.101089477539062,12.99107551574707,14.995076179504395,12.101078033447266,15.0,11.0)
                curveTo(14.990151405334473,8.797843933105469,13.202178001403809,7.017848491668701,11.0,7.017848491668701)
                curveTo(8.797821998596191,7.017848491668701,7.009848594665527,8.797843933105469,7.0,11.0)
                curveTo(7.014772415161133,14.303234100341797,9.696732521057129,16.97322654724121,13.0,16.97322654724121)
                curveTo(16.303268432617188,16.97322654724121,18.985227584838867,14.303234100341797,19.0,11.0)
            }
}

public val LucideIcons.All.LollipopDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Lollipop: ImageVector
    @Composable get() = LollipopDefinition.asImageVector()
