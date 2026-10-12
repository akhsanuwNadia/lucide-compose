package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Martini") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,12.0)
                lineTo(4.206999778747559,4.206999778747559)
                curveTo(4.004735469818115,4.004796504974365,3.944218158721924,3.7006499767303467,4.053674697875977,3.436422348022461)
                curveTo(4.163131237030029,3.172194719314575,4.4209980964660645,2.99993896484375,4.706999778747559,3.0)
                lineTo(19.292999267578125,3.0)
                curveTo(19.57900047302246,2.99993896484375,19.836868286132812,3.172194719314575,19.946325302124023,3.436422348022461)
                curveTo(20.0557804107666,3.7006499767303467,19.995264053344727,4.004796504974365,19.792999267578125,4.206999778747559)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,12.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,22.0)
                lineTo(17.0,22.0)
            }
}

public val LucideIcons.All.MartiniDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Martini: ImageVector
    @Composable get() = MartiniDefinition.asImageVector()
