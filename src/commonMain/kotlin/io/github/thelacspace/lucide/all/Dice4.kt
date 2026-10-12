package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Dice4") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0,3.0)
                lineTo(19.0,3.0)
                curveTo(20.104570388793945,3.0,21.0,3.895430564880371,21.0,5.0)
                lineTo(21.0,19.0)
                curveTo(21.0,20.104570388793945,20.104570388793945,21.0,19.0,21.0)
                lineTo(5.0,21.0)
                curveTo(3.895430564880371,21.0,3.0,20.104570388793945,3.0,19.0)
                lineTo(3.0,5.0)
                curveTo(3.0,3.895430564880371,3.895430564880371,3.0,5.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,8.0)
                lineTo(16.010000228881836,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,8.0)
                lineTo(8.010000228881836,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,16.0)
                lineTo(8.010000228881836,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,16.0)
                lineTo(16.010000228881836,16.0)
            }
}

public val LucideIcons.All.Dice4Definition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Dice4: ImageVector
    @Composable get() = Dice4Definition.asImageVector()
