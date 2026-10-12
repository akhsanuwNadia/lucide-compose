package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Command") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,6.0f)
                lineTo(15.0f,18.0f)
                curveTo(15.0f,19.656855f,16.343145f,21.0f,18.0f,21.0f)
                curveTo(19.656855f,21.0f,21.0f,19.656855f,21.0f,18.0f)
                curveTo(21.0f,16.343145f,19.656855f,15.0f,18.0f,15.0f)
                lineTo(6.0f,15.0f)
                curveTo(4.343146f,15.0f,3.0f,16.343145f,3.0f,18.0f)
                curveTo(3.0f,19.656855f,4.343146f,21.0f,6.0f,21.0f)
                curveTo(7.656854f,21.0f,9.0f,19.656855f,9.0f,18.0f)
                lineTo(9.0f,6.0f)
                curveTo(9.0f,4.343146f,7.656854f,3.0f,6.0f,3.0f)
                curveTo(4.343146f,3.0f,3.0f,4.343146f,3.0f,6.0f)
                curveTo(3.0f,7.656854f,4.343146f,9.0f,6.0f,9.0f)
                lineTo(18.0f,9.0f)
                curveTo(19.656855f,9.0f,21.0f,7.656854f,21.0f,6.0f)
                curveTo(21.0f,4.343146f,19.656855f,3.0f,18.0f,3.0f)
                curveTo(16.343145f,3.0f,15.0f,4.343146f,15.0f,6.0f)
            }
}

public val LucideIcons.All.CommandDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Command: ImageVector
    @Composable get() = CommandDefinition.asImageVector()
