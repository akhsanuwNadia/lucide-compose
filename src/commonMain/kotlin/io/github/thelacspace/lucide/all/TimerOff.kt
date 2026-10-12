package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TimerOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,2.0)
                lineTo(14.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.599999904632568,11.0)
                curveTo(3.3613052368164062,13.97756576538086,4.0315680503845215,17.40773582458496,6.300000190734863,19.700000762939453)
                curveTo(8.592265129089355,21.968433380126953,12.02243423461914,22.638696670532227,15.0,21.400001525878906)
            }
            lucidePath(strokeWidth) {
                moveTo(7.400000095367432,7.400000095367432)
                curveTo(10.615700721740723,5.168879985809326,14.97353744506836,5.591970920562744,17.700000762939453,8.399999618530273)
                curveTo(20.42160987854004,11.137564659118652,20.80019187927246,15.428156852722168,18.600000381469727,18.599998474121094)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,12.0)
                lineTo(12.0,10.0)
            }
}

public val LucideIcons.All.TimerOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TimerOff: ImageVector
    @Composable get() = TimerOffDefinition.asImageVector()
