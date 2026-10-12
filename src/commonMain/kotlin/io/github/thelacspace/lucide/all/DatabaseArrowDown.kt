package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DatabaseArrowDown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,19.0)
                lineTo(19.0,22.0)
                lineTo(22.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,16.0)
                lineTo(19.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,12.53600025177002)
                lineTo(21.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,12.0)
                curveTo(3.000237226486206,12.985273361206055,4.451841354370117,13.90770149230957,6.8835601806640625,14.467823028564453)
                curveTo(9.315278053283691,15.027944564819336,12.417084693908691,15.154348373413086,15.182000160217285,14.805999755859375)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,5.0)
                lineTo(3.0,19.0)
                curveTo(2.9997000694274902,19.872392654418945,4.138664245605469,20.701618194580078,6.120068550109863,21.271574020385742)
                curveTo(8.101473808288574,21.84153175354004,10.72903823852539,22.09575653076172,13.317999839782715,21.968000411987305)
            }
}

public val LucideIcons.All.DatabaseArrowDownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DatabaseArrowDown: ImageVector
    @Composable get() = DatabaseArrowDownDefinition.asImageVector()
