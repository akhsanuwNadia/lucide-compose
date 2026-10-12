package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LoaderCircle") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.0,12.0)
                curveTo(20.99980926513672,15.898981094360352,18.489065170288086,19.35442543029785,14.780876159667969,20.55915641784668)
                curveTo(11.072685241699219,21.763887405395508,7.010478496551514,20.443889617919922,4.718764305114746,17.28951072692871)
                curveTo(2.4270503520965576,14.135133743286133,2.427081346511841,9.863842964172363,4.718841075897217,6.709498882293701)
                curveTo(7.010601043701172,3.555154323577881,11.072827339172363,2.2352144718170166,14.781000137329102,3.439999580383301)
            }
}

public val LucideIcons.All.LoaderCircleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LoaderCircle: ImageVector
    @Composable get() = LoaderCircleDefinition.asImageVector()
