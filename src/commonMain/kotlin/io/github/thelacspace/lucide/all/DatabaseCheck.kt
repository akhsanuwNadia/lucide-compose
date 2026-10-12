package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DatabaseCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,19.0)
                lineTo(18.0,21.0)
                lineTo(22.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,13.126999855041504)
                lineTo(21.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,12.0)
                curveTo(3.0221588611602783,13.651617050170898,7.045098781585693,14.986613273620605,12.0,14.986613273620605)
                curveTo(16.95490074157715,14.986613273620605,20.977840423583984,13.651617050170898,21.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,5.0)
                lineTo(3.0,19.0)
                curveTo(2.9997000694274902,19.872392654418945,4.138664245605469,20.701618194580078,6.120068550109863,21.271574020385742)
                curveTo(8.101473808288574,21.84153175354004,10.72903823852539,22.09575653076172,13.317999839782715,21.968000411987305)
            }
}

public val LucideIcons.All.DatabaseCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DatabaseCheck: ImageVector
    @Composable get() = DatabaseCheckDefinition.asImageVector()
