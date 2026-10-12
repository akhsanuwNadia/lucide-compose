package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Video") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,13.0f)
                lineTo(21.223f,16.482f)
                curveTo(21.376411f,16.58409f,21.573544f,16.59352f,21.736f,16.506542f)
                curveTo(21.898458f,16.419563f,21.999905f,16.250277f,22.0f,16.066f)
                lineTo(22.0f,7.87f)
                curveTo(22.000053f,7.690927f,21.904337f,7.525499f,21.749062f,7.4362984f)
                curveTo(21.593786f,7.347098f,21.402664f,7.347747f,21.248f,7.4379997f)
                lineTo(16.0f,10.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,6.0f)
                lineTo(14.0f,6.0f)
                lineTo(16.0f,6.0f)
                lineTo(16.0f,18.0f)
                lineTo(14.0f,18.0f)
                lineTo(4.0f,18.0f)
                lineTo(2.0f,18.0f)
                lineTo(2.0f,6.0f)
                lineTo(4.0f,6.0f)
                close()
            }
}

public val LucideIcons.All.VideoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Video: ImageVector
    @Composable get() = VideoDefinition.asImageVector()
