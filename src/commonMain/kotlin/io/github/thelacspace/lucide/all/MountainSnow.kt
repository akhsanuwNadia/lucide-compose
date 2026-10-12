package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MountainSnow") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0f,3.0f)
                lineTo(12.0f,11.0f)
                lineTo(17.0f,6.0f)
                lineTo(22.0f,21.0f)
                lineTo(2.0f,21.0f)
                lineTo(8.0f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.14f,15.08f)
                curveTo(6.7599998f,13.51f,9.379999f,13.65f,12.0f,15.5f)
                curveTo(14.74f,17.44f,17.49f,17.5f,20.23f,15.69f)
            }
}

public val LucideIcons.All.MountainSnowDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MountainSnow: ImageVector
    @Composable get() = MountainSnowDefinition.asImageVector()
