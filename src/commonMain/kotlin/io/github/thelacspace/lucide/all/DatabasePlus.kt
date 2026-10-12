package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DatabasePlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0,16.0)
                lineTo(19.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,12.53600025177002)
                lineTo(21.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,19.0)
                lineTo(16.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,12.0)
                curveTo(3.000088930130005,12.985325813293457,4.4517059326171875,13.907818794250488,6.88355016708374,14.467970848083496)
                curveTo(9.315394401550293,15.028122901916504,12.417388916015625,15.154511451721191,15.18239974975586,14.806099891662598)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,5.0)
                lineTo(3.0,19.0)
                curveTo(2.9997000694274902,19.872392654418945,4.138664245605469,20.701618194580078,6.120068550109863,21.271574020385742)
                curveTo(8.101473808288574,21.84153175354004,10.72903823852539,22.09575653076172,13.317999839782715,21.968000411987305)
            }
}

public val LucideIcons.All.DatabasePlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DatabasePlus: ImageVector
    @Composable get() = DatabasePlusDefinition.asImageVector()
