package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Pause") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,3.0)
                lineTo(18.0,3.0)
                lineTo(19.0,3.0)
                lineTo(19.0,21.0)
                lineTo(18.0,21.0)
                lineTo(15.0,21.0)
                lineTo(14.0,21.0)
                lineTo(14.0,3.0)
                lineTo(15.0,3.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,3.0)
                lineTo(9.0,3.0)
                lineTo(10.0,3.0)
                lineTo(10.0,21.0)
                lineTo(9.0,21.0)
                lineTo(6.0,21.0)
                lineTo(5.0,21.0)
                lineTo(5.0,3.0)
                lineTo(6.0,3.0)
                close()
            }
}

public val LucideIcons.All.PauseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Pause: ImageVector
    @Composable get() = PauseDefinition.asImageVector()
