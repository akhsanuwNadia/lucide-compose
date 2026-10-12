package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Pause") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,3.0f)
                lineTo(18.0f,3.0f)
                lineTo(19.0f,3.0f)
                lineTo(19.0f,21.0f)
                lineTo(18.0f,21.0f)
                lineTo(15.0f,21.0f)
                lineTo(14.0f,21.0f)
                lineTo(14.0f,3.0f)
                lineTo(15.0f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,3.0f)
                lineTo(9.0f,3.0f)
                lineTo(10.0f,3.0f)
                lineTo(10.0f,21.0f)
                lineTo(9.0f,21.0f)
                lineTo(6.0f,21.0f)
                lineTo(5.0f,21.0f)
                lineTo(5.0f,3.0f)
                lineTo(6.0f,3.0f)
                close()
            }
}

public val LucideIcons.All.PauseDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Pause: ImageVector
    @Composable get() = PauseDefinition.asImageVector()
