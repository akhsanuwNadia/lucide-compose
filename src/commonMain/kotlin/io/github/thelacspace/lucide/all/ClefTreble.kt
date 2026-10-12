package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClefTreble") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.586000442504883,21.413999557495117)
                curveTo(11.20720100402832,22.034765243530273,12.16068172454834,22.177669525146484,12.936574935913086,21.766292572021484)
                curveTo(13.712469100952148,21.354917526245117,14.129230499267578,20.485519409179688,13.964000701904297,19.62299919128418)
                lineTo(11.03600025177002,4.376999855041504)
                curveTo(10.856210708618164,3.4415462017059326,11.361130714416504,2.5091073513031006,12.242780685424805,2.148427963256836)
                curveTo(13.124431610107422,1.7877484560012817,14.138113021850586,2.0989344120025635,14.665525436401367,2.892177104949951)
                curveTo(15.192937850952148,3.685419797897339,15.087699890136719,4.7405548095703125,14.414000511169434,5.413999557495117)
                curveTo(12.413999557495117,7.414000034332275,7.0,8.0,7.0,13.0)
                curveTo(7.0,15.76142406463623,9.23857593536377,18.0,12.0,18.0)
                curveTo(14.76142406463623,18.0,17.0,16.209138870239258,17.0,14.0)
                curveTo(17.0,12.343145370483398,15.656854629516602,11.0,14.0,11.0)
                curveTo(12.343145370483398,11.0,11.0,11.895430564880371,11.0,13.0)
            }
}

public val LucideIcons.All.ClefTrebleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClefTreble: ImageVector
    @Composable get() = ClefTrebleDefinition.asImageVector()
