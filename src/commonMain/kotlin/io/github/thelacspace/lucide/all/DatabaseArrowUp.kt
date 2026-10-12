package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DatabaseArrowUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0,22.0)
                lineTo(19.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,12.53600025177002)
                lineTo(21.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,19.0)
                lineTo(19.0,16.0)
                lineTo(16.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,12.0)
                curveTo(3.00003981590271,12.940420150756836,4.323023319244385,13.826416015625,6.573863983154297,14.393399238586426)
                curveTo(8.824705123901367,14.960381507873535,11.742907524108887,15.14273452758789,14.456999778747559,14.88599967956543)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,5.0)
                lineTo(3.0,19.0)
                curveTo(2.9997000694274902,19.872392654418945,4.138664245605469,20.701618194580078,6.120068550109863,21.271574020385742)
                curveTo(8.101473808288574,21.84153175354004,10.72903823852539,22.09575653076172,13.317999839782715,21.968000411987305)
            }
}

public val LucideIcons.All.DatabaseArrowUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DatabaseArrowUp: ImageVector
    @Composable get() = DatabaseArrowUpDefinition.asImageVector()
