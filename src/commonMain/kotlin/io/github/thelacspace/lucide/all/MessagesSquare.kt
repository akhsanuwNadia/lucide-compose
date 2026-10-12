package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessagesSquare") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,10.0)
                curveTo(16.0,11.104569435119629,15.104569435119629,12.0,14.0,12.0)
                lineTo(6.828000068664551,12.0)
                curveTo(6.297610282897949,12.000113487243652,5.788985252380371,12.210901260375977,5.414000034332275,12.586000442504883)
                lineTo(3.2120001316070557,14.788000106811523)
                curveTo(3.0089430809020996,14.991020202636719,2.703591823577881,15.05174732208252,2.438307285308838,14.94186782836914)
                curveTo(2.173022508621216,14.831989288330078,2.0000369548797607,14.573140144348145,2.0,14.28600025177002)
                lineTo(2.0,4.0)
                curveTo(2.0,2.895430564880371,2.895430564880371,2.0,4.0,2.0)
                lineTo(14.0,2.0)
                curveTo(15.104569435119629,2.0,16.0,2.895430564880371,16.0,4.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,9.0)
                curveTo(21.104570388793945,9.0,22.0,9.895430564880371,22.0,11.0)
                lineTo(22.0,21.285999298095703)
                curveTo(21.999963760375977,21.573139190673828,21.82697868347168,21.831989288330078,21.56169319152832,21.94186782836914)
                curveTo(21.29640769958496,22.051746368408203,20.991056442260742,21.99102020263672,20.788000106811523,21.788000106811523)
                lineTo(18.586000442504883,19.586000442504883)
                curveTo(18.211015701293945,19.210901260375977,17.702390670776367,19.00011444091797,17.172000885009766,19.0)
                lineTo(10.0,19.0)
                curveTo(8.895430564880371,19.0,8.0,18.104570388793945,8.0,17.0)
                lineTo(8.0,16.0)
            }
}

public val LucideIcons.All.MessagesSquareDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessagesSquare: ImageVector
    @Composable get() = MessagesSquareDefinition.asImageVector()
