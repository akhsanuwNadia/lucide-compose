package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Gift") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,7.0)
                lineTo(12.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,11.0)
                lineTo(20.0,19.0)
                curveTo(20.0,20.104570388793945,19.104570388793945,21.0,18.0,21.0)
                lineTo(6.0,21.0)
                curveTo(4.895430564880371,21.0,4.0,20.104570388793945,4.0,19.0)
                lineTo(4.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.5,7.0)
                curveTo(6.123652458190918,6.993844985961914,5.011155605316162,5.87636137008667,5.011155605316162,4.5)
                curveTo(5.011155605316162,3.12363862991333,6.123652458190918,2.006155252456665,7.5,2.0)
                curveTo(9.474231719970703,1.9656035900115967,11.259730339050293,3.949491500854492,12.0,7.0)
                curveTo(12.740269660949707,3.949491500854492,14.525768280029297,1.9656035900115967,16.5,2.0)
                curveTo(17.8763484954834,2.006155252456665,18.98884391784668,3.12363862991333,18.98884391784668,4.5)
                curveTo(18.98884391784668,5.87636137008667,17.8763484954834,6.993844985961914,16.5,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,7.0)
                lineTo(20.0,7.0)
                lineTo(21.0,7.0)
                lineTo(21.0,11.0)
                lineTo(20.0,11.0)
                lineTo(4.0,11.0)
                lineTo(3.0,11.0)
                lineTo(3.0,7.0)
                lineTo(4.0,7.0)
                close()
            }
}

public val LucideIcons.All.GiftDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Gift: ImageVector
    @Composable get() = GiftDefinition.asImageVector()
