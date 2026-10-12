package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BotMessageSquare") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,6.0)
                lineTo(12.0,2.0)
                lineTo(8.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,11.0)
                lineTo(15.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                lineTo(4.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,12.0)
                lineTo(22.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,16.0)
                curveTo(20.0,17.104570388793945,19.104570388793945,18.0,18.0,18.0)
                lineTo(8.82800006866455,18.0)
                curveTo(8.29761028289795,18.000112533569336,7.788985252380371,18.210901260375977,7.414000034332275,18.586000442504883)
                lineTo(5.211999893188477,20.788000106811523)
                curveTo(5.008942604064941,20.99102020263672,4.703591346740723,21.051746368408203,4.43830680847168,20.94186782836914)
                curveTo(4.173022270202637,20.831989288330078,4.000036716461182,20.573139190673828,4.0,20.285999298095703)
                lineTo(4.0,8.0)
                curveTo(4.0,6.895430564880371,4.895430564880371,6.0,6.0,6.0)
                lineTo(18.0,6.0)
                curveTo(19.104570388793945,6.0,20.0,6.895430564880371,20.0,8.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,11.0)
                lineTo(9.0,13.0)
            }
}

public val LucideIcons.All.BotMessageSquareDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BotMessageSquare: ImageVector
    @Composable get() = BotMessageSquareDefinition.asImageVector()
