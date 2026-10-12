package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CheckCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0,6.0)
                lineTo(7.0,17.0)
                lineTo(2.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,10.0)
                lineTo(14.5,17.5)
                lineTo(13.0,16.0)
            }
}

public val LucideIcons.All.CheckCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CheckCheck: ImageVector
    @Composable get() = CheckCheckDefinition.asImageVector()
