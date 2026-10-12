package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CheckCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0f,6.0f)
                lineTo(7.0f,17.0f)
                lineTo(2.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0f,10.0f)
                lineTo(14.5f,17.5f)
                lineTo(13.0f,16.0f)
            }
}

public val LucideIcons.All.CheckCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CheckCheck: ImageVector
    @Composable get() = CheckCheckDefinition.asImageVector()
