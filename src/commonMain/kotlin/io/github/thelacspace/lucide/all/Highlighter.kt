package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Highlighter") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(9.0,11.0)
                lineTo(3.0,17.0)
                lineTo(3.0,20.0)
                lineTo(12.0,20.0)
                lineTo(15.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,12.0)
                lineTo(17.399999618530273,16.600000381469727)
                curveTo(16.622312545776367,17.362285614013672,15.377686500549316,17.362285614013672,14.59999942779541,16.600000381469727)
                lineTo(9.399999618530273,11.40000057220459)
                curveTo(8.637713432312012,10.622313499450684,8.637713432312012,9.377687454223633,9.399999618530273,8.600000381469727)
                lineTo(14.0,4.0)
            }
}

public val LucideIcons.All.HighlighterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Highlighter: ImageVector
    @Composable get() = HighlighterDefinition.asImageVector()
