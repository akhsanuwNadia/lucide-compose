package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Droplet") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,22.0)
                curveTo(15.86599349975586,22.0,19.0,18.86599349975586,19.0,15.0)
                curveTo(19.0,13.0,18.0,11.100000381469727,16.0,9.5)
                curveTo(14.0,7.899999618530273,12.5,5.5,12.0,3.0)
                curveTo(11.5,5.5,10.0,7.900000095367432,8.0,9.5)
                curveTo(6.0,11.100000381469727,5.0,13.0,5.0,15.0)
                curveTo(5.0,18.86599349975586,8.13400650024414,22.0,12.0,22.0)
                close()
            }
}

public val LucideIcons.All.DropletDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Droplet: ImageVector
    @Composable get() = DropletDefinition.asImageVector()
