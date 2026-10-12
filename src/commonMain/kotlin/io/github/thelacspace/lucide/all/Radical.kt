package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Radical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,12.0f)
                lineTo(6.2799997f,12.0f)
                curveTo(6.710239f,12.000327f,7.0920444f,12.275806f,7.2279997f,12.684f)
                lineTo(9.526f,20.618f)
                curveTo(9.597378f,20.829155f,9.799903f,20.967566f,10.022563f,20.95736f)
                curveTo(10.245222f,20.947155f,10.4342375f,20.790798f,10.486f,20.574f)
                lineTo(13.82f,4.771f)
                curveTo(13.926148f,4.3197837f,14.328466f,4.0006614f,14.792f,4.0f)
                lineTo(21.0f,4.0f)
            }
}

public val LucideIcons.All.RadicalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Radical: ImageVector
    @Composable get() = RadicalDefinition.asImageVector()
