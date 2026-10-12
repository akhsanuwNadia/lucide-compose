package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Euro") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,10.0)
                lineTo(16.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,14.0)
                lineTo(13.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,6.0)
                curveTo(17.57706642150879,4.707642078399658,15.722210884094238,3.9942357540130615,13.800000190734863,4.0)
                curveTo(11.704736709594727,4.0263543128967285,9.705778121948242,4.884056091308594,8.242958068847656,6.3843841552734375)
                curveTo(6.7801384925842285,7.884711742401123,5.9733099937438965,9.904740333557129,6.0,12.0)
                curveTo(6.0,16.399999618530273,9.5,20.0,13.800000190734863,20.0)
                curveTo(15.800000190734863,20.0,17.600000381469727,19.200000762939453,19.0,18.0)
            }
}

public val LucideIcons.All.EuroDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Euro: ImageVector
    @Composable get() = EuroDefinition.asImageVector()
