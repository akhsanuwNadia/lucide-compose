package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Droplet") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,22.0f)
                curveTo(15.8659935f,22.0f,19.0f,18.865993f,19.0f,15.0f)
                curveTo(19.0f,13.0f,18.0f,11.1f,16.0f,9.5f)
                curveTo(14.0f,7.8999996f,12.5f,5.5f,12.0f,3.0f)
                curveTo(11.5f,5.5f,10.0f,7.9f,8.0f,9.5f)
                curveTo(6.0f,11.1f,5.0f,13.0f,5.0f,15.0f)
                curveTo(5.0f,18.865993f,8.1340065f,22.0f,12.0f,22.0f)
                close()
            }
}

public val LucideIcons.All.DropletDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Droplet: ImageVector
    @Composable get() = DropletDefinition.asImageVector()
