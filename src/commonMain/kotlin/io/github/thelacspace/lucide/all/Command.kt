package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Command") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,6.0)
                lineTo(15.0,18.0)
                curveTo(15.0,19.6568546295166,16.3431453704834,21.0,18.0,21.0)
                curveTo(19.6568546295166,21.0,21.0,19.6568546295166,21.0,18.0)
                curveTo(21.0,16.3431453704834,19.6568546295166,15.0,18.0,15.0)
                lineTo(6.0,15.0)
                curveTo(4.343145847320557,15.0,3.0,16.3431453704834,3.0,18.0)
                curveTo(3.0,19.6568546295166,4.343145847320557,21.0,6.0,21.0)
                curveTo(7.656854152679443,21.0,9.0,19.6568546295166,9.0,18.0)
                lineTo(9.0,6.0)
                curveTo(9.0,4.343145847320557,7.656854152679443,3.0,6.0,3.0)
                curveTo(4.343145847320557,3.0,3.0,4.343145847320557,3.0,6.0)
                curveTo(3.0,7.656854152679443,4.343145847320557,9.0,6.0,9.0)
                lineTo(18.0,9.0)
                curveTo(19.6568546295166,9.0,21.0,7.656854152679443,21.0,6.0)
                curveTo(21.0,4.343145847320557,19.6568546295166,3.0,18.0,3.0)
                curveTo(16.3431453704834,3.0,15.0,4.343145847320557,15.0,6.0)
            }
}

public val LucideIcons.All.CommandDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Command: ImageVector
    @Composable get() = CommandDefinition.asImageVector()
