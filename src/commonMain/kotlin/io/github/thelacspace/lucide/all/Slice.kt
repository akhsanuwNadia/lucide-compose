package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Slice") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,16.586f)
                lineTo(11.0f,19.0f)
                curveTo(11.0f,19.552284f,10.552285f,20.0f,10.0f,20.0f)
                lineTo(2.0f,20.0f)
                lineTo(18.37f,3.63f)
                curveTo(18.905094f,3.0900998f,19.688164f,2.8777726f,20.422697f,3.0734172f)
                curveTo(21.15723f,3.2690616f,21.73094f,3.8427699f,21.926584f,4.5773034f)
                curveTo(22.122229f,5.311837f,21.9099f,6.0949073f,21.37f,6.63f)
                lineTo(11.707001f,16.293f)
                curveTo(11.316501f,16.68338f,10.683501f,16.68338f,10.293001f,16.293f)
                lineTo(8.0f,14.0f)
            }
}

public val LucideIcons.All.SliceDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Slice: ImageVector
    @Composable get() = SliceDefinition.asImageVector()
